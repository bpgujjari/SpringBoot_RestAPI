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

import com.rest.entity.Student;
import com.rest.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService serv;
	
	@PostMapping("/save")
	public Student saveStu(@RequestBody Student stu)
	{ Student s= serv.saveStu(stu); 
	
	return s;
	}
	@GetMapping("/get/{id}")
	public Student getOne(@PathVariable int id)
	{
		Student s= serv.getOne(id);
		return s;
	}
	@GetMapping("/getAll")
	public List<Student> getAll()

	{
		return serv.getAll();
	}
	@DeleteMapping("/delete/{id}")
	public void deleteRec(@PathVariable int id)
	{
		serv.deleteRec(id);
	}
	
	@PutMapping("/edit/{id}")
	public Student editStu(@RequestBody Student stu,@PathVariable int id)
	{  
		return serv.edit(stu, id);
	}
	
}
