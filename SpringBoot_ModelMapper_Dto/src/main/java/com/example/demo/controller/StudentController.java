package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.StudentDto;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService studentService;
	@PostMapping("/save")
	public String saveData(@RequestBody StudentDto dto) {
		this.studentService.saveStudent(dto);
		return "Data save";
		
	}
	@GetMapping("/get/{id}")
	public StudentDto getStudentById(@PathVariable("id") int id) {
		StudentDto dto = this.studentService.getById(id);
		return dto;
	}
}
