package com.howtodoinjava.core.factorybean;

import java.security.MessageDigest;

public class MessageDigester {

  private MessageDigest digest;

  public void setDigest(MessageDigest digest) {
    this.digest = digest;
  }

  public String digest(String msg) {
    return digest(msg, digest);
  }

  private String digest(String msg, MessageDigest digest) {
    digest.reset();
    byte[] bytes = msg.getBytes();
    byte[] out = digest.digest(bytes);
    return new String(out);
  }
}
