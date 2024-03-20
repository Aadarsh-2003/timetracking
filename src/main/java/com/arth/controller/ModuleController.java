package com.arth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.arth.entity.ModuleEntity;
import com.arth.entity.ProjectEntity;
import com.arth.entity.ProjectStatusEntity;
import com.arth.repository.ModuleRepository;
import com.arth.repository.ProjectRepository;
import com.arth.repository.ProjectStatusRepository;
import com.arth.repository.UsersRepository;


@Controller
public class ModuleController {
	
	@Autowired
	ModuleRepository moduleRepo;
	
	@Autowired
	ProjectRepository prRepo; //for projectId
	
	@Autowired
	ProjectStatusRepository prStsRepo; //for project status
	
	@Autowired
	UsersRepository urRepo;
	
	@GetMapping("/newmodule")
	public String newModule(Model model) {
		
		List<ProjectEntity> prId = prRepo.findAll();
		model.addAttribute("prId", prId);
		
		List<ProjectStatusEntity> prStatus = prStsRepo.findAll();
		model.addAttribute("prStatus", prStatus);
		
		return"NewModule";
	}
	@PostMapping("/savemodule")
	public String saveModule(ModuleEntity moduleEntity) {
		
		System.out.println(moduleEntity.getModuleName());
		moduleRepo.save(moduleEntity);
		return"redirect:/listmodule";
	}
	@GetMapping("/listmodule")
	public String listModule(Model model) {
		List<ModuleEntity> modules = moduleRepo.findAll();
		model.addAttribute("m", modules);
		return"ListModule";
	}
	@GetMapping("/deletemodule")
	public String deleteModule(@RequestParam("id") Integer moduleId) {
		moduleRepo.deleteById(moduleId);
		return"redirect:/listmodule";
	}
	@GetMapping("/listassignedprojectmodules")
	public String listAssignedProjectModules(Model model,@RequestParam("projectId") Integer projectId) {
		
		
		model.addAttribute("prj", prRepo.findById(projectId).get());
		//  model.addAttribute("modl", moduleRepo.findById(moduleId).get()); 
		model.addAttribute("modules",moduleRepo.getModuleByProjectId(projectId));
		
		return "ListAssignedProjectModules";
	}
	@GetMapping("/listassignedmoduleuser")
	public String listAssignedModuleUser(Model model,@RequestParam("moduleId") Integer moduleId) {
		
		
		model.addAttribute("modl", prRepo.findById(moduleId).get());
		model.addAttribute("userss",urRepo.getUsersByModuleId(moduleId));
		
		return "ListAssignedModuleUser";
	}
	
	
	
	

}
