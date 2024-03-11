package com.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.entity.Employee;
import com.rest.repo.EmpRepo;
@Service
public class EmpServiceImp implements EmpService{

	@Autowired
	private EmpRepo repo;
	
	@Override
	public Employee saveEmp(Employee emp) {
		
		double ta=0.0,da=0.0,hra=0.0,pf=0.0,nt=0.0,grs=0.0;
		
		//Employee e=new Employee();
		
		if(emp.getEsalary()<30000 ) {
			
			ta=(emp.getEsalary()*7)/100;
			da=(emp.getEsalary()*9)/100;
			hra=(emp.getEsalary()*11)/100;
			pf=(emp.getEsalary()*13)/100;
		}
		 
		else if(emp.getEsalary()>30000 && emp.getEsalary()<=50000 ) {
			
			ta=(emp.getEsalary()*9)/100;
			da=(emp.getEsalary()*11)/100;
			hra=(emp.getEsalary()*13)/100;
			pf=(emp.getEsalary()*15)/100;
		}
		
		else if(emp.getEsalary()>50000 ) {
			
			ta=(emp.getEsalary()*11)/100;
			da=(emp.getEsalary()*13)/100;
			hra=(emp.getEsalary()*15)/100;
			pf=(emp.getEsalary()*17)/100;
		}
		
		emp.setDa(da);
		emp.setTa(ta);
		emp.setHra(hra);
		emp.setPf(pf);
		grs=emp.getEsalary()+ta+da+hra+pf;
		emp.setGross(grs);
		nt=grs-pf;
		emp.setNet(nt);
		
		
		Employee e= repo.save(emp);
		
		
		
		return e;
	}

	@Override
	public void deleteRecord(Integer id) {
		repo.deleteById(id);
	}

	@Override
	public Employee getOne(Integer id) {

		Employee e= repo.findById(id).get();
		return e;
	}

	@Override
	public Employee edit(Employee e, Integer id) {
		
		Employee emp= repo.findById(id).get();
		emp.setEname(e.getEname());
		
		emp.setEsalary(e.getEsalary());
		
double ta=0.0,da=0.0,hra=0.0,pf=0.0,nt=0.0,grs=0.0;
		
		//Employee e=new Employee();
		
		if(emp.getEsalary()<30000 ) {
			
			ta=(emp.getEsalary()*7)/100;
			da=(emp.getEsalary()*9)/100;
			hra=(emp.getEsalary()*11)/100;
			pf=(emp.getEsalary()*13)/100;
		}
		 
		else if(emp.getEsalary()>30000 && emp.getEsalary()<=50000 ) {
			
			ta=(emp.getEsalary()*9)/100;
			da=(emp.getEsalary()*11)/100;
			hra=(emp.getEsalary()*13)/100;
			pf=(emp.getEsalary()*15)/100;
		}
		
		else if(emp.getEsalary()>50000 ) {
			
			ta=(emp.getEsalary()*11)/100;
			da=(emp.getEsalary()*13)/100;
			hra=(emp.getEsalary()*15)/100;
			pf=(emp.getEsalary()*17)/100;
		}
		
		emp.setDa(da);
		emp.setTa(ta);
		emp.setHra(hra);
		emp.setPf(pf);
		grs=emp.getEsalary()+ta+da+hra+pf;
		emp.setGross(grs);
		nt=grs-pf;
		emp.setNet(nt);
		
		
		Employee emp1= repo.save(emp);
		
		
		
		
		return emp1;
	}

	@Override
	public List<Employee> getAll() {
		 
		return repo.findAll();
	}


}
