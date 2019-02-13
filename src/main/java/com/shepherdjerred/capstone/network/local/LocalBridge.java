package com.shepherdjerred.capstone.network.local;

import com.shepherdjerred.capstone.network.message.Message;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class LocalBridge {

  private final Queue<Message> incomingServerMessages;
  private final Queue<Message> incomingClientMessages;

  public LocalBridge() {
    this.incomingServerMessages = new ConcurrentLinkedQueue<>();
    this.incomingClientMessages = new ConcurrentLinkedQueue<>();
  }

  public void sendMessageToServer(Message message) {
    incomingServerMessages.add(message);
  }

  public Message getIncomingServerMessage() {
    return incomingServerMessages.remove();
  }

  public boolean doesServerHaveMessage() {
    return incomingServerMessages.size() > 0;
  }

  public void sendMessageToClient(Message message) {
    incomingClientMessages.add(message);
  }

  public Message getIncomingClientMessage() {
    return incomingClientMessages.remove();
  }

  public boolean doesClientHaveMessage() {
    return incomingClientMessages.size() > 0;
  }
}
