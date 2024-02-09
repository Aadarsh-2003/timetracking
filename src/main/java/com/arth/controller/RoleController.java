package com.arth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.arth.entity.RoleEntity;
import com.arth.repository.RoleRepository;


@Controller
public class RoleController {
	
	@Autowired
	RoleRepository roleRepo;
	
	
	@GetMapping("/newrole") // url used for accessing
	public String newRole() {
		return"NewRole"; //jsp file name
	}
	
	@PostMapping("/saverole") // url used for accessing
	public String saveUser(RoleEntity role) {
		
		System.out.println(role.getRoleName());
		
		
		//insert
		roleRepo.save(role);
		return"redirect:/listrole"; // jsp file name
	}
	
	@GetMapping("/listrole")
	public String listRole(Model model) {
		
		List<RoleEntity> roles = roleRepo.findAll();// will run {select * from roles} querry
		
		model.addAttribute("r", roles);
		return "ListRole" ;
	}
	

}
