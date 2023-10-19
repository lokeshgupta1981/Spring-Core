package com.howtodoinjava.core.beanNaming;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(nameGenerator = CustomBeanNameGenerator.class)
public class AppConfig {

  @Bean(value = {"newBeanName", "newBeanName-1", "newBeanName-2"})
  DemoBean demoBean(){
    return new DemoBean();
  }

  /*@Bean(value = "anotherNewBeanName")
  DemoBean anotherDemoBean(){
    return new DemoBean();
  }*/
}
