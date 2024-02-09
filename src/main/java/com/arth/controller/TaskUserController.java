package com.arth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.arth.entity.TaskUserEntity;
import com.arth.repository.TaskUserRepository;

@Controller
public class TaskUserController {
	
	@Autowired
	TaskUserRepository taskUserRepo;
	
	@GetMapping("/newtaskuser")
	public String newTaskUser() {
		return "NewTaskUser";
	}
	@PostMapping("/savetaskuser")
	public String saveTaskUser(TaskUserEntity taskUserEntity) {
		
		System.out.println(taskUserEntity.getTaskUserId());
		taskUserRepo.save(taskUserEntity);
		return "redirect:/listtaskuser";
	}
	@GetMapping("/listtaskuser")
	public String listTaskUser(Model model) {
		
		List<TaskUserEntity> taskUsers = taskUserRepo.findAll();
		model.addAttribute("taskUsers", taskUsers);
		return "ListTaskUser";
	}
	
	
	

}
