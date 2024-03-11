package com.vaccination.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vaccination.model.Citizen;
import com.vaccination.repo.CitizenRepo;

@RestController
public class CitizenController {
	
	
	@Autowired
	private CitizenRepo repo;
	
	
	@PostMapping("/add")
	public Citizen addCitizen(@RequestBody Citizen cz)
	{
		return repo.save(cz);
	}

}
