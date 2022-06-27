package com.spring.AOP.AOP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.AOP.AOP.Business.Business1;
import com.spring.AOP.AOP.Business.Business2;

	
	@SpringBootApplication
	public class AopApplication {
	public static void main(String[] args) {
		ApplicationContext applicationContext =	SpringApplication.run(AopApplication.class, args);
		
	Business1 bus1 = applicationContext.getBean(Business1.class)	;
	Business2 bus2 = applicationContext.getBean(Business2.class)	;
		
	System.out.println("AopApplication1");
	
	bus1.calculateSomething();
	
	bus2.calculateSomething();
		
	}
}