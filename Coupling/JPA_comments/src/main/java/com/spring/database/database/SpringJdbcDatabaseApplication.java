package com.spring.database.database;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.database.database.jdbc.PersonJdbcDao;

import ch.qos.logback.classic.Logger;

//@SpringBootApplication

public class SpringJdbcDatabaseApplication implements CommandLineRunner {

	private org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonJdbcDao dao;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcDatabaseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	System.out.println("values");
		logger.info("All user -> {}", dao.findAll());
		
		//logger.info("user id 1001 -> {}", dao.findById(1001));
		
		logger.info("Delete 1002 -> no of row - {}", dao.deleteById(1002));
		
	}

}
