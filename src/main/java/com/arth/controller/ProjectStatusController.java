package com.arth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.arth.entity.ProjectStatusEntity;
import com.arth.entity.RoleEntity;
import com.arth.repository.ProjectStatusRepository;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class ProjectStatusController {
	
	@Autowired
	ProjectStatusRepository statusRepo;
	
	@GetMapping("/newprojectstatus")
	public String newProjectStatus() {
		return "NewProjectStatus";
	}
	
	@PostMapping("/saveprojectstatus")
	public String saveProjectStatus(ProjectStatusEntity status) {
		
		System.out.println(status.getStatus());
		
		//insert
		statusRepo.save(status);
		
		return "redirect:/listprojectstatus";
	}
	@GetMapping("/listprojectstatus")
	public String listProjectStatus(Model model) {
		
		List<ProjectStatusEntity> projectStatus = statusRepo.findAll();// will run {select * from roles} querry
		
		model.addAttribute("prsts", projectStatus);
		return "ListProjectStatus" ;
	}
	
	

}
