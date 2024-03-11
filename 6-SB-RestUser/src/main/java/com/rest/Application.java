package com.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rest.entity.User;
import com.rest.repo.UserRepo;

@SpringBootApplication
public class Application  implements CommandLineRunner {
	@Autowired
	private UserRepo rep;
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	

}
