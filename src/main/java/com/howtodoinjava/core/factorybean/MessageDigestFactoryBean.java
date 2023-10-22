package com.howtodoinjava.core.factorybean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;

import java.security.MessageDigest;

public class MessageDigestFactoryBean
  implements FactoryBean<MessageDigest>, InitializingBean {

  private String algorithmName = "MD5";
  private MessageDigest messageDigest = null;

  @Override
  public MessageDigest getObject() throws Exception {
    return messageDigest;
  }
  @Override
  public Class<MessageDigest> getObjectType() {
    return MessageDigest.class;
  }
  @Override
  public boolean isSingleton() {
    return true;
  }
  @Override
  public void afterPropertiesSet() throws Exception {
    messageDigest = MessageDigest.getInstance(algorithmName);
  }
  public void setAlgorithmName(String algorithmName) {
    this.algorithmName = algorithmName;
  }
}