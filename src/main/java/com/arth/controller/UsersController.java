package com.arth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import jakarta.persistence.Table;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.arth.entity.RoleEntity;
import com.arth.entity.UsersEntity;
import com.arth.repository.ProjectRepository;
import com.arth.repository.RoleRepository;
import com.arth.repository.UsersRepository;
import com.arth.service.MailerService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
@Table(name="users")
public class UsersController {
	
	@Autowired
	UsersRepository userRepo;
	
	@Autowired
	RoleRepository roleRepo;
	
	@Autowired
	ProjectRepository prRepo;
	
	@Autowired
	BCryptPasswordEncoder encodePass;
	
	@Autowired
	MailerService mailerService;
	
	
	@GetMapping("/newuser")
	public String newUser(Model model) {
		List<RoleEntity> role = roleRepo.findAll();
		model.addAttribute("rl", role);
		
		return "NewUser";
	}
	@PostMapping("/savenewuser")
	public String saveUser(UsersEntity user) {
		
		System.out.println(user.getFirstName());
		
		// get pass
				String plainPass = user.getPassword();

				// encrypt
				String encodedPassword = encodePass.encode(plainPass);

				// save encrypted data into database
				user.setPassword(encodedPassword);

				userRepo.save(user);
				mailerService.sendWelcomeMail(user.getEmail());
		
		userRepo.save(user);
		return "redirect:/listuser";
	}
	@GetMapping("/listuser")
	public String listUser(Model model) {
		
		List<UsersEntity> users = userRepo.findAll();
		model.addAttribute("ur", users);
		
		
		
		return "ListUser";
	}
	@GetMapping("/deleteuser")
	public String deleteUser(@RequestParam("id") Integer dlUsr) {
		userRepo.deleteById(dlUsr);
		return "redirect:/listuser";
	}
	
	
	
	
	
	
	

}
