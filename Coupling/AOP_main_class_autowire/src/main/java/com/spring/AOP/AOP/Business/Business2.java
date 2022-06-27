package com.spring.AOP.AOP.Business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.AOP.AOP.dao.Dao2;

@Service
public class Business2 {

	@Autowired
	   private Dao2 d2;
	   
	   public String calculateSomething() {
		   //business logic 
		   System.out.println("business2 ");
		   return d2.retrieveSomething();
	   }
	
}
