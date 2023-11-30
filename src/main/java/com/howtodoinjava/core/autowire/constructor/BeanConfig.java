package com.howtodoinjava.core.autowire.constructor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class BeanConfig {

  @Bean
  Square square() {
    return new Square();
  }

  @Bean
  Circle circle() {
    return new Circle();
  }
}
