package com.mapping.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mapping.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
