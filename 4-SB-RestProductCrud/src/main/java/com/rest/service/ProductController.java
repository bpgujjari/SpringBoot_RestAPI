package com.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.entity.Product;
import com.rest.service.ProductService;

@RestController
public class ProductController {
	
	
	@Autowired
	private ProductService serv;
	
	@PostMapping("/save")
	public Product save(@RequestBody Product pro)
	{
		
		Product p= serv.saveProd(pro);
		return p;
		 
	}
	

}
