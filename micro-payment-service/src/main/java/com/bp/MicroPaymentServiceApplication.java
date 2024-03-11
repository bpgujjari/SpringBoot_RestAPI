package com.bp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroPaymentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroPaymentServiceApplication.class, args);
	}

}
