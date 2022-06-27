package com.spring.AOP.AOP.Business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.AOP.AOP.dao.Dao1;
import com.spring.AOP.AOP.dao.Dao2;

@Service
public class Business1 {

	@Autowired
	   private Dao1 d1;
	   
	   public String calculateSomething() {
		   //business logic 
		   System.out.println("business1 ");
		   return d1.retrieveSomething();
	   }
	
}
