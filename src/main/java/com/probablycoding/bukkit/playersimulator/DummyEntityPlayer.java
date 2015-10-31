/*
 * Copyright (c) 2015 Paul Scholz (scholzi100) All rights reserved.
 */

package com.probablycoding.bukkit.playersimulator;

import com.mojang.authlib.GameProfile;
import net.minecraft.server.v1_8_R3.*;
import org.bukkit.Location;
import org.bukkit.WeatherType;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.event.entity.EntityRegainHealthEvent;

import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.UUID;

/**
 * Created by scholzi100 on 31.10.15.
 */
public class DummyEntityPlayer extends EntityPlayer {

    public DummyEntityPlayer(MinecraftServer minecraftserver, WorldServer worldserver, GameProfile gameprofile, PlayerInteractManager playerinteractmanager) {
        super(minecraftserver, worldserver, gameprofile, playerinteractmanager);
    }

    @Override
    public boolean damageEntity(DamageSource damagesource, float f) {
        return false;
    }


    @Override
    public void die(DamageSource damagesource) {

    }

    @Override
    public boolean ad() {
        return true;
    }

    @Override
    public boolean ae() {
        return true;
    }

    @Override
    public void a(NBTTagCompound nbttagcompound) {

    }

    @Override
    public void b(NBTTagCompound nbttagcompound) {

    }

    @Override
    public void spawnIn(World world) {
        super.spawnIn(world);
    }

    @Override
    public void levelDown(int i) {

    }

    @Override
    public void enchantDone(int i) {

    }

    @Override
    public void syncInventory() {

    }

    @Override
    public void enterCombat() {

    }

    @Override
    public void exitCombat() {

    }

    @Override
    public void t_() {

    }

    @Override
    public void l() {

    }

    @Override
    protected void i_() {

    }

    @Override
    public boolean a(EntityHuman entityhuman) {
        return super.a(entityhuman);
    }

    @Override
    public void c(int i) {
        super.c(i);
    }

    @Override
    public boolean a(EntityPlayer entityplayer) {
        return super.a(entityplayer);
    }

    @Override
    public void receive(Entity entity, int i) {
        super.receive(entity, i);
    }

    @Override
    public EnumBedResult a(BlockPosition blockposition) {
        return super.a(blockposition);
    }

    @Override
    public void a(boolean flag, boolean flag1, boolean flag2) {

    }

    @Override
    public void mount(Entity entity) {
        super.mount(entity);
    }

    @Override
    protected void a(double d0, boolean flag, Block block, BlockPosition blockposition) {

    }

    @Override
    public void a(double d0, boolean flag) {

    }

    @Override
    public void openSign(TileEntitySign tileentitysign) {

    }

    @Override
    public int nextContainerCounter() {
        return super.nextContainerCounter();
    }

    @Override
    public void openTileEntity(ITileEntityContainer itileentitycontainer) {

    }

    @Override
    public void openContainer(IInventory iinventory) {

    }

    @Override
    public void openTrade(IMerchant imerchant) {
        super.openTrade(imerchant);
    }

    @Override
    public void openHorseInventory(EntityHorse entityhorse, IInventory iinventory) {

    }

    @Override
    public void openBook(ItemStack itemstack) {

    }

    @Override
    public void a(Container container, int i, ItemStack itemstack) {

    }

    @Override
    public void updateInventory(Container container) {

    }

    @Override
    public void a(Container container, List<ItemStack> list) {

    }

    @Override
    public void setContainerData(Container container, int i, int j) {

    }

    @Override
    public void setContainerData(Container container, IInventory iinventory) {

    }

    @Override
    public void closeInventory() {

    }

    @Override
    public void broadcastCarriedItem() {

    }

    @Override
    public void p() {

    }

    @Override
    public void a(float f, float f1, boolean flag, boolean flag1) {

    }

    @Override
    public void a(Statistic statistic, int i) {

    }

    @Override
    public void a(Statistic statistic) {

    }

    @Override
    public void q() {

    }

    @Override
    public void triggerHealthUpdate() {

    }

    @Override
    public void sendMessage(IChatBaseComponent[] ichatbasecomponent) {

    }

    @Override
    public void b(IChatBaseComponent ichatbasecomponent) {

    }

    @Override
    protected void s() {

    }

    @Override
    public void a(ItemStack itemstack, int i) {

    }

    @Override
    public void copyTo(EntityHuman entityhuman, boolean flag) {

    }

    @Override
    protected void a(MobEffect mobeffect) {

    }

    @Override
    protected void a(MobEffect mobeffect, boolean flag) {

    }

    @Override
    protected void b(MobEffect mobeffect) {
    }

    @Override
    public void enderTeleportTo(double d0, double d1, double d2) {

    }

    @Override
    public void b(Entity entity) {

    }

    @Override
    public void c(Entity entity) {

    }

    @Override
    public void updateAbilities() {

    }

    @Override
    public WorldServer u() {
        return super.u();
    }

    @Override
    public void a(WorldSettings.EnumGamemode worldsettings_enumgamemode) {

    }

    @Override
    public boolean isSpectator() {
        return false;
    }

    @Override
    public void sendMessage(IChatBaseComponent ichatbasecomponent) {

    }

    @Override
    public boolean a(int i, String s) {
        return false;
    }

    @Override
    public String w() {
        return "";
    }

    @Override
    public void a(PacketPlayInSettings packetplayinsettings) {

    }

    @Override
    public EnumChatVisibility getChatFlags() {
        return EnumChatVisibility.FULL;
    }

    @Override
    public void setResourcePack(String s, String s1) {

    }

    @Override
    public BlockPosition getChunkCoordinates() {
        return super.getChunkCoordinates();
    }

    @Override
    public void resetIdleTimer() {

    }

    @Override
    public ServerStatisticManager getStatisticManager() {
        return super.getStatisticManager();
    }

    @Override
    public void d(Entity entity) {

    }

    @Override
    protected void B() {

    }

    @Override
    public Entity C() {
        return super.C();
    }

    @Override
    public void setSpectatorTarget(Entity entity) {

    }

    @Override
    public void attack(Entity entity) {

    }

    @Override
    public long D() {
        return super.D();
    }

    @Override
    public IChatBaseComponent getPlayerListName() {
        return super.getPlayerListName();
    }

    @Override
    public long getPlayerTime() {
        return super.getPlayerTime();
    }

    @Override
    public WeatherType getPlayerWeather() {
        return super.getPlayerWeather();
    }

    @Override
    public void setPlayerWeather(WeatherType type, boolean plugin) {

    }

    @Override
    public void updateWeather(float oldRain, float newRain, float oldThunder, float newThunder) {

    }

    @Override
    public void tickWeather() {

    }

    @Override
    public void resetPlayerWeather() {

    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void reset() {

    }

    @Override
    public CraftPlayer getBukkitEntity() {
        return super.getBukkitEntity();
    }

    @Override
    protected void initAttributes() {

    }

    @Override
    protected void h() {

    }

    @Override
    public boolean bS() {
        return super.bS();
    }

    @Override
    public void bU() {

    }

    @Override
    public void bV() {

    }

    @Override
    public boolean isBlocking() {
        return super.isBlocking();
    }

    @Override
    public int L() {
        return super.L();
    }

    @Override
    protected String P() {
        return super.P();
    }

    @Override
    protected String aa() {
        return super.aa();
    }

    @Override
    public int aq() {
        return super.aq();
    }

    @Override
    public void makeSound(String s, float f, float f1) {

    }

    @Override
    protected void b(ItemStack itemstack, int i) {

    }

    @Override
    protected boolean bD() {
        return super.bD();
    }

    @Override
    public void ak() {

    }

    @Override
    protected void doTick() {

    }

    @Override
    public void m() {

    }

    @Override
    public int getScore() {
        return super.getScore();
    }

    @Override
    public void setScore(int i) {

    }

    @Override
    public void addScore(int i) {

    }

    @Override
    protected String bo() {
        return super.bo();
    }

    @Override
    protected String bp() {
        return super.bp();
    }

    @Override
    public void b(Entity entity, int i) {

    }

    @Override
    public EntityItem a(boolean flag) {
        return null;
    }

    @Override
    public EntityItem drop(ItemStack itemstack, boolean flag) {
        return null;
    }

    @Override
    public EntityItem a(ItemStack itemstack, boolean flag, boolean flag1) {
        return null;
    }

    @Override
    protected void a(EntityItem entityitem) {

    }

    @Override
    public float a(Block block) {
        return 0;
    }

    @Override
    public boolean b(Block block) {
        return super.b(block);
    }

    @Override
    protected void damageArmor(float f) {

    }

    @Override
    public int br() {
        return super.br();
    }

    @Override
    public float bY() {
        return super.bY();
    }

    @Override
    protected boolean d(DamageSource damagesource, float f) {
        return false;
    }

    @Override
    public void a(CommandBlockListenerAbstract commandblocklistenerabstract) {

    }

    @Override
    public boolean u(Entity entity) {
        return super.u(entity);
    }

    @Override
    public ItemStack bZ() {
        return super.bZ();
    }

    @Override
    public void ca() {

    }

    @Override
    public double am() {
        return super.am();
    }

    @Override
    public void die() {

    }

    @Override
    public boolean inBlock() {
        return super.inBlock();
    }

    @Override
    public GameProfile getProfile() {
        return super.getProfile();
    }

    @Override
    public boolean isSleeping() {
        return super.isSleeping();
    }

    @Override
    public boolean isDeeplySleeping() {
        return super.isDeeplySleeping();
    }

    @Override
    public BlockPosition getBed() {
        return super.getBed();
    }

    @Override
    public boolean isRespawnForced() {
        return super.isRespawnForced();
    }

    @Override
    public void setRespawnPosition(BlockPosition blockposition, boolean flag) {

    }

    @Override
    public void b(Statistic statistic) {

    }

    @Override
    public void bF() {

    }

    @Override
    public void g(float f, float f1) {

    }

    @Override
    public float bI() {
        return super.bI();
    }

    @Override
    public void checkMovement(double d0, double d1, double d2) {

    }

    @Override
    public void e(float f, float f1) {

    }

    @Override
    protected void X() {

    }

    @Override
    protected String n(int i) {
        return super.n(i);
    }

    @Override
    public void a(EntityLiving entityliving) {

    }

    @Override
    public void aA() {

    }

    @Override
    public ItemStack q(int i) {
        return super.q(i);
    }

    @Override
    public void giveExp(int i) {

    }

    @Override
    public int cj() {
        return super.cj();
    }

    @Override
    public int getExpToLevel() {
        return super.getExpToLevel();
    }

    @Override
    public void applyExhaustion(float f) {

    }

    @Override
    public FoodMetaData getFoodData() {
        return super.getFoodData();
    }

    @Override
    public boolean j(boolean flag) {
        return super.j(flag);
    }

    @Override
    public boolean cm() {
        return super.cm();
    }

    @Override
    public boolean cn() {
        return super.cn();
    }

    @Override
    public boolean a(BlockPosition blockposition, EnumDirection enumdirection, ItemStack itemstack) {
        return super.a(blockposition, enumdirection, itemstack);
    }

    @Override
    protected int getExpValue(EntityHuman entityhuman) {
        return super.getExpValue(entityhuman);
    }

    @Override
    protected boolean alwaysGivesExp() {
        return super.alwaysGivesExp();
    }

    @Override
    protected boolean s_() {
        return super.s_();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public InventoryEnderChest getEnderChest() {
        return super.getEnderChest();
    }

    @Override
    public ItemStack getEquipment(int i) {
        return super.getEquipment(i);
    }

    @Override
    public ItemStack bA() {
        return super.bA();
    }

    @Override
    public void setEquipment(int i, ItemStack itemstack) {
        super.setEquipment(i, itemstack);
    }

    @Override
    public ItemStack[] getEquipment() {
        return super.getEquipment();
    }

    @Override
    public boolean aL() {
        return super.aL();
    }

    @Override
    public Scoreboard getScoreboard() {
        return super.getScoreboard();
    }

    @Override
    public ScoreboardTeamBase getScoreboardTeam() {
        return super.getScoreboardTeam();
    }

    @Override
    public IChatBaseComponent getScoreboardDisplayName() {
        return super.getScoreboardDisplayName();
    }

    @Override
    public float getHeadHeight() {
        return super.getHeadHeight();
    }

    @Override
    public void setAbsorptionHearts(float f) {
        super.setAbsorptionHearts(f);
    }

    @Override
    public float getAbsorptionHearts() {
        return super.getAbsorptionHearts();
    }

    @Override
    public boolean a(ChestLock chestlock) {
        return super.a(chestlock);
    }

    @Override
    public boolean getSendCommandFeedback() {
        return super.getSendCommandFeedback();
    }

    @Override
    public boolean d(int i, ItemStack itemstack) {
        return super.d(i, itemstack);
    }

    @Override
    public void inactiveTick() {
        super.inactiveTick();
    }

    @Override
    public void G() {

    }

    @Override
    public boolean aY() {
        return super.aY();
    }

    @Override
    public void K() {

    }

    @Override
    public int getExpReward() {
        return super.getExpReward();
    }

    @Override
    public boolean isBaby() {
        return super.isBaby();
    }

    @Override
    protected void aZ() {

    }

    @Override
    protected boolean ba() {
        return super.ba();
    }

    @Override
    protected int j(int i) {
        return super.j(i);
    }

    @Override
    public Random bc() {
        return super.bc();
    }

    @Override
    public EntityLiving getLastDamager() {
        return super.getLastDamager();
    }

    @Override
    public int be() {
        return super.be();
    }

    @Override
    public void b(EntityLiving entityliving) {
        super.b(entityliving);
    }

    @Override
    public EntityLiving bf() {
        return super.bf();
    }

    @Override
    public int bg() {
        return super.bg();
    }

    @Override
    public void p(Entity entity) {
        super.p(entity);
    }

    @Override
    public int bh() {
        return super.bh();
    }

    @Override
    protected void bi() {

    }

    @Override
    protected void bj() {

    }

    @Override
    public void removeAllEffects() {
        super.removeAllEffects();
    }

    @Override
    public Collection<MobEffect> getEffects() {
        return super.getEffects();
    }

    @Override
    public boolean hasEffect(int i) {
        return super.hasEffect(i);
    }

    @Override
    public boolean hasEffect(MobEffectList mobeffectlist) {
        return super.hasEffect(mobeffectlist);
    }

    @Override
    public MobEffect getEffect(MobEffectList mobeffectlist) {
        return super.getEffect(mobeffectlist);
    }

    @Override
    public void addEffect(MobEffect mobeffect) {
        super.addEffect(mobeffect);
    }

    @Override
    public boolean d(MobEffect mobeffect) {
        return super.d(mobeffect);
    }

    @Override
    public boolean bm() {
        return super.bm();
    }

    @Override
    public void removeEffect(int i) {
        super.removeEffect(i);
    }

    @Override
    public void heal(float f) {
        super.heal(f);
    }

    @Override
    public void heal(float f, EntityRegainHealthEvent.RegainReason regainReason) {
        super.heal(f, regainReason);
    }

    @Override
    public void setHealth(float f) {
        super.setHealth(f);
    }

    @Override
    public void b(ItemStack itemstack) {
        super.b(itemstack);
    }

    @Override
    protected void dropEquipment(boolean flag, int i) {
        super.dropEquipment(flag, i);
    }

    @Override
    public void a(Entity entity, float f, double d0, double d1) {
        super.a(entity, f, d0, d1);
    }

    @Override
    protected void getRareDrop() {
        super.getRareDrop();
    }

    @Override
    protected void dropDeathLoot(boolean flag, int i) {
        super.dropDeathLoot(flag, i);
    }

    @Override
    public boolean k_() {
        return super.k_();
    }

    @Override
    public boolean isAlive() {
        return super.isAlive();
    }

    @Override
    protected float applyArmorModifier(DamageSource damagesource, float f) {
        return super.applyArmorModifier(damagesource, f);
    }

    @Override
    protected float applyMagicModifier(DamageSource damagesource, float f) {
        return super.applyMagicModifier(damagesource, f);
    }

    @Override
    public CombatTracker bs() {
        return super.bs();
    }

    @Override
    public EntityLiving bt() {
        return super.bt();
    }

    @Override
    public void bw() {
        super.bw();
    }

    @Override
    protected void O() {
        super.O();
    }

    @Override
    protected void bx() {
        super.bx();
    }

    @Override
    public AttributeInstance getAttributeInstance(IAttribute iattribute) {
        return super.getAttributeInstance(iattribute);
    }

    @Override
    public AttributeMapBase getAttributeMap() {
        return super.getAttributeMap();
    }

    @Override
    public EnumMonsterType getMonsterType() {
        return super.getMonsterType();
    }

    @Override
    public void setSprinting(boolean flag) {
        super.setSprinting(flag);
    }

    @Override
    protected float bB() {
        return super.bB();
    }

    @Override
    protected float bC() {
        return super.bC();
    }

    @Override
    public void q(Entity entity) {
        super.q(entity);
    }

    @Override
    protected float bE() {
        return super.bE();
    }

    @Override
    protected void bG() {
        super.bG();
    }

    @Override
    protected void bH() {
        super.bH();
    }

    @Override
    public void k(float f) {
        super.k(f);
    }

    @Override
    public boolean r(Entity entity) {
        return super.r(entity);
    }

    @Override
    protected float h(float f, float f1) {
        return super.h(f, f1);
    }

    @Override
    protected void bL() {
        super.bL();
    }

    @Override
    protected void s(Entity entity) {
        super.s(entity);
    }

    @Override
    public void i(boolean flag) {
        super.i(flag);
    }

    @Override
    public boolean hasLineOfSight(Entity entity) {
        return super.hasLineOfSight(entity);
    }

    @Override
    public Vec3D ap() {
        return super.ap();
    }

    @Override
    public Vec3D d(float f) {
        return super.d(f);
    }

    @Override
    public boolean bM() {
        return super.bM();
    }

    @Override
    protected void ac() {
        super.ac();
    }

    @Override
    public float getHeadRotation() {
        return super.getHeadRotation();
    }

    @Override
    public void f(float f) {
        super.f(f);
    }

    @Override
    public void g(float f) {
        super.g(f);
    }

    @Override
    public boolean c(EntityLiving entityliving) {
        return super.c(entityliving);
    }

    @Override
    public boolean a(ScoreboardTeamBase scoreboardteambase) {
        return super.a(scoreboardteambase);
    }

    @Override
    protected void bP() {
        super.bP();
    }

    @Override
    public boolean isAddedToChunk() {
        return super.isAddedToChunk();
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void d(int i) {
        super.d(i);
    }

    @Override
    public DataWatcher getDataWatcher() {
        return super.getDataWatcher();
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public void setSize(float f, float f1) {

    }

    @Override
    protected void setYawPitch(float f, float f1) {

    }

    @Override
    public void setPosition(double d0, double d1, double d2) {

    }


    @Override
    protected void burnFromLava() {

    }

    @Override
    public void setOnFire(int i) {

    }

    @Override
    public void extinguish() {

    }

    @Override
    public boolean c(double d0, double d1, double d2) {
        return false;
    }

    @Override
    public void move(double d0, double d1, double d2) {
        super.move(d0, d1, d2);
    }

    @Override
    protected void checkBlockCollisions() {

    }

    @Override
    protected void a(BlockPosition blockposition, Block block) {

    }

    @Override
    public boolean R() {
        return super.R();
    }

    @Override
    public void b(boolean flag) {

    }

    @Override
    public AxisAlignedBB S() {
        return super.S();
    }

    @Override
    protected void burn(float i) {

    }

    @Override
    public boolean U() {
        return super.U();
    }

    @Override
    public boolean V() {
        return super.V();
    }

    @Override
    public boolean W() {
        return super.W();
    }

    @Override
    public void Y() {

    }

    @Override
    protected void Z() {

    }

    @Override
    public boolean a(Material material) {
        return super.a(material);
    }

    @Override
    public boolean ab() {
        return super.ab();
    }

    @Override
    public void a(float f, float f1, float f2) {

    }

    @Override
    public float c(float f) {
        return super.c(f);
    }

    @Override
    public void setLocation(double d0, double d1, double d2, float f, float f1) {

    }

    @Override
    public void setPositionRotation(BlockPosition blockposition, float f, float f1) {

    }

    @Override
    public void setPositionRotation(double d0, double d1, double d2, float f, float f1) {

    }

    @Override
    public float g(Entity entity) {
        return super.g(entity);
    }

    @Override
    public double e(double d0, double d1, double d2) {
        return super.e(d0, d1, d2);
    }

    @Override
    public double b(BlockPosition blockposition) {
        return super.b(blockposition);
    }

    @Override
    public double c(BlockPosition blockposition) {
        return super.c(blockposition);
    }

    @Override
    public double f(double d0, double d1, double d2) {
        return super.f(d0, d1, d2);
    }

    @Override
    public double h(Entity entity) {
        return super.h(entity);
    }

    @Override
    public void d(EntityHuman entityhuman) {

    }

    @Override
    public void collide(Entity entity) {
    }

    @Override
    public void g(double d0, double d1, double d2) {

    }

    @Override
    public boolean c(NBTTagCompound nbttagcompound) {
        return super.c(nbttagcompound);
    }

    @Override
    public boolean d(NBTTagCompound nbttagcompound) {
        return super.d(nbttagcompound);
    }

    @Override
    public void e(NBTTagCompound nbttagcompound) {
        super.e(nbttagcompound);
    }

    @Override
    public void f(NBTTagCompound nbttagcompound) {
        super.f(nbttagcompound);
    }

    @Override
    protected boolean af() {
        return super.af();
    }

    @Override
    public void ah() {

    }

    @Override
    protected NBTTagList a(double... adouble) {
        return super.a(adouble);
    }

    @Override
    protected NBTTagList a(float... afloat) {
        return super.a(afloat);
    }

    @Override
    public EntityItem a(Item item, int i) {
        return super.a(item, i);
    }

    @Override
    public EntityItem a(Item item, int i, float f) {
        return super.a(item, i, f);
    }

    @Override
    public EntityItem a(ItemStack itemstack, float f) {
        return super.a(itemstack, f);
    }

    @Override
    public boolean e(EntityHuman entityhuman) {
        return super.e(entityhuman);
    }

    @Override
    public AxisAlignedBB j(Entity entity) {
        return super.j(entity);
    }

    @Override
    public void al() {

    }

    @Override
    public double an() {
        return super.an();
    }

    @Override
    public float ao() {
        return super.ao();
    }

    @Override
    public void d(BlockPosition blockposition) {

    }

    @Override
    public boolean isBurning() {
        return super.isBurning();
    }

    @Override
    public boolean au() {
        return super.au();
    }

    @Override
    public boolean isSneaking() {
        return super.isSneaking();
    }

    @Override
    public void setSneaking(boolean flag) {

    }

    @Override
    public boolean isSprinting() {
        return super.isSprinting();
    }

    @Override
    public boolean isInvisible() {
        return super.isInvisible();
    }

    @Override
    public void setInvisible(boolean flag) {
        super.setInvisible(flag);
    }

    @Override
    public void f(boolean flag) {

    }

    @Override
    protected boolean g(int i) {
        return super.g(i);
    }

    @Override
    protected void b(int i, boolean flag) {

    }

    @Override
    public int getAirTicks() {
        return super.getAirTicks();
    }

    @Override
    public void setAirTicks(int i) {

    }

    @Override
    public void onLightningStrike(EntityLightning entitylightning) {

    }

    @Override
    protected boolean j(double d0, double d1, double d2) {
        return super.j(d0, d1, d2);
    }

    @Override
    public Entity[] aB() {
        return super.aB();
    }

    @Override
    public boolean k(Entity entity) {
        return super.k(entity);
    }

    @Override
    public boolean aD() {
        return super.aD();
    }

    @Override
    public boolean l(Entity entity) {
        return super.l(entity);
    }

    @Override
    public boolean isInvulnerable(DamageSource damagesource) {
        return super.isInvulnerable(damagesource);
    }

    @Override
    public void m(Entity entity) {
        super.m(entity);
    }

    @Override
    public void n(Entity entity) {
        super.n(entity);
    }

    @Override
    public void teleportTo(Location exit, boolean portal) {

    }

    @Override
    public float a(Explosion explosion, World world, BlockPosition blockposition, IBlockData iblockdata) {
        return super.a(explosion, world, blockposition, iblockdata);
    }

    @Override
    public boolean a(Explosion explosion, World world, BlockPosition blockposition, IBlockData iblockdata, float f) {
        return super.a(explosion, world, blockposition, iblockdata, f);
    }

    @Override
    public int aE() {
        return super.aE();
    }

    @Override
    public Vec3D aG() {
        return super.aG();
    }

    @Override
    public EnumDirection aH() {
        return super.aH();
    }

    @Override
    public boolean aI() {
        return super.aI();
    }

    @Override
    public void appendEntityCrashDetails(CrashReportSystemDetails crashreportsystemdetails) {

    }

    @Override
    public UUID getUniqueID() {
        return super.getUniqueID();
    }

    @Override
    public void setCustomName(String s) {

    }

    @Override
    public String getCustomName() {
        return super.getCustomName();
    }

    @Override
    public boolean hasCustomName() {
        return super.hasCustomName();
    }

    @Override
    public void setCustomNameVisible(boolean flag) {

    }

    @Override
    public boolean getCustomNameVisible() {
        return super.getCustomNameVisible();
    }

    @Override
    public void i(int i) {

    }

    @Override
    public EnumDirection getDirection() {
        return super.getDirection();
    }

    @Override
    protected ChatHoverable aQ() {
        return super.aQ();
    }

    @Override
    public AxisAlignedBB getBoundingBox() {
        return super.getBoundingBox();
    }

    @Override
    public void a(AxisAlignedBB axisalignedbb) {

    }

    @Override
    public boolean aT() {
        return super.aT();
    }

    @Override
    public void h(boolean flag) {

    }

    @Override
    public Vec3D d() {
        return super.d();
    }

    @Override
    public World getWorld() {
        return super.getWorld();
    }

    @Override
    public Entity f() {
        return super.f();
    }

    @Override
    public void a(CommandObjectiveExecutor.EnumCommandResult commandobjectiveexecutor_enumcommandresult, int i) {

    }

    @Override
    public CommandObjectiveExecutor aU() {
        return super.aU();
    }

    @Override
    public void o(Entity entity) {

    }

    @Override
    public NBTTagCompound getNBTTag() {
        return super.getNBTTag();
    }

    @Override
    public boolean a(EntityHuman entityhuman, Vec3D vec3d) {
        return super.a(entityhuman,vec3d);
    }

    @Override
    public boolean aW() {
        return super.aW();
    }

    @Override
    protected void a(EntityLiving entityliving, Entity entity) {

    }
}
