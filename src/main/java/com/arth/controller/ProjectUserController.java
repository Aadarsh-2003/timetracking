package com.arth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.arth.entity.ProjectEntity;
import com.arth.entity.ProjectUserEntity;
import com.arth.entity.UsersEntity;
import com.arth.repository.ProjectRepository;
import com.arth.repository.ProjectUserRepository;
import com.arth.repository.UsersRepository;

@Controller
public class ProjectUserController {
	
	@Autowired
	ProjectUserRepository prUserRepo;
	
	@Autowired
	ProjectRepository prRepo;
	
	@Autowired
	UsersRepository urRepo;
	
	@GetMapping("/newprojectuser")
	public String newProjectUser(Model model) {
		
		List<ProjectEntity> projects = prRepo.findAll();
		model.addAttribute("prj", projects);
		
		List<UsersEntity> userId = urRepo.findAll();
		model.addAttribute("usrs", userId);
		
		return"NewProjectUser";
	}
	@PostMapping("/saveprojectuser")
	public String postMethodName(ProjectUserEntity projectUserEntity) {
		
		System.out.println(projectUserEntity.getUserId());
		prUserRepo.save(projectUserEntity);
		return "redirect:/listprojectuser";
	}
	@GetMapping("/listprojectuser")
	public String listProjectUser(Model model) {
		List<ProjectUserEntity> projectUsers = prUserRepo.findAll();
		model.addAttribute("prusers", projectUsers);
		return "ListProjectUser";
	}
	
	
	

}
