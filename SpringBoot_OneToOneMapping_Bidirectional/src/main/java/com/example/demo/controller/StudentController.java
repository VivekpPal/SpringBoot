package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;

	@PostMapping("/saveData")
	public String saveData(@RequestBody Student student) {
		this.studentService.saveData(student);
		return "Data saved";
		
	}
	@GetMapping("/getAllData")
	public Iterable<Student>  getAllData() {
		Iterable<Student> student = this.studentService.getData();
		return student;
	}
}
