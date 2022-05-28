package com.demo2.project;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public samsung getPhone() {
		return new samsung();
	}
	
	@Bean
	public mobileprocessor getProcessor() {
		return new snapdragon();
	}
	

}
