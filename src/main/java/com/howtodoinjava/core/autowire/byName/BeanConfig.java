package com.howtodoinjava.core.autowire.byName;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

  @Bean
  Square square() {
    return new Square();
  }

  @Bean
  Circle circle() {
    return new Circle();
  }

  @Bean
  ShapeService shapeService() {
    return new ShapeService();
  }
}
