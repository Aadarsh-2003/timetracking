package com.arth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.arth.entity.ModuleEntity;
import com.arth.entity.ProjectEntity;
import com.arth.entity.ProjectStatusEntity;
import com.arth.entity.TaskEntity;
import com.arth.repository.ModuleRepository;
import com.arth.repository.ProjectRepository;
import com.arth.repository.ProjectStatusRepository;
import com.arth.repository.TaskRepository;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class TaskController {
	
	@Autowired
	ProjectRepository prRepo; //for projectId
	
	@Autowired
	ProjectStatusRepository prStsRepo; //for project status
	
	@Autowired
	ModuleRepository modRepo; //for module Id
	
	@Autowired
	TaskRepository taskRepo;
	
	@GetMapping("/newtask")
	public String newTask(Model model) {
		
		List<ProjectEntity> prId = prRepo.findAll();
		model.addAttribute("prId", prId);
		
		List<ProjectStatusEntity> prStatus = prStsRepo.findAll();
		model.addAttribute("prStatus", prStatus);
		
		List<ModuleEntity> moduleId = modRepo.findAll();
		model.addAttribute("mdId", moduleId);
		
		return "NewTask";
	}
	@PostMapping("/savetask")
	public String saveTask(TaskEntity taskEntity) {
		
		System.out.println(taskEntity.getTitle());
		taskRepo.save(taskEntity);
		return "redirect:/listtask";
	}
	@GetMapping("/listtask")
	public String listTask(Model model) {
		
		List<TaskEntity> tasks = taskRepo.findAll();
		model.addAttribute("tsk", tasks);
		
		return "ListTask";
	}
	@GetMapping("/deletetask")
	public String deleteTask(@RequestParam("id") Integer tskId) {
		taskRepo.deleteById(tskId);
		return "redirect:/listtask";
	}
	
	
	
	

}
