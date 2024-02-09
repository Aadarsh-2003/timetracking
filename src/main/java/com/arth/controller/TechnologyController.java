package com.arth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import jakarta.persistence.Table;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.arth.entity.TechnologyEntity;
import com.arth.repository.TechnologyRepository;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
@Table(name="technology")
public class TechnologyController {
	
	@Autowired
	TechnologyRepository techRepo;
	
	@GetMapping("/newtechnology")
	public String newTechnology() {
		return "NewTechnology";
	}
	@PostMapping("/savetechnology")
	public String saveTechnology(TechnologyEntity technology) {
		
		System.out.println(technology.getTitle());
		
		techRepo.save(technology);
		return "redirect:/listtechnology";
	}
	@GetMapping("/listtechnology")
	public String listTechnology(Model model) {
		
		List<TechnologyEntity> technologies = techRepo.findAll();
		model.addAttribute("tech", technologies);
		
		return "ListTechnology";
	}
	
	
	

}
