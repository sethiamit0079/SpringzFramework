package com.spring.AOP.AOP;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.AOP.AOP.Business.Business1;
import com.spring.AOP.AOP.Business.Business2;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class AopApplication2 implements CommandLineRunner {
//what we have defined in command line runner would be invoked
//as soon as the application is launched.

//great thing about runner no need to write code in static thing.
//can autowired things

	private org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	Business1 buss1;
	
	@Autowired
	Business2 buss2;
	
	public static void main(String[] args) {
		
		SpringApplication.run(AopApplication2.class, args);
	}

	
//inside run method i can do whatever i want as soon as the application launches 
//once the application gets launches runner get invoked
@Override
public void run(String... args) throws Exception {
	// TODO Auto-generated method stub
	
	System.out.println("AopApplication2");
	logger.info(buss1.calculateSomething());
	logger.info(buss2.calculateSomething());
	
}


}
