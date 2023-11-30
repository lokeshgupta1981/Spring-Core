package com.howtodoinjava.core.autowire.constructor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutowiredByConstructorExample {

  public static void main(String[] args) {

    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

    ShapeService shapeService = context.getBean(ShapeService.class);
    shapeService.drawShape();
  }
}
