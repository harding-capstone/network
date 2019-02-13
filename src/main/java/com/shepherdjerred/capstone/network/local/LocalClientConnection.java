package com.shepherdjerred.capstone.network.local;

import com.shepherdjerred.capstone.network.ClientConnection;
import com.shepherdjerred.capstone.network.message.Message;

public class LocalClientConnection implements ClientConnection {
  private final LocalBridge localBridge;

  public LocalClientConnection(LocalBridge localBridge) {
    this.localBridge = localBridge;
  }

  @Override
  public void sendMessage(Message message) {
    localBridge.sendMessageToClient(message);
  }

  @Override
  public Message getMessage() {
    return localBridge.getIncomingServerMessage();
  }

  @Override
  public boolean hasMessage() {
    return false;
  }
}
