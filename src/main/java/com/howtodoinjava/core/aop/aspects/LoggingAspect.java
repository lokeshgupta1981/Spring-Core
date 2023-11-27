package com.howtodoinjava.core.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Order(1)
@Component
public class LoggingAspect {

  private static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

  @Before("execution(* com.howtodoinjava.core.aop.service.EmployeeService.*(..))")
  public void logBeforeAllMethods(JoinPoint joinPoint) {
    logger.info("LoggingAspect: Logging before aspect execution");
  }

  @After("execution(* com.howtodoinjava.core.aop.service.EmployeeService.*(..))")
  public void logAfterAllMethods(JoinPoint joinPoint) {
    logger.info("LoggingAspect: Logging after aspect execution");
  }

  @Around("execution(* com.howtodoinjava.core.aop.service.EmployeeService.*(..))")
  public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
    // Custom logic before the method execution
    logger.info("Before method execution");

    // Proceed with the actual method execution
    Object result = joinPoint.proceed();

    // Custom logic after the method execution
    logger.info("After method execution");
    return result;
  }

  @AfterReturning(pointcut = "execution(* com.howtodoinjava.core.aop.service.EmployeeService.*(..))"
      , returning = "result")
  public void afterReturningAdvice(Object result) {

    // Custom logic after the method successfully returns
    logger.info("After returning advice: Processing the result - " + result);
  }

  @AfterThrowing(pointcut = "execution(* com.howtodoinjava.core.aop.service.EmployeeService.*(..))", throwing = "ex")
  public void afterThrowingAdvice(Exception ex) {
    // Custom logic after the method throws an exception
    logger.error("After throwing advice: Exception caught - " + ex.getMessage());
    // Additional handling or logging can be implemented here
    throw new IllegalArgumentException("Exception handled in aspect", ex);
  }
}