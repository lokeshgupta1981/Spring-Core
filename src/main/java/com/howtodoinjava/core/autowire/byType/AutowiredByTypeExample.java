package com.howtodoinjava.core.autowire.byType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiredByTypeExample {

  public static void main(String[] args) {

    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

    ShapeService shapeService = context.getBean(ShapeService.class);
    shapeService.drawShape();
  }
}
