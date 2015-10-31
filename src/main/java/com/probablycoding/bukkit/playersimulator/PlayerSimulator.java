package com.probablycoding.bukkit.playersimulator;

import com.google.common.base.Charsets;
import com.mojang.authlib.GameProfile;
import net.minecraft.server.v1_8_R3.EntityPlayer;
import net.minecraft.server.v1_8_R3.PlayerList;
import net.minecraft.server.v1_8_R3.WorldServer;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.v1_8_R3.CraftServer;
import org.bukkit.craftbukkit.v1_8_R3.CraftWorld;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;


public class PlayerSimulator extends JavaPlugin {
    private TPSCheck tpsCheck = new TPSCheck();
    private boolean toggle = false;

    @Override
    public void onEnable() {
        getServer().getScheduler().scheduleSyncRepeatingTask(this, tpsCheck, 20, 20);
        getServer().getPluginManager().registerEvents(new HidePlayerListener(this), this);
    }

    @Override
    public void onDisable() {
        getServer().getScheduler().cancelTasks(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String commandLabel, String[] args) {
        if (command.getName().equalsIgnoreCase("spawnbot")) {
            int range = 2000;
            int num = 1;
            if (args.length > 0) {
                num = Integer.parseInt(args[0]);
            }
            if (args.length > 1) {
                range = Integer.parseInt(args[1]);
            }

            for (int i = 0; i < num; i++) {
                Random random = new Random();
                String name = ChatColor.BLUE + "Bot" + random.nextInt(1000) + i;
                WorldServer world = ((CraftWorld) Bukkit.getWorlds().get(0)).getHandle();
                PlayerList playerList = ((CraftServer) Bukkit.getServer()).getHandle();
                UUID uuid = UUID.nameUUIDFromBytes(("OfflinePlayer:" + name).getBytes(Charsets.UTF_8));
                GameProfile gameProfile = new GameProfile(uuid, name);

                EntityPlayer entityplayer = new EntityPlayer(playerList.getServer(), world, gameProfile, new DummyPlayerInteractManager(world));
                new DummyPlayerConnection(playerList.getServer(), new DummyNetworkManager(), entityplayer);

                entityplayer.spawnIn(world);
                entityplayer.playerInteractManager.a((WorldServer) entityplayer.world);
                entityplayer.playerInteractManager.b(world.getWorldData().getGameType());
                entityplayer.setInvisible(true);

                entityplayer.setPosition(random.nextInt(range * 2) - range, 100, random.nextInt(range * 2) - range);

                playerList.players.add(entityplayer);
                world.addEntity(entityplayer);
                playerList.a(entityplayer, entityplayer.u());

                sender.sendMessage("Added player " + entityplayer.getName() + ChatColor.RESET + " at " + entityplayer.locX + ", " + entityplayer.locY + ", " + entityplayer.locZ + ".");
            }

            getServer().getOnlinePlayers().forEach(player -> {
                if (!player.getName().startsWith(ChatColor.BLUE+"Bot")){
                    hideAllBots(player);
                }
            });

            return true;
        }

        if (command.getName().equalsIgnoreCase("killbots")) {
            PlayerList playerList = ((CraftServer) Bukkit.getServer()).getHandle();
            for (EntityPlayer entityplayer : (CopyOnWriteArrayList<EntityPlayer>) playerList.players) {
                if (entityplayer.getName().startsWith(ChatColor.BLUE + "Bot")) {

                    entityplayer.world.kill(entityplayer);
                    WorldServer world = (WorldServer) entityplayer.world;
                    world.getPlayerChunkMap().removePlayer(entityplayer);
                    playerList.players.remove(entityplayer);
                    entityplayer.playerConnection.disconnect("");
                    sender.sendMessage("Disconnected " + entityplayer.getName());
                }
            }
        }

        if (command.getName().equalsIgnoreCase("debug")) {
            toggle = !toggle;
            float tps = 0;
            for (Long l : tpsCheck.history) {
                if (l != null)
                    tps += 20 / (l / 1000);
            }
            tps = tps / tpsCheck.history.size();

            sender.sendMessage("TPS: " + tps + " Loaded chunks: " + Bukkit.getWorlds().get(0).getLoadedChunks().length + " Entities: " + Bukkit.getWorlds().get(0).getEntities().size());
        }
        return false;
    }

    public void hideAllBots(Player player){
        getServer().getOnlinePlayers().forEach(player1 -> {
            if (player.getName().startsWith(ChatColor.BLUE+"Bot")){
                player.hidePlayer(player1);
            }
        });
    }

    public void showAllBots(Player player){
        getServer().getOnlinePlayers().forEach(player1 -> {
            if (player.getName().startsWith(ChatColor.BLUE+"Bot")){
                player.showPlayer(player1);
            }
        });
    }

}
