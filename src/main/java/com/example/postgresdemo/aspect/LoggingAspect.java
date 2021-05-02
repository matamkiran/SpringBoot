package com.example.postgresdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	/**
	  * Declaring before advice for all transfer methods whose taking three arguments of any type 
	  * of all classes in the package com.doj.aopapp.service
	  * @param jp
	  * @throws Throwable
	  */
	 @Before("execution(* com.example.postgresdemo.service.*.*(..))")
	 public void beforeAdviceForTransferMethods(JoinPoint jp) throws Throwable {
	        System.err.println("****LoggingAspect.beforeAdviceForTransferMethods() " + jp.getSignature().getName());
	    }

}
