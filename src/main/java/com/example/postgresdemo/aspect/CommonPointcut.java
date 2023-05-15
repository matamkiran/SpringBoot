package com.example.postgresdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/*@Aspect*/
public class CommonPointcut {

  @Pointcut("execution(* com.example.postgresdemo.repository.*.*(..))")
  public void anyDaoMethod() {}
}
