package com.example.demo.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;



@RestController
public class Homecontroller {

	@Autowired
	StudentService studentService;
	
	
	@GetMapping("/test")
	public String test() {
		return "TEsting....";
	}
	@GetMapping("/get")
	public List<Student> getAllData(){
		List<Student> list = this.studentService.getAll();
		return list;
	}
	@GetMapping("/currentUser")
	public String getWhoHasLoggedIn(Principal principal) {
		return principal.getName()+"This is the logged in user ";
		
	}
}
