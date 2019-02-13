package com.shepherdjerred.capstone.network.netty;

import com.shepherdjerred.capstone.network.message.Message;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;
import java.util.List;

public class MessageDecoder extends MessageToMessageDecoder<Message> {

  @Override
  protected void decode(ChannelHandlerContext ctx, Message msg, List<Object> out) throws Exception {
    // TODO decode bytes into something useful
  }
}
