package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringInMemoryUserDetailManagerJwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringInMemoryUserDetailManagerJwtApplication.class, args);
		System.out.println("app running..");
	}

}
