package com.howtodoinjava.core.propertyEditor;

import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
public class Config {

  @Bean
  public IsbnPropertyEditor isbnPropertyEditor() {
    return new IsbnPropertyEditor();
  }

  @Bean
  CustomEditorConfigurer customEditorConfigurer(){
    var configurer = new CustomEditorConfigurer();
    configurer.setCustomEditors(Map.of(Isbn.class, IsbnPropertyEditor.class));
    return configurer;
  }
}
