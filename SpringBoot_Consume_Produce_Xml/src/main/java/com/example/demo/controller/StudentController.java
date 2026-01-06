package com.example.demo.controller;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.Studentsevice;

@RestController
public class StudentController {

	@Autowired
	private Studentsevice studentsevice;
	@PostMapping(value="/saveData", consumes = MediaType.APPLICATION_XML_VALUE)
	public String saveStudentData(@RequestBody Student student) {
		this.studentsevice.saveNewData(student);
		return "Data saved";
	}
	@GetMapping(value="/getData", produces  = MediaType.APPLICATION_XML_VALUE)
	public Iterable<Student>  getAll() {
		Iterable<Student> students= this.studentsevice.getAll();
		return students;
	}
	@GetMapping(value="/getData/{id}", produces = MediaType.APPLICATION_XML_VALUE)
	public Student  getSingleById(@PathVariable("id") int id) {
		Optional<Student> optional = this.studentsevice.getSingleById(id);
	        Student st = optional.get();
		return st;
	}
}
