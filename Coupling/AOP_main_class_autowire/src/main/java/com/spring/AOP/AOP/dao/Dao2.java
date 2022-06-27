package com.spring.AOP.AOP.dao;

import org.springframework.stereotype.Repository;

@Repository
public class Dao2 {

	public String retrieveSomething() {
		 System.out.println("dao2 ");
		return "DAO2";
	}
	
}
