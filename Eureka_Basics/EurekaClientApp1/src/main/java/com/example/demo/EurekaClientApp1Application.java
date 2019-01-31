package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClientApp1Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientApp1Application.class, args);
	}

}

