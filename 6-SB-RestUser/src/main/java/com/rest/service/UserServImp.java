package com.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.entity.User;
import com.rest.repo.UserRepo;

@Service
public class UserServImp  implements UserService {
	@Autowired
	private UserRepo repo;
	
	@Override
	public User saveUser(User user) {
		return user;
	}

}
