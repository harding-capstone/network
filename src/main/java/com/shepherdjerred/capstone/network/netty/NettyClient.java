package com.shepherdjerred.capstone.network.netty;

import com.shepherdjerred.capstone.network.message.Message;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import java.net.InetSocketAddress;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class NettyClient {

  private final Queue<Message> incomingMessages;
  private Channel serverChannel;

  public NettyClient() {
    incomingMessages = new ConcurrentLinkedQueue<>();
  }

  public void connect(String hostname, int port) throws InterruptedException {
    log.info("Connecting client!");
    EventLoopGroup group = new NioEventLoopGroup();
    try {
      Bootstrap clientBootstrap = new Bootstrap();

      clientBootstrap.group(group);
      clientBootstrap.channel(NioSocketChannel.class);
      clientBootstrap.remoteAddress(new InetSocketAddress(hostname, port));

      clientBootstrap.handler(new ChannelInitializer<SocketChannel>() {
        protected void initChannel(SocketChannel socketChannel) {
          socketChannel.pipeline().addLast(new ClientHandler());
        }
      });

      var channelFuture = clientBootstrap.connect().sync();
      serverChannel = channelFuture.channel();
      serverChannel.closeFuture().sync();
    } finally {
      group.shutdownGracefully().sync();
    }
  }

  public boolean isConnected() {
    return serverChannel.isOpen();
  }

  public void sendMessage(Message message) {
    serverChannel.writeAndFlush(message);
  }

  public Message getMessage() {
    return incomingMessages.remove();
  }

  public boolean hasMessage() {
    return incomingMessages.size() > 0;
  }
}
