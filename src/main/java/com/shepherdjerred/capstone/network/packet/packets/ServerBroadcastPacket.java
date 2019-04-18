package com.shepherdjerred.capstone.network.packet.packets;

import com.shepherdjerred.capstone.common.lobby.LobbySettings;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class ServerBroadcastPacket implements Packet {
  public String name;
  public LobbySettings lobbySettings;
}
