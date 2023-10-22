package com.howtodoinjava.core.propertyEditor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
  public static void main(String[] args) {
    var ctx = new AnnotationConfigApplicationContext(Config.class);
    var isbnPropertyEditor = ctx.getBean(IsbnPropertyEditor.class);
    isbnPropertyEditor.setAsText("978-0132350884");
    Isbn isbn = (Isbn) isbnPropertyEditor.getValue();
    System.out.println(isbn.getIdentifier());
    ctx.close();
  }
}
