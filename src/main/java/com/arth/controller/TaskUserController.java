package com.arth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.arth.entity.ProjectStatusEntity;
import com.arth.entity.TaskEntity;
import com.arth.entity.TaskUserEntity;
import com.arth.entity.UsersEntity;
import com.arth.repository.ProjectStatusRepository;
import com.arth.repository.TaskRepository;
import com.arth.repository.TaskUserRepository;
import com.arth.repository.UsersRepository;

@Controller
public class TaskUserController {
	
	@Autowired
	TaskUserRepository taskUserRepo;
	
	@Autowired
	UsersRepository urRepo; //user
	
	@Autowired
	TaskRepository taskRepo; //task
	
	@Autowired
	ProjectStatusRepository prStsRepo; //project_status
	
	@GetMapping("/newtaskuser")
	public String newTaskUser(Model model) {
		
		List<UsersEntity> users = urRepo.findAll();
		model.addAttribute("urs", users);
		
		List<TaskEntity> tasks = taskRepo.findAll();
		model.addAttribute("tsk", tasks);
		
		List<ProjectStatusEntity> prjStatus = prStsRepo.findAll();
		model.addAttribute("prSts", prjStatus);
		
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
