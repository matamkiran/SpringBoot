package com.example.postgresdemo.interceptor;
import java.time.Instant;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.MDC;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Component
public class MyApplicationInterceptor extends HandlerInterceptorAdapter {
	
	Instant instant = Instant.now();
	long timeStampMillis = instant.toEpochMilli();	
	private String TRACE_HEADER = "X-Trace-Id";
    
    public MyApplicationInterceptor() {
        MDC.put("transactionId", UUID.randomUUID().toString());
    }
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		/**
		 * UUID stands for Universally Unique Identifier. UUID are standardized by the Open Software Foundation (OSF). 
		 * It is a part of Distributive Computing Environment (DCE). A UUID is 36 characters long unique number.
		 *  It is also known as a Globally Unique Identifier (GUID).
		 *  It is used to create the following:
			1) Session ID for web application
			2) Transaction ID
			3) Random file name
			4) The primary key for database table
		 */
		String traceID = UUID.randomUUID().toString();
	
		System.err.println(request.getHeader(TRACE_HEADER));
		 if(request.getHeader(TRACE_HEADER) ==null) { 
			 traceID =request.getHeader(TRACE_HEADER); }
		 
		if(request.getAttribute(TRACE_HEADER)==null ) {
				request.setAttribute(TRACE_HEADER, traceID);
	     }
		
        MDC.put("transactionId", traceID);
        
		System.out.println("Entered preHandle interceptor.  "+ traceID);
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) {
		System.out.println("Entered postHandle interceptor.");
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception exception) {
		System.out.println("Entered afterCompletion iterceptor.");
	}
}
