package com.howtodoinjava.core.factorybean;

import org.springframework.beans.propertyeditors.CurrencyEditor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.security.MessageDigest;

public class Main {
  public static void main(String[] args) {
    /*var ctx = new AnnotationConfigApplicationContext(Config.class);
    MessageDigester digester = ctx.getBean(MessageDigester.class);
    String message = digester.digest("Hello World!");
    System.out.println(message);
    ctx.close();*/

    var ctx = new AnnotationConfigApplicationContext(Config.class);
    MessageDigestFactoryBean factoryBean = (MessageDigestFactoryBean) ctx.getBean("&shaDigest");
    try {
      MessageDigest shaDigest = factoryBean.getObject();
      System.out.println("Explicit use digest bean: " + shaDigest.digest("Hello world".getBytes()));
    } catch (Exception ex) {
      System.out.println("Could not find MessageDigestFactoryBean " + ex);
    }
    ctx.close();
  }
}
