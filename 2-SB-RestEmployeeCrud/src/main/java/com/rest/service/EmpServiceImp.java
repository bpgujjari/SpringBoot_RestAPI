package com.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.entity.Employee;
import com.rest.repo.EmpRepo;
@Service
public class EmpServiceImp implements EmpService {
	@Autowired
	private EmpRepo repo;
	

	@Override
	public Employee saveEmp(Employee emp) {
		Employee e=repo.save(emp);
		return e;
	}


	@Override
	public void deleteEmp(Integer id) {

		repo.deleteById(id);
	}


	@Override
	public Employee get(Integer id) {

		Employee e=repo.findById(id).get();
		return e;
	}


	@Override
	public List<Employee> getAllRecords() {
		List<Employee> empss=repo.findAll();
		return empss;
	}


	@Override
	public Employee editEmp(Employee emp, Integer id) {
		Employee e=repo.findById(id).get();
		e.setName(emp.getName());
		e.setEmail(emp.getEmail());	
		repo.save(e);
		return e;
	}


	

}
