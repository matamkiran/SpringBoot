package com.example.postgresdemo;

import javax.persistence.EntityManagerFactory;

import org.hibernate.SessionFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringBootRestAPIApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestAPIApplication.class, args);
	}
	
	/**
	 * Hibernate configuration with spring boot 
	 * @param emf
	 * @return SessionFactory
	 */
	@Bean	
	public SessionFactory sessionFactory(EntityManagerFactory emf) {
	    return emf.unwrap(SessionFactory.class);
	}
}
