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

import com.rest.entity.Employee;
import com.rest.service.EmpService;

@RestController
public class EmpController {
	@Autowired
	private EmpService serv;
	
	@PostMapping("/save")
	public String saveEmp(@RequestBody Employee emp)
	{
		Employee e=serv.saveEmp(emp);
		String message=null;
		if(e!=null)
		{message="data inserted Successfully...";
		}
		else
		{
			message="data not inserted";
		}
		return message;
	
	}	
	
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id)
	{
		serv.deleteEmp(id);
		return"deleted";
	}
	
	@GetMapping("/get/{id}")
	
	public Employee getEmp(@PathVariable int id)
	{
		
		Employee e= serv.get(id);
		return e;
	}
	
	@GetMapping("/getAll")
	public List<Employee> getAllRc()
	{
		List<Employee> emps=serv.getAllRecords();
		return emps;
	}
	
	@PutMapping("/edit/{id}")
	public Employee update(@RequestBody Employee emp,@PathVariable int id)
	{
		Employee e= serv.editEmp(emp, id);
		return e;
	}
	
}
