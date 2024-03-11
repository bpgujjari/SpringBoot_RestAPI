package com.rest.service;

import java.util.List;

import com.rest.entity.Student;

public interface StudentService {
public Student saveStu(Student stu);
public Student getOne(Integer id);
public List<Student> getAll();
public void deleteRec(Integer id);
public Student edit(Student stu,Integer id);
}
