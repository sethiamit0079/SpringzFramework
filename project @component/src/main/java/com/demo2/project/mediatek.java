package com.demo2.project;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class mediatek implements mobileprocessor {

	public void process() {
		// TODO Auto-generated method stub
System.out.println("MEdiatek 400");
	}
}
