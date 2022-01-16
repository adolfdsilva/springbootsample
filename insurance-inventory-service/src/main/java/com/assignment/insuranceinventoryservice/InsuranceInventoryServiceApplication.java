package com.assignment.insuranceinventoryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class InsuranceInventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InsuranceInventoryServiceApplication.class, args);
	}

}
