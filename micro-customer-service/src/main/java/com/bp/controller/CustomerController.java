package com.bp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bp.entity.MicroCustomer;
import com.bp.repo.CustemerRepo;

@RestController
public class CustomerController {
	@Autowired
	private CustemerRepo repo;
	@PostMapping("/save")
	public String saveCustomer(@RequestBody MicroCustomer customer)
	{
		MicroCustomer mc=repo.save(customer);
		return "success";
	}

}
