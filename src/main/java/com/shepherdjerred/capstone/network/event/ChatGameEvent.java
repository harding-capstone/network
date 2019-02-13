package com.shepherdjerred.capstone.network.event;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class ChatGameEvent implements GameEvent {
  private final String sender;
  private final String message;
}
