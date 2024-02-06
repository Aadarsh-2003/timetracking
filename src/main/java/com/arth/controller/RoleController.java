package com.arth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.arth.bean.RoleBean;
import com.arth.bean.UserBean;

@Controller
public class RoleController {
	
	
	@GetMapping("/rolename") // url used for accessing
	public String roleName() {
		return"Home"; //jsp file name
	}
	
	@PostMapping("/saverole") // url used for accessing
	public String saveUser(RoleBean role) {
		
		System.out.println(role.getRoleName());
		System.out.println("saveuserrr");
		return"Home"; // jsp file name
	}

}
