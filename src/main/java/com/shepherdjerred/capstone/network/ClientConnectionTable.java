package com.shepherdjerred.capstone.network;

import java.util.HashMap;
import java.util.Map;

public class ClientConnectionTable {
  private final Map<Host, ClientConnection> clientConnectionMap;

  public ClientConnectionTable() {
    this.clientConnectionMap = new HashMap<>();
  }

  public ClientConnection getConnection(Host host) {
    return clientConnectionMap.get(host);
  }

  public void putConnection(Host host, ClientConnection clientConnection) {
    clientConnectionMap.put(host, clientConnection);
  }
}
