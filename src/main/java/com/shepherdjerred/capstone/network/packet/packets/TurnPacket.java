package com.shepherdjerred.capstone.network.packet.packets;

import com.shepherdjerred.capstone.common.player.Player;
import com.shepherdjerred.capstone.logic.match.Match;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class TurnPacket implements Packet {
  private final Match match;
  private final Player lastPlayerToMove;
}
