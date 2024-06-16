package com.helloworld.restapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestappApplication {

	public static void main(String[] args) {
		System.out.println("Starting the application Hello World");
		SpringApplication.run(RestappApplication.class, args);
	}

}
