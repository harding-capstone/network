package com.shepherdjerred.capstone.network.message;

import com.shepherdjerred.capstone.network.event.GameEvent;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class Message {

  private final GameEvent gameEvent;
}
