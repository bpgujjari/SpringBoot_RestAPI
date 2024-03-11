package com.angualr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.angualr.entity.User;
import com.angualr.repo.UsersRepo;
@Service
public class UserServiceImp implements UserService {
	
	@Autowired
	private UsersRepo repo;

	@Override
	public User saveUser1(User user) {
		repo.save(user);
		return user;
	}

	@Override
	public User getByName(String name) {
		
		User u= repo.findByName(name);
		return u; 
	}

	@Override
	public List<User> getAll() {
		return repo.findAll();
	}


	

	

}
