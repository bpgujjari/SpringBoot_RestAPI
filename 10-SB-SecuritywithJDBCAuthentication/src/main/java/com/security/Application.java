package com.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import ch.qos.logback.core.encoder.Encoder;

@SpringBootApplication
public class Application {
	@Autowired
	private BCryptPasswordEncoder encoder;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		
		BCryptPasswordEncoder b= new BCryptPasswordEncoder();
		String encode= b.encode("mgr@420");
		
		System.out.println(encode);
	}

}
