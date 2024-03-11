package com.profiles.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.profiles.entity.User;
import com.profiles.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService serv;
	
	 @GetMapping("/getAll")
	public List<User> getUsers()
	{
		
		return serv.getAll();
	}
}
