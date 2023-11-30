package com.howtodoinjava.core.autowire.byType;

import org.springframework.beans.factory.annotation.Autowired;

public class ShapeService {

  @Autowired
  private Shape shape;

  public void drawShape() {
    if (shape != null) {
      shape.draw();
    } else {
      System.out.println("No shape set.");
    }
  }
}
