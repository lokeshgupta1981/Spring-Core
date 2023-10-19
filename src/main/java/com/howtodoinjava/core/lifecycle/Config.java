package com.howtodoinjava.core.lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

  @Bean
  DemoBean demoBean() {
    return new DemoBean();
  }

  @Bean
  NewBean newBean() {
    return new NewBean();
  }

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

class NewBean {

}
