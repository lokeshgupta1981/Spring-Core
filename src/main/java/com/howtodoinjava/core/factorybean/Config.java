package com.howtodoinjava.core.factorybean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

  @Bean
  public MessageDigestFactoryBean shaDigest(){
    MessageDigestFactoryBean shaDigest =  new MessageDigestFactoryBean();
    shaDigest.setAlgorithmName("SHA1");
    return shaDigest;
  }

  @Bean
  public MessageDigester digester() throws Exception {
    MessageDigester messageDigester = new MessageDigester();
    messageDigester.setDigest(shaDigest().getObject());
    return messageDigester;
  }
}
