package com.sethi.demoProject;

import org.springframework.stereotype.Component;

@Component  //name same ignore capital in app.java
public class tyre {
	private String brand;

	public String getBrand() {
		return brand;
	}

	

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return " use me as a tyre";
	}
	
	

}
