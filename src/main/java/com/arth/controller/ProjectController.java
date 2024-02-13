package com.arth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.arth.entity.ProjectEntity;
import com.arth.entity.ProjectStatusEntity;
import com.arth.repository.ProjectRepository;
import com.arth.repository.ProjectStatusRepository;

@Controller
public class ProjectController {

	@Autowired
	ProjectRepository prRepo;

	@Autowired
	ProjectStatusRepository prStsRepo;

	@GetMapping("/newproject")
	public String newProject(Model model) {

		List<ProjectStatusEntity> projectStatus = prStsRepo.findAll();

		model.addAttribute("prSts", projectStatus);

		return "NewProject";
	}

	@PostMapping("/saveproject")
	public String saveProject(ProjectEntity project) {
		System.out.println(project.getProjectTitle());

		prRepo.save(project);
		return "redirect:/listproject";
	}

	@GetMapping("/listproject")
	public String listProject(Model model) {
		List<ProjectEntity> projects = prRepo.findAll();

		model.addAttribute("pr", projects);
		return "ListProject";
	}

}
