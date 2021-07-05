package com.capstone.infyorders;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class InfyordersApplication {

	public static void main(String[] args) {
		SpringApplication.run(InfyordersApplication.class, args);
	}

}
