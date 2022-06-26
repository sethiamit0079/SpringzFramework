package com.example.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class homeController {
	
	@RequestMapping("home")
	public String home(String name) {
		
		System.out.println("hi "+name);
		return "home";
		}
	
}
