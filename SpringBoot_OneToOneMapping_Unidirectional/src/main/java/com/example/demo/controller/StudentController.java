package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepositor;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {

    private final StudentRepositor studentRepositor;

	@Autowired
	private StudentService studentService;

    StudentController(StudentRepositor studentRepositor) {
        this.studentRepositor = studentRepositor;
    }
	@PostMapping("/saveStudentData")
	public String saveStudentData(@RequestBody Student student) {
		this.studentService.saveStudentData(student);
		return "save student data";
	}
}
