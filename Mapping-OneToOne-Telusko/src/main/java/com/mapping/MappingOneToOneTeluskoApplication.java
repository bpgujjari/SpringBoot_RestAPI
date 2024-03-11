package com.mapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mapping.entity.Laptop;
import com.mapping.entity.Student;
import com.mapping.repo.LaptopRepo;
import com.mapping.repo.StudentRepo;

@SpringBootApplication
public class MappingOneToOneTeluskoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MappingOneToOneTeluskoApplication.class, args);
	}
	
	@Autowired
	private StudentRepo srp;
	
	@Autowired
	private LaptopRepo lrp;

	@Override
	public void run(String... args) throws Exception {

		
		Laptop l1=new Laptop();
		l1.setId(2);
		l1.setName("dell");
		
		Student s1=new Student();
		s1.setId(200);
		s1.setName("shyam");
		s1.setLaptop(l1);
		
		lrp.save(l1);
		 System.out.println(srp.save(s1));
		
		
	}

}
