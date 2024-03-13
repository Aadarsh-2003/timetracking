package com.arth.controller.users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.arth.entity.ProjectEntity;
import com.arth.entity.ProjectUserEntity;
import com.arth.entity.UsersEntity;
import com.arth.repository.ProjectRepository;
import com.arth.repository.ProjectUserRepository;

import jakarta.servlet.http.HttpSession;


@Controller
public class UserAccountController {
	
	@Autowired
	ProjectUserRepository prUserRepo;
	
	@Autowired
	ProjectRepository prRepo;
	
	@GetMapping("/userlistproject")
	public String UserListProject(Model model,ProjectUserEntity prUser,HttpSession session) {
		
		UsersEntity user = (UsersEntity)session.getAttribute("usrName");
		List<ProjectUserEntity> projects = prUserRepo.findByUserId(user.getUserId());
		model.addAttribute("projects", projects);
		
		List<ProjectEntity> prjct = prRepo.getProjectByUserId(user.getUserId());
		model.addAttribute("prjct", prjct);
		
		return "UserListProject";
	}
	
	

}
