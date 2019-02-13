package com.shepherdjerred.capstone.network;


import com.shepherdjerred.capstone.network.local.LocalClientConnection;
import com.shepherdjerred.capstone.network.message.Message;
import com.shepherdjerred.capstone.network.netty.ServerHandler;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import java.net.InetSocketAddress;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Server {

  private final ClientConnectionTable clientConnectionTable;
  private final Queue<Message> incomingMessages;

  public Server() {
    clientConnectionTable = new ClientConnectionTable();
    incomingMessages = new ConcurrentLinkedQueue<>();
  }

  public void addLocalClient(Host host, LocalClientConnection clientConnection) {
    clientConnectionTable.putConnection(host, clientConnection);
  }

  public void listen(String hostname, int port) throws InterruptedException {
    EventLoopGroup group = new NioEventLoopGroup();

    try {
      ServerBootstrap serverBootstrap = new ServerBootstrap();

      serverBootstrap.group(group);
      serverBootstrap.channel(NioServerSocketChannel.class);
      serverBootstrap.localAddress(new InetSocketAddress(hostname, port));

      serverBootstrap.childHandler(new ChannelInitializer<SocketChannel>() {
        protected void initChannel(SocketChannel socketChannel) {
          socketChannel.pipeline().addLast(new ServerHandler());
        }
      });

      ChannelFuture channelFuture = serverBootstrap.bind().sync();
      channelFuture.channel().closeFuture().sync();
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      group.shutdownGracefully().sync();
    }
  }
}
