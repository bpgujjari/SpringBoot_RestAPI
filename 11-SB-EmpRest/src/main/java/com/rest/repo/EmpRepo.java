package com.rest.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.*;
import com.rest.entity.Employee;

public interface EmpRepo extends JpaRepository<Employee, Integer>{
	
	 @Query("SELECT u FROM User u WHERE u.firstName = ?1")
	    List<Employee> findByName(String firstName);

}
