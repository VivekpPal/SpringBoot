package com.example.demo.dto;


import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfic {

	@Bean
	public ModelMapper getModelMapperBean() {
		
		
		return new ModelMapper();
		
		
	}
}
