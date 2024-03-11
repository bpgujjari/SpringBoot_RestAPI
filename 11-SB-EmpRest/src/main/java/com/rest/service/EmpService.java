package com.rest.service;

import java.util.List;

import com.rest.entity.Employee;

public interface EmpService {
	public Employee saveEmp(Employee employee);
	public void deleteRecord(Integer id);
	public Employee getOne(Integer id);
	public Employee edit(Employee emp,Integer id);
	public List<Employee> getAll();

}
