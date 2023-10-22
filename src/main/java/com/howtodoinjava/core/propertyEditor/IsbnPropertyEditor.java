package com.howtodoinjava.core.propertyEditor;

import org.springframework.util.StringUtils;

import java.beans.PropertyEditorSupport;

public class IsbnPropertyEditor extends PropertyEditorSupport {

  @Override
  public void setAsText(String text) throws IllegalArgumentException {
    if (StringUtils.hasText(text)) {
      setValue(new Isbn(text.trim()));
    } else {
      setValue(null);
    }
  }

  @Override
  public String getAsText() {
    Isbn isbn = (Isbn) getValue();
    if (isbn != null) {
      return isbn.getIdentifier();
    } else {
      return "";
    }
  }
}
