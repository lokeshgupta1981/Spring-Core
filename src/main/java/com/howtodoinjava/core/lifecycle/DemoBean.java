package com.howtodoinjava.core.lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class DemoBean {

  @PostConstruct
  public void customInit()
  {
    System.out.println("Method customInit() invoked...");
  }

  @PreDestroy
  public void customDestroy()
  {
    System.out.println("Method customDestroy() invoked...");
  }
}
