package com.springmvc.mvc.comtroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springmvc.mvc.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	LoginService service ;
	
	// method=RequestMethod.GET restricts it to only serve get request 
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String showLogin() {
		return "login";
	}
	
	
	// @RequestParam get parameter from request
	//type of req param is String
	//name of request param emailFilled is the same name given in login page.
	// <input type="text" name="emailFilled"/>
	//used same name so no need to use attributeparameter
	
	
	//use models to pass information b/w controller and view
	//need to show this email on the jsp
	//way by which we can add model in any method is by adding parameter modelmap
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String handleLoginReq(@RequestParam String emailFilled,@RequestParam String pass, ModelMap model ) {
		
		
	if(!service.validateUser(emailFilled, pass)) {
		model.put("errorMessage", "In validcredentials");
		
		return "login";
	}
		//what ever put in model is directly available to view		
				model.put("emailShow", emailFilled);
				model.put("passShow", pass);
				System.out.println(emailFilled);
				return "welcome";
	
	}
	
}























