package com.ust.factorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FactorialServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FactorialServiceApplication.class, args);
	}

}
