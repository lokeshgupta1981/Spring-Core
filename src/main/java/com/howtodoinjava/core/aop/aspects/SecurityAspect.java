package com.howtodoinjava.core.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.annotation.Order;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Order(2)
@Component
public class SecurityAspect {
  private static final Logger logger = LoggerFactory.getLogger(SecurityAspect.class);

  @Before("execution(* com.howtodoinjava.core.aop.service.EmployeeService.*(..))")
  public void checkSecurity() {

    logger.info("SecurityAspect: Performing security check before method execution");
    // Security check logic
  }
}