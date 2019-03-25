package com.shepherdjerred.capstone.network.packet.packets;

import com.shepherdjerred.capstone.common.chat.ChatMessage;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class SendChatMessagePacket implements Packet {

  private final ChatMessage chatMessage;
}
