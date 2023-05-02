package com.howtodoinjava.core.demo.beans;

import jakarta.activation.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.howtodoinjava.core.demo.beans")
public class AppConfig {

  @Bean
  DataSource dataSource(){
    //...
    return null;
  }
}

