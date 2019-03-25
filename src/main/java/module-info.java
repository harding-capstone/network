module com.shepherdjerred.capstone.network {
  requires static lombok;
  requires io.netty.all;
  requires org.apache.logging.log4j;
  requires com.google.common;
  requires gson;
  requires gson.extras;
  requires com.shepherdjerred.capstone.common;
  requires com.shepherdjerred.capstone.logic;

  exports com.shepherdjerred.capstone.network.netty;
  exports com.shepherdjerred.capstone.network.netty.handlers;
  exports com.shepherdjerred.capstone.network.packet.packets;
  exports com.shepherdjerred.capstone.network.packet.serialization;
}
