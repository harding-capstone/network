package com.shepherdjerred.capstone.network.packet.packets;

import com.shepherdjerred.capstone.common.player.Player;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class PlayerLobbyActionPacket implements Packet {
  private final Player player;
  private final LobbyAction lobbyAction;

}
