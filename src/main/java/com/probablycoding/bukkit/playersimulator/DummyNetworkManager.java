package com.probablycoding.bukkit.playersimulator;

import io.netty.channel.ChannelHandlerContext;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.chat.ComponentSerializer;
import net.minecraft.server.v1_8_R3.*;

import javax.crypto.SecretKey;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.UnknownHostException;
import java.util.Random;


public class DummyNetworkManager extends NetworkManager {

    private final Random random;
    private BaseComponent[] bungeeComponent;
    private IChatBaseComponent iComponent;
    private SocketAddress fakeadress;

    public DummyNetworkManager() {
        super(EnumProtocolDirection.CLIENTBOUND);
        bungeeComponent = TextComponent.fromLegacyText("BB!");
        String json = ComponentSerializer.toString(bungeeComponent);
        iComponent = IChatBaseComponent.ChatSerializer.a(json);
        this.random = new Random();
        try {
            this.fakeadress = new InetSocketAddress(InetAddress.getLocalHost(),49152+random.nextInt(16383));
        } catch (UnknownHostException e1) {
            this.fakeadress = new SocketAddress() {};
        }
    }

    @Override
    public void channelActive(ChannelHandlerContext channelhandlercontext) throws Exception {

    }

    @Override
    public void a(EnumProtocol enumprotocol) {

    }

    @Override
    public void channelInactive(ChannelHandlerContext channelhandlercontext) throws Exception {

    }

    @Override
    public void exceptionCaught(ChannelHandlerContext channelhandlercontext, Throwable throwable) throws Exception {

    }

    @Override
    protected void a(ChannelHandlerContext channelhandlercontext, Packet packet) throws Exception {

    }

    @Override
    public void a(PacketListener packetlistener) {
        super.a(packetlistener);
    }

    @Override
    public void handle(Packet packet) {
    }

    @Override
    public void a(Packet packet, GenericFutureListener<? extends Future<? super Void>> genericfuturelistener, GenericFutureListener<? extends Future<? super Void>>... agenericfuturelistener) {

    }

    @Override
    public void a() {
        super.a();
    }

    @Override
    public SocketAddress getSocketAddress() {
        return fakeadress;
    }

    @Override
    public void close(IChatBaseComponent ichatbasecomponent) {
        iComponent = ichatbasecomponent;
        String json = IChatBaseComponent.ChatSerializer.a(iComponent);
        bungeeComponent = ComponentSerializer.parse(json);
        super.close(iComponent);
    }

    @Override
    public boolean c() {
        return true; //to force localChannel detection
    }

    @Override
    public void a(SecretKey secretkey) {

    }

    @Override
    public boolean g() {
        return super.g();
    }

    @Override
    public boolean h() {
        return super.h();
    }

    @Override
    public PacketListener getPacketListener() {
        return super.getPacketListener();
    }

    @Override
    public IChatBaseComponent j() {
        return super.j();
    }

    @Override
    public void k() {

    }

    @Override
    public void a(int i) {
        super.a(i);
    }

    @Override
    public void l() {
        super.l();
    }

    @Override
    protected void channelRead0(ChannelHandlerContext channelhandlercontext, Packet object) throws Exception {

    }

    @Override
    public SocketAddress getRawAddress() {
        return fakeadress;
    }
}