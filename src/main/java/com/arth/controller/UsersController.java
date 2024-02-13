package com.arth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import jakarta.persistence.Table;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.arth.entity.RoleEntity;
import com.arth.entity.UsersEntity;
import com.arth.repository.RoleRepository;
import com.arth.repository.UsersRepository;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
@Table(name="users")
public class UsersController {
	
	@Autowired
	UsersRepository userRepo;
	
	@Autowired
	RoleRepository roleRepo;
	
	
	@GetMapping("/newuser")
	public String newUser(Model model) {
		List<RoleEntity> role = roleRepo.findAll();
		model.addAttribute("rl", role);
		
		return "NewUser";
	}
	@PostMapping("/savenewuser")
	public String saveUser(UsersEntity user) {
		
		System.out.println(user.getFirstName());
		
		userRepo.save(user);
		return "redirect:/listuser";
	}
	@GetMapping("/listuser")
	public String listUser(Model model) {
		
		List<UsersEntity> users = userRepo.findAll();
		model.addAttribute("ur", users);
		return "ListUser";
	}
	
	
	

}
