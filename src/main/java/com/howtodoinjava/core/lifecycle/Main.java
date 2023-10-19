package com.howtodoinjava.core.lifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
  public static void main(String[] args) {
    var applicationContext = new AnnotationConfigApplicationContext(Config.class);
    applicationContext.registerShutdownHook();
  }
}
