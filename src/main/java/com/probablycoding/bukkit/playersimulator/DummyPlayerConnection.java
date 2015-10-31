package com.probablycoding.bukkit.playersimulator;

import net.minecraft.server.v1_8_R3.*;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.craftbukkit.v1_8_R3.CraftServer;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;

import java.util.Set;

public class DummyPlayerConnection extends PlayerConnection {
    private boolean disconnected = false;

    public DummyPlayerConnection(MinecraftServer minecraftserver, NetworkManager networkmanager, EntityPlayer entityplayer) {
        super(minecraftserver, networkmanager, entityplayer);
    }

    @Override
    public CraftPlayer getPlayer() {
        return (this.player == null) ? null : this.player.getBukkitEntity();
    }

    @Override
    public NetworkManager a() {
        return super.networkManager;
    }

    public void disconnect(java.lang.String s) {
        WorldServer worldserver = player.u();

        worldserver.kill(player);
        worldserver.getPlayerChunkMap().removePlayer(player);
        ((CraftServer) Bukkit.getServer()).getHandle().players.remove(player);
        this.disconnected = true;
    }

    public boolean isDisconnected() {
        return disconnected;
    }

    @Override
    public void c() {

    }

    @Override
    public void a(double d0, double d1, double d2, float f, float f1, Set<PacketPlayOutPosition.EnumPlayerTeleportFlags> set) {

    }

    @Override
    public void a(PacketPlayInSpectate packetplayinspectate) {

    }

    @Override
    public void a(PacketPlayInResourcePackStatus packetplayinresourcepackstatus) {

    }

    public void a(PacketPlayInSteerVehicle packetplayinsteervehicle) {
    }

    public void a(PacketPlayInFlying packetplayinflying) {
    }

    public void a(double d0, double d1, double d2, float f, float f1) {
    }

    public void teleport(Location dest) {
    }

    public void a(PacketPlayInBlockDig packetplayinblockdig) {
    }

    public void a(PacketPlayInBlockPlace packetplayinblockplace) {
    }

    public void a(IChatBaseComponent ichatbasecomponent) {
    }

    public void sendPacket(Packet packet) {
    }

    public void a(PacketPlayInHeldItemSlot packetplayinhelditemslot) {
    }

    public void a(PacketPlayInChat packetplayinchat) {
    }

    public void chat(String s, boolean async) {
    }

    public void a(PacketPlayInArmAnimation packetplayinarmanimation) {
    }

    public void a(PacketPlayInEntityAction packetplayinentityaction) {
    }

    public void a(PacketPlayInUseEntity packetplayinuseentity) {
    }

    public void a(PacketPlayInClientCommand packetplayinclientcommand) {
    }

    public void a(PacketPlayInCloseWindow packetplayinclosewindow) {
    }

    public void a(PacketPlayInWindowClick packetplayinwindowclick) {
    }

    public void a(PacketPlayInEnchantItem packetplayinenchantitem) {
    }

    public void a(PacketPlayInSetCreativeSlot packetplayinsetcreativeslot) {
    }

    public void a(PacketPlayInTransaction packetplayintransaction) {
    }

    public void a(PacketPlayInUpdateSign packetplayinupdatesign) {
    }

    public void a(PacketPlayInKeepAlive packetplayinkeepalive) {
    }

    public void a(PacketPlayInAbilities packetplayinabilities) {
    }

    public void a(PacketPlayInTabComplete packetplayintabcomplete) {
    }

    public void a(PacketPlayInSettings packetplayinsettings) {
    }

    public void a(PacketPlayInCustomPayload packetplayincustompayload) {
    }

    public void a(EnumProtocol enumprotocol, EnumProtocol enumprotocol1) {
    }
}