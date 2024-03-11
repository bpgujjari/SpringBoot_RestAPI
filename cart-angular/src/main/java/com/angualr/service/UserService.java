package com.angualr.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.angualr.entity.User;

public interface UserService {
	
	public User saveUser1(User user);
	public User getByName(String name);
	public List<User> getAll();

}
