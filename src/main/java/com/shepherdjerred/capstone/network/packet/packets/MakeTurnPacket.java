package com.shepherdjerred.capstone.network.packet.packets;

import com.shepherdjerred.capstone.logic.turn.Turn;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class MakeTurnPacket implements Packet {
  private final Turn turn;
}
