package com.shepherdjerred.capstone.network;

import com.shepherdjerred.capstone.network.message.Message;

/**
 * A connection to a client
 */
public interface ClientConnection {

  void sendMessage(Message message);

  Message getMessage();

  boolean hasMessage();
}
