package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService studentService;
	
	@PostMapping("/save")
	public String saveData(@RequestBody Student student) {
		this.studentService.saveData(student);
		return "Data saved";
	}
	
	public List<Student> getAll() {
		List<Student> students=this.studentService.getAllStudent();
		return students;
	}
	
	

}
