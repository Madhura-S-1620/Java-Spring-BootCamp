package com.example.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloMicroserviceApplication {

	public static void main(String[] args) {

		SpringApplication.run(HelloMicroserviceApplication.class, args);
		System.out.println("Hello, microservices is running fine");
	}

}
