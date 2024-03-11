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
		l1.setId(4);
		l1.setName("macbok");
		lrp.save(l1);
		
		Student s1=new Student();
		s1.setId(102);
		s1.setName("shyam");
		s1.getLaptop().add(l1);
		
		try {
		
		srp.save(s1);
		
		
		l1.getStudent().add();
		lrp.save(l1);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
