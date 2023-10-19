package com.howtodoinjava.core.beanNaming;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    var applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
    Arrays.stream(applicationContext.getBeanDefinitionNames()).forEach(System.out::println);

    var demoBean = applicationContext.getBeansOfType(DemoBean.class);

    demoBean.forEach((k, v) -> {
      var aliases = applicationContext.getAliases(k);
      if (aliases.length > 0) {
        Arrays.stream(aliases).forEach(System.out::println);
      }
    });
  }
}
