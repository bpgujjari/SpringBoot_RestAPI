package com.bp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AmazonServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmazonServicesApplication.class, args);
	}

}
