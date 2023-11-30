package com.howtodoinjava.core.autowire.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ShapeService {

  @Autowired(required = false)
  public ShapeService(Shape shape) {
    this.shape = shape;
  }

  private Shape shape;

  public void drawShape() {
    if (shape != null) {
      shape.draw();
    } else {
      System.out.println("No shape set.");
    }
  }
}
