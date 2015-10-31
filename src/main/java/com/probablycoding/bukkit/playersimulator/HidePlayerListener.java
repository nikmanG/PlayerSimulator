/*
 * Copyright (c) 2015 Paul Scholz (scholzi100) All rights reserved.
 */

package com.probablycoding.bukkit.playersimulator;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

/**
 * Created by scholzi100 on 29.10.15.
 */
public class HidePlayerListener implements Listener {

    private final PlayerSimulator plugin;

    public HidePlayerListener(PlayerSimulator plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent event){
        plugin.hideAllBots(event.getPlayer());
    }

    @EventHandler
    public void onQuit(PlayerQuitEvent event){
        plugin.showAllBots(event.getPlayer());
    }

}
