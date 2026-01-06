package com.example.demo.controller;
import com.example.demo.service.repository.StudentRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {

    private final StudentRepository studentRepository;

	@Autowired
	StudentService studentService;

    StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
	
	@PostMapping("/save")
	public String saveStudentDta(@RequestBody  Student student) {
		this.studentService.saveStudent(student);
		return "Data save";
	}
	@GetMapping("/getAll")
	public List<Student> getAll(){
		 List<Student> students	=this.studentService.getAllData();
		return students;
	}
}
