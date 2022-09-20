package com.list.project.listProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.list.project.listProject.model.Todo;
import com.list.project.listProject.service.LoginService;


//durgesh  rest api

@RestController
public class LoginController {
	
	
	@Autowired
	LoginService service;
	

	@GetMapping("/data")
	public List<Todo> data(){
		return service.geTodo();
	}
	
	@GetMapping("/data/{id}")
	public Todo dataOne(@PathVariable int id){
		return service.geTodoOne(id);
	}
	
	@PostMapping("/data")
	public Todo addToData(@RequestBody Todo input) {
		
		return this.service.addTo(input);
	}
	
	
	
	
	

}
