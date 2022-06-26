package com.sethi.demoProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component    //name same ignore capital in app.java
public class Car implements Vehicle {
	
	@Autowired
	private tyre  tyr;
	
	
	
	public tyre getTyr() {
		return tyr;
	}



	public void setTyr(tyre tyr) {
		this.tyr = tyr;
	}



	public void drive() {
		System.out.println(tyr);
	}

}
