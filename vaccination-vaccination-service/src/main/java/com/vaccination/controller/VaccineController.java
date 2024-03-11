package com.vaccination.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vaccination.model.Vaccination;
import com.vaccination.repo.VaccineRepo;

@RestController
public class VaccineController {
	
	@Autowired
	private VaccineRepo repo;
	
	@PostMapping("/add")
	public Vaccination addCenter(@RequestBody Vaccination vacc)
	{
		return repo.save(vacc);
	}
	
	@GetMapping("/test")
	public ResponseEntity<String> test()
	{
		return new ResponseEntity<String>("hello", HttpStatus.METHOD_NOT_ALLOWED);
	}

}
