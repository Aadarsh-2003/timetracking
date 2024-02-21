package com.arth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class AdminDashboardController {
	
	@GetMapping("/admindashboard")
	public String adminDashboard() {
		return "AdminDashboard";
	}
	
	@GetMapping("/masterpage")
	public String masterPage() {
		return "MasterPage";
	}
	

}
