package com.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.entity.Student;
import com.rest.repo.StudentRepo;

@Service
public class StudentServiceIMp implements StudentService{
@Autowired
private StudentRepo repo;
	@Override
	public Student saveStu(Student stu) {
		double t=stu.getSub1()+stu.getSub2()+stu.getSub3();
		stu.setTotal(t);
		if(stu.getSub1()>37&&stu.getSub2()>37 &&stu.getSub3()>37)
		{	stu.setResult("pass");
			stu.setPercentage(t/3);
			if(stu.getPercentage()>=80)
			{
				stu.setGrade("A-Grade");
			}
			
			else if(stu.getPercentage()>=70)
			{
				stu.setGrade("B-Grade");
			}else if(stu.getPercentage()>=60)
			{
				stu.setGrade("C-Grade");
			}
			else 
				stu.setGrade("D-grade");
			
		}
		else {
			stu.setResult("fail");
			stu.setGrade("-");
		}
		
		repo.save(stu);
		return stu;
	}
	@Override
	public Student getOne(Integer id) {

		Student s= repo.findById(id).get();
		
		return s;
	}
	@Override
	public List<Student> getAll() {
		List<Student>stds=repo.findAll();
		
		return stds;
	}
	@Override
	public void deleteRec(Integer id) {
		repo.deleteById(id);
	}
	@Override
	public Student edit(Student stu, Integer id) {

		Student s=repo.findById(id).get();
		s.setCourse("dotNet");
		repo.save(s);	
		return s;
	}
	
	
	
	

}
