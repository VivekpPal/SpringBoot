package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
@OpenAPIDefinition(
		info = @Info(title = "College managment API",
		version = "1.0",
		description = "These APIs are for college Management System"
				)
		)
@SpringBootApplication
public class SwaggerProgrammApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerProgrammApplication.class, args);
		System.out.println("app run..");
	}

}
