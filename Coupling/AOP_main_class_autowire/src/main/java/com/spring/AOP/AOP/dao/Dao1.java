package com.spring.AOP.AOP.dao;

import org.springframework.stereotype.Repository;

@Repository
public class Dao1 {

	public String retrieveSomething() {
		 System.out.println("dao1 ");
		return "DAO1";
	}
	
}
