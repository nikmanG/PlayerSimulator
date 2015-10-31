/*
 * Copyright (c) 2015 Paul Scholz (scholzi100) All rights reserved.
 */

package com.probablycoding.bukkit.playersimulator;

import net.minecraft.server.v1_8_R3.*;

/**
 * Created by scholzi100 on 31.10.15.
 */
public class DummyPlayerInteractManager extends PlayerInteractManager {

    public DummyPlayerInteractManager(World world) {
        super(world);
    }

    @Override
    public void setGameMode(WorldSettings.EnumGamemode worldsettings_enumgamemode) {

    }

    @Override
    public WorldSettings.EnumGamemode getGameMode() {
        return super.getGameMode();
    }

    @Override
    public boolean c() {
        return super.c();
    }

    @Override
    public boolean isCreative() {
        return super.isCreative();
    }

    @Override
    public void b(WorldSettings.EnumGamemode worldsettings_enumgamemode) {

    }

    @Override
    public void a() {

    }

    @Override
    public void a(BlockPosition blockposition, EnumDirection enumdirection) {

    }

    @Override
    public void a(BlockPosition blockposition) {

    }

    @Override
    public void e() {

    }

    @Override
    public boolean breakBlock(BlockPosition blockposition) {
        return false;
    }

    @Override
    public boolean useItem(EntityHuman entityhuman, World world, ItemStack itemstack) {
        return false;
    }

    @Override
    public boolean interact(EntityHuman entityhuman, World world, ItemStack itemstack, BlockPosition blockposition, EnumDirection enumdirection, float f, float f1, float f2) {
        return false;
    }

    @Override
    public void a(WorldServer worldserver) {

    }
}
