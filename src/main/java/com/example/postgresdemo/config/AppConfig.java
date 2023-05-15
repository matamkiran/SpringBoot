package com.example.postgresdemo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.example.postgresdemo.interceptor.MyApplicationInterceptor;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages={"com.example.postgresdemo.aspect", "com.example.postgresdemo.service"})
public class AppConfig  implements WebMvcConfigurer {
	
	@Autowired
	private MyApplicationInterceptor interceptorObject;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(interceptorObject);
	}


}
