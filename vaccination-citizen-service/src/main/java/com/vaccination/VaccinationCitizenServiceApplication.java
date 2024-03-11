package com.vaccination;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class VaccinationCitizenServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(VaccinationCitizenServiceApplication.class, args);
	}

}
