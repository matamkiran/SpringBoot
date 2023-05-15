package com.example.postgresdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author kk
 *
 */
/*
 * @Aspect
 * 
 * @Component
 * 
 * @Order(1)
 */
public class TransactionAspect {
 
 /**
  * Declaring before advice for all transfer methods whose taking three arguments of any type 
  * of all classes in the package com.doj.aopapp.service
  * @param jp
  * @throws Throwable
  */
 @Before("execution(* com.example.postgresdemo.service.*.*(..))")
 public void beforeAdviceForTransferMethods(JoinPoint jp) throws Throwable {
        System.out.println("****TransactionAspect.beforeAdviceForTransferMethods() " + jp.getSignature().getName());
    }
 
}