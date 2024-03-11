package com.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.model.Product;
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
	@GetMapping("/getOne/{id}")
	public Product getOneRec(@PathVariable int id)
	{
		return serv.getOne(id);
	}
	@DeleteMapping("/delete/{id}")
	public void deleteOne(@PathVariable int id)
	{
		serv.delete(id);
	}
	
	@GetMapping("/getAll")
	public List<Product> getAllRec()
	{
		return serv.getAll();
	}
	@PutMapping("/edit/{id}")
	public Product editRecord(@RequestBody Product pro,@PathVariable int id)
	{
		return serv.editPro(pro, id);
	}
	
	

}
