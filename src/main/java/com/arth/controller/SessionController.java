
package com.arth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.arth.bean.UserBean;

@Controller
public class SessionController {
	
	@GetMapping("/") // url used for accessing
	public String welcome() {
		return"Welcome"; //jsp file name
	}
	
	@GetMapping("/signup") // url used for accessing
	public String signUp() {
		return"SignUp"; // jsp file name
	}
	
	@GetMapping("/login") // url used for accessing
	public String login() {
		return"Login"; // jsp file name
	}
	
	@PostMapping("/saveuser") // url used for accessing
	public String saveUser(UserBean user) {
		
		System.out.println(user.getFirstName());
		System.out.println(user.getLastName());
		System.out.println(user.getEmail());
		System.out.println(user.getPassword());
		System.out.println("saveuserrr");
		return"Home"; // jsp file name
	}
	

}
