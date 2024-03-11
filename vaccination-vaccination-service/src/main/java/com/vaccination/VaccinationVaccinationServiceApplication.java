package com.vaccination;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class VaccinationVaccinationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(VaccinationVaccinationServiceApplication.class, args);
	}

}
