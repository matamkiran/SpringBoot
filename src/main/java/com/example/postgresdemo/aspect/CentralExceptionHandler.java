package com.example.postgresdemo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class CentralExceptionHandler {
	
	@Around("execution(* com.example.postgresdemo.repository.*.*(..))")
	public void handleException(ProceedingJoinPoint jp) throws Throwable {
		String view = null;
		
		try {
			
			Object obj=jp.proceed();
			System.err.println(obj);
		} catch (DataAccessException e) {
			System.err.println("hello Around advice logging ");
			System.err.println(e.getLocalizedMessage());
		}
		
	}
}
