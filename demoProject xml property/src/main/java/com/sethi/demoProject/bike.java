package com.sethi.demoProject;

import org.springframework.stereotype.Component;

@Component
public class bike implements Vehicle {
	
	public void drive() {
		System.out.println("bike chal rahi hai ");
	}

}
