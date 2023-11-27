package com.howtodoinjava.core.aop.service;

import com.howtodoinjava.core.aop.aspects.SecurityAspect;
import com.howtodoinjava.core.demo.beans.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

  private static final Logger logger = LoggerFactory.getLogger(EmployeeService.class);

  public Employee save(Employee employee) {
    logger.info("Saving the Employee...");
    return null;
  }
}
