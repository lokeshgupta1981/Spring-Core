package com.howtodoinjava.core.autowire.byName;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutowiredByNameExample {

  public static void main(String[] args) {

    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

    ShapeService shapeService = context.getBean(ShapeService.class);
    shapeService.drawShape();
  }
}
