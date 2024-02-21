
package com.arth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.arth.bean.UserBean;
import com.arth.entity.UsersEntity;
import com.arth.repository.UsersRepository;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class SessionController {
	
	@Autowired
	UsersRepository urRepo;
	
	@Autowired
	BCryptPasswordEncoder encodePass;
	
	@GetMapping("/") // url used for accessing
	public String welcome() {
		return"Welcome"; //jsp file name
	}
	
	@GetMapping("/signup") // url used for accessing
	public String signUp() {
		return"SignUp"; // jsp file name
	}
	
	@PostMapping("/saveuser") // url used for accessing
	public String saveUser(UsersEntity user,Model model) {
		
		if(!user.getPassword().equals(user.getConfirmPassword()) ) {
			model.addAttribute("conPassErr", "Password and Confirm password must be same");
			return"SignUp";
		}
			
		user.setRoleId(3);
		
		//get pass
		String plainPass = user.getPassword();
		
		// encrypt
		 String encodedPassword = encodePass.encode(plainPass);
		
		// save encrypted data into database
		 user.setPassword(encodedPassword);
		 
		 
		urRepo.save(user);
		return"redirect:/login"; // jsp file name
		
	}
	
	@GetMapping("/login") // url used for accessing
	public String login() {
		return"Login"; // jsp file name
	}
	@PostMapping("/authentication")
	public String authentication(UsersEntity user,Model model) {
		
		UsersEntity loggedInUser =  urRepo.findByEmail(user.getEmail());
		
		if(loggedInUser==null) {
			model.addAttribute("Error", "Invalid Credentials");
			return "Login";
		}else if(encodePass.matches(user.getPassword(), loggedInUser.getPassword())) {
			
			if(loggedInUser.getRoleId()== 1) {
				return "AdminDashboard";
			}else if(loggedInUser.getRoleId()== 3 ) {
				return "DeveloperDashboard";
			}else if(loggedInUser.getRoleId()== 5) {
				return"ProjectManagerDashboard";
			}else {
				model.addAttribute("Er", "Something went wrong , try again");
				return "Login";
			}
			
		}
		model.addAttribute("Er", "Something went wrong , try again");
		return "Login";
		
		
		
	}
	
	
	
	
	
	

}
