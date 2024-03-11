package com.fs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fs.model.FullStackDemo;
import com.fs.service.FullStackDemoService;
@CrossOrigin("*")
@RestController
public class FullStackDemoController {

	
	@Autowired
	private FullStackDemoService serv;
	
	
	@PostMapping("/saveUser")
	public FullStackDemo saveUserC(@RequestBody FullStackDemo fs)
	{
		return serv.saveUser(fs);
	}
}
