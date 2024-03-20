package com.arth.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.arth.entity.UsersEntity;
import com.arth.repository.ProjectRepository;

import jakarta.servlet.http.HttpSession;



@Controller
public class AdminDashboardController {
	
	@Autowired
	ProjectRepository prRepo;
	
	@GetMapping("/admindashboard")
	public String adminDashboard(Model model, HttpSession session) {
		
		UsersEntity user = (UsersEntity)session.getAttribute("usrName");
		
		LocalDateTime lt = LocalDateTime.now();
		Integer month = lt.getMonthValue();
		Integer day = lt.getDayOfMonth();
		Integer nextMonth = lt.getMonthValue() + 1;
		Integer year = lt.getYear();
		
		
		
		Integer TotalProj = prRepo.getProjects();
		model.addAttribute("TotalProj", TotalProj);
		
		Integer OngoingProj = prRepo.getOngoingProjects();
		model.addAttribute("OngoingProj", OngoingProj);
		
		Integer PipelineProj = prRepo.getPipelineProjects();
		model.addAttribute("PipelineProj", PipelineProj);
		
		Integer DueProj = prRepo.getdueProjects(month,day);
		model.addAttribute("DueProj", DueProj);
		
		System.out.println(year);
		
		return "AdminDashboard";
	}
	
	@GetMapping("/masterpage")
	public String masterPage() {
		return "MasterPage";
	}
	
	@GetMapping("/inputform")
	public String inputForm() {
		return "InputForm";
	}
	
	
	
	

}
