package com.sethi.demoProject;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {
	
	public void drive() {
		System.out.println("car chal rahi hai ");
	}

}
