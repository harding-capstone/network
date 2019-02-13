package com.shepherdjerred.capstone.network;

import com.shepherdjerred.capstone.network.message.Message;

/**
 * A connection to a server
 */
public interface ServerConnection {

  void sendMessage(Message message);

  Message getMessage();

  boolean hasMessage();

}
