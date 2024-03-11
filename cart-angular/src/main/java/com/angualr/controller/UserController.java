package com.angualr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.angualr.entity.User;
import com.angualr.service.UserService;

@RestController
public class UserController {
	
	@Autowired 
	private UserService service;
	
	@PostMapping("/save")
	public User saveUser(@RequestBody User user) {
		return service.saveUser1(user);
	}
	
	@GetMapping("/getAll")
	public List<User> getAll(){
		return service.getAll();
		
	}
	
	@GetMapping("/getUserByName/{name}")
	public User getUser(@PathVariable String name){ 
		return service.getByName(name); 
	}

}
