package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.Studentservice;
@RestController
public class StudentController {

	@Autowired
	Studentservice studentservice;
	
	//pagination
	@GetMapping(value="/student")
	public Page<Student>  getAllData(@RequestParam(defaultValue = "0") int page,
			@RequestParam(defaultValue = "3") int size) {
		Page<Student> p = this.studentservice.getAllData(page, size);
		return p;
	}
	@GetMapping("/students")
	public Page<Student> getData_Page_Sort(@RequestParam(defaultValue = "0")int page,
			@RequestParam(defaultValue = "3") int size,
			@RequestParam(defaultValue = "name")String sortBy,
			@RequestParam(defaultValue = "asc")String sortDir
	) {
		
		Page<Student> p = this.studentservice.getDataBy_Page_sort(page, size, sortBy, sortDir);
		return p;
	}
}
