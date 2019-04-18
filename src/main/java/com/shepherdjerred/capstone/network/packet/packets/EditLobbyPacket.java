package com.shepherdjerred.capstone.network.packet.packets;

import com.shepherdjerred.capstone.common.lobby.LobbySettings;
import com.shepherdjerred.capstone.common.player.Player;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class EditLobbyPacket implements Packet {
  private final LobbySettings lobbySettings;
  private final Player player;
}
