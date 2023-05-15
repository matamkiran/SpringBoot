package com.example.postgresdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/*@Aspect
@Component
@Order(0)*/
public class LoggingAspect {
	
	/**
	  * Declaring before advice for all transfer methods whose taking three arguments of any type 
	  * of all classes in the package com.doj.aopapp.service
	  * @param jp
	  * @throws Throwable
	  */
	 @Before("execution(* com.example.postgresdemo.service.*.*(..))")
	 public void beforeAdviceForTransferMethods(JoinPoint jp) throws Throwable {
	        System.err.println("****LoggingAspect.beforeAdviceForTransferMethods() sept 21 2021" + jp.getSignature().getName());
	    }
	 
	 /**
	  * Declaring before advice for all transfer methods whose taking three arguments of any type 
	  * of all classes in the package com.doj.aopapp.service
	  * @param jp
	  * @throws Throwable
	  */
	 @Before("execution(* com.example.postgresdemo.controller.*.*(..))")
	 public void beforeAdviceForquestionMethods(JoinPoint jp) throws Throwable {
	        System.err.println("****LoggingAspect.beforeAdviceForTransferMethods() " + jp.getSignature().getName());
	    }
	 
	 /**
	  * Declaring before advice for all transfer methods whose taking three arguments of any type 
	  * of all classes in the package com.doj.aopapp.service
	  * @param jp
	  * @throws Throwable
	  */
	 @After("execution(* com.example.postgresdemo.controller.*.*(..))")
	 public void afterAdviceForquestionMethods(JoinPoint jp) throws Throwable {
	        System.err.println("****LoggingAspect.afterAdviceForTransferMethods() " + jp.getSignature().getName());
	    }
	 
	 
}
