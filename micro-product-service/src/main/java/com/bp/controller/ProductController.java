package com.bp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bp.model.MicroProduct;
import com.bp.repo.ProductRepo;

@RestController
public class ProductController {
	
	@Autowired 
	private ProductRepo repo;
	
	@PostMapping("/save")
	public String saveProduct(@RequestBody MicroProduct mp)
	{	repo.save(mp);
		return "success";
	}

}
