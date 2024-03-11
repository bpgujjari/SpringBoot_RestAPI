package com.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.entity.User;
import com.rest.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService serv;
	
	@PostMapping("/save")
	public User saveUserr(User user)
	{
		return serv.saveUser(user);
	}
}
