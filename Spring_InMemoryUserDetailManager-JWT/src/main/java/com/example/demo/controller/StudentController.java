package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentService studentService;
	
	
	@GetMapping("/test")
	public String test() {
		return "just for test.....";
	}
	@GetMapping("/get")
	public List<Student> getAll(){
		List<Student> list = this.studentService.getAllData();
		return list;
}
}
