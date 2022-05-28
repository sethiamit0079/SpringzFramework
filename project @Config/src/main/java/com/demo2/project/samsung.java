package com.demo2.project;

import org.springframework.beans.factory.annotation.Autowired;

public class samsung {
	
	@Autowired
	mobileprocessor cpu;
	
	public mobileprocessor getCpu() {
		return cpu;
	}

	public void setCpu(mobileprocessor cpu) {
		this.cpu = cpu;
	}


	public void config() {
		System.out.println("Samsung A21");
		cpu.process();
	}

}
