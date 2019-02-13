package com.shepherdjerred.capstone.network;

import com.shepherdjerred.capstone.network.message.Message;

public interface Listener {

  void notify(Message message);
}
