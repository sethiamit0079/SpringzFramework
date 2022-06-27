package com.springmvc.mvc.service;

import org.springframework.stereotype.Service;

//new login service
@Service
public class LoginService {
	
	public boolean validateUser(String email, String pass) {
		return email.equalsIgnoreCase("amit") && pass.equalsIgnoreCase("123");
	}

}
