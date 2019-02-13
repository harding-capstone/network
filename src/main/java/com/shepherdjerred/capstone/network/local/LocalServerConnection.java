package com.shepherdjerred.capstone.network.local;

import com.shepherdjerred.capstone.network.ServerConnection;
import com.shepherdjerred.capstone.network.message.Message;

public class LocalServerConnection implements ServerConnection {

  private LocalBridge localBridge;

  public LocalServerConnection(LocalBridge localBridge) {
    this.localBridge = localBridge;
  }

  @Override
  public void sendMessage(Message message) {
    localBridge.sendMessageToServer(message);
  }

  @Override
  public Message getMessage() {
    return localBridge.getIncomingClientMessage();
  }

  @Override
  public boolean hasMessage() {
    return localBridge.doesClientHaveMessage();
  }
}
