package com.arth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.arth.entity.TaskEntity;
import com.arth.repository.TaskRepository;

@Controller
public class TaskController {
	
	@Autowired
	TaskRepository taskRepo;
	
	@GetMapping("/newtask")
	public String newTask() {
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
	
	
	

}
