package com.shepherdjerred.capstone.network;

import com.shepherdjerred.capstone.network.event.ChatGameEvent;
import com.shepherdjerred.capstone.network.local.LocalClientConnection;
import com.shepherdjerred.capstone.network.local.LocalServerConnection;
import com.shepherdjerred.capstone.network.message.Message;
import org.junit.Test;

public class LocalTest {
  @Test
  public void myTest() {
    ServerConnection serverConnection = new LocalServerConnection();
    ClientConnection clientConnection = new LocalClientConnection();

    var event = new ChatGameEvent("MyName", "MyMessage");
    var message = new Message(event);
    serverConnection.sendMessage(message);

    var receivedMessage = clientConnection.getMessage();

    System.out.println(receivedMessage);
  }
}
