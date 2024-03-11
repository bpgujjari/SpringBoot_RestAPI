package com.rest.service;

import java.util.List;

import com.rest.entity.Employee;

public interface EmpService {
public Employee saveEmp(Employee emp);
public void deleteEmp(Integer id);
public Employee get(Integer id);
public List<Employee> getAllRecords();
public Employee editEmp(Employee emp,Integer id);
}
