package com.rest.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
