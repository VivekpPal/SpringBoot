package com.example.demo.entity;

import com.example.demo.dto.StudentDto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	
	private int id;
	private String name;
	private String city;
	

}
