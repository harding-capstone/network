package com.shepherdjerred.capstone.network.packet.packets;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class PlayerDescriptionPacket implements Packet {

  private final String name;
  //TODO add element
}
