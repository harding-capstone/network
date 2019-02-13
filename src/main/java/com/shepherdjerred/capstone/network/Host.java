package com.shepherdjerred.capstone.network;

import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class Host {
  private final UUID uuid;
  private final String secret;
  private final HostType hostType;

  public enum HostType {
    CLIENT, SERVER
  }
}
