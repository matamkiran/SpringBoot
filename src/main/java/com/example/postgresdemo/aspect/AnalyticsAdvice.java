package com.example.postgresdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

/*
@Configuration
@Aspect*/
public class AnalyticsAdvice {
  @Pointcut("within(com.example.postgresdemo.repository.*)")
  private void allDao() {
  }

  @Pointcut("execution(* update(..))")
  private void updateMethod() {
  }

  //Special analytics for Update methods
  @Before("allDao() && updateMethod()")
  public void specialAnalytics(JoinPoint joinPoint) {
    System.out.println("Call special analytics for: "
        + joinPoint.getSignature());
  }

  //general analytics for other methods
  @Before("allDao() && !updateMethod()")
  public void generalAnalytics(JoinPoint joinPoint) {
    System.out.println("Call general analytics for:"
        + joinPoint.getSignature());
  }
}
