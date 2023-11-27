package com.howtodoinjava.core.aop;

import com.howtodoinjava.core.aop.service.EmployeeService;
import com.howtodoinjava.core.demo.beans.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

    EmployeeService employeeService = context.getBean(EmployeeService.class);
    employeeService.save(new Employee());

    context.close();
  }
}
