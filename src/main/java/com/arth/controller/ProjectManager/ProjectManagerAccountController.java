package com.arth.controller.ProjectManager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.arth.entity.ProjectEntity;
import com.arth.entity.ProjectUserEntity;
import com.arth.entity.UsersEntity;
import com.arth.repository.ProjectRepository;
import com.arth.repository.ProjectUserRepository;
import com.arth.repository.UsersRepository;

@Controller
public class ProjectManagerAccountController {
	
	@Autowired
	ProjectRepository prRepo;
	
	@Autowired
	UsersRepository urRepo;
	
	@Autowired
	ProjectUserRepository prUserRepo;
	
	@GetMapping("/pmassignprojectuser")
	public String pmAssignProjectUser(Model model) {
		
		List<ProjectEntity> projects = prRepo.findAll();
		model.addAttribute("prj", projects);
		
		List<UsersEntity> userId = urRepo.findAll();
		model.addAttribute("usrs", userId);
		
		return"PMAssignProjectUser";
	}
	
	@PostMapping("/pmsaveprojectuser")
	public String pmSaveProjectUser(ProjectUserEntity projectUserEntity) {
		
		projectUserEntity.setAssignStatus(1);
		System.out.println(projectUserEntity.getUserId());
		prUserRepo.save(projectUserEntity);
		return "redirect:/pmlistprojectuser";
	}
	@GetMapping("/pmlistprojectuser")
	public String pmListProjectUser(Model model) {
		List<ProjectUserEntity> projectUsers = prUserRepo.findAll();
		model.addAttribute("prusers", projectUsers);
		
		return "PMListProjectUser";
	}
	@GetMapping("/revokeassignedprojectuser")
	public String revokeAssignedProjectUser(@RequestParam("id") Integer prUsr) {
		prUserRepo.deleteById(prUsr);
		return "redirect:/pmlistprojectuser";
	}
}
