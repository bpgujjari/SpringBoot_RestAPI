package com.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.entity.Employee;
import com.rest.service.EmpService;

@RestController
@CrossOrigin("*")
public class EmpController {
	@Autowired
	private EmpService serv;

	@PostMapping("/save")
	public Employee saveEmployee(@RequestBody Employee employee)
	{
		Employee e=serv.saveEmp(employee);
		return e;
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id)
	{
		serv.deleteRecord(id);
	}
	
	@GetMapping("get/{id}")
	public Employee getOneRec(@PathVariable int id)
	{
		Employee emp= serv.getOne(id);
		return  emp;
	}
	
	@PutMapping("/edit/{id}")
	public Employee editOne(@PathVariable int id, @RequestBody Employee emp)
	{
		Employee ep=serv.edit(emp,id);
		return ep;
	}
	
	@GetMapping("/getAll")
	public List<Employee> getAllRecs()
	{
		return serv.getAll();
	}

}
