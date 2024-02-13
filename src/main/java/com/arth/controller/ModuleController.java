package com.arth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.arth.entity.ModuleEntity;
import com.arth.entity.ProjectEntity;
import com.arth.entity.ProjectStatusEntity;
import com.arth.repository.ModuleRepository;
import com.arth.repository.ProjectRepository;
import com.arth.repository.ProjectStatusRepository;


@Controller
public class ModuleController {
	
	@Autowired
	ModuleRepository moduleRepo;
	
	@Autowired
	ProjectRepository prRepo; //for projectId
	
	@Autowired
	ProjectStatusRepository prStsRepo; //for project status
	
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
	
	
	

}
