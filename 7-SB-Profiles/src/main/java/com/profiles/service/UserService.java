package com.profiles.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.profiles.entity.User;
import com.profiles.repo.UserRepo;

@Service
public class UserService {
	@Autowired
	private UserRepo repo;
	
	
	public List<User> getAll()
	{
		return repo.findAll(); 
	}
}
