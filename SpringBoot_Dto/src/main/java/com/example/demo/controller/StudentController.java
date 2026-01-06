package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Converter;
import com.example.demo.dto.StudentDto;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService studentService;
	
	
	@Autowired
	private Converter converter;
	@PostMapping
	public void saveStudent(@RequestBody StudentDto dto) {
		
		//use converter
		Student student = converter.dtoToEntity(dto);
		this.studentService.saveStudent(student);
	}
}
