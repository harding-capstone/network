module com.shepherdjerred.capstone.network {
  requires static lombok;
  requires io.netty.all;
  requires com.shepherdjerred.capstone.logic;
  requires org.apache.logging.log4j;
  requires com.google.common;
  requires gson;
  requires gson.extras;

  exports com.shepherdjerred.capstone.network.netty;
  exports com.shepherdjerred.capstone.network.netty.handlers;
  exports com.shepherdjerred.capstone.network.packet.packets;
  exports com.shepherdjerred.capstone.network.packet.serialization;
}
