package com.howtodoinjava.core.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Order(1)
@Component
public class LoggingAspect {
  private static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

  @Before("execution(* com.howtodoinjava.core.aop.service.EmployeeService.*(..))")
  public void logBefore() {

    logger.info("LoggingAspect: Logging before method execution");
    // Logging logic
  }
}