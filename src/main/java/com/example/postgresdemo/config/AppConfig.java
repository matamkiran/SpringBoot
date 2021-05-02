package com.example.postgresdemo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages={"com.example.postgresdemo.aspect", "com.example.postgresdemo.service"})
public class AppConfig {

}
