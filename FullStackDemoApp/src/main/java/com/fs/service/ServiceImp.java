package com.fs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fs.model.FullStackDemo;
import com.fs.repo.FullStackDemoRepo;
@Service
public class ServiceImp  implements FullStackDemoService{

	@Autowired
	private FullStackDemoRepo repo;
	
	@Override
	public FullStackDemo saveUser(FullStackDemo fs) {
		return repo.save(fs);
	}

}
