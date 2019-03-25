package com.shepherdjerred.capstone.network.packet.packets;

import com.shepherdjerred.capstone.common.chat.ChatHistory;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class UpdateChatHistoryPacket implements Packet {

  private final ChatHistory chatHistory;
}
