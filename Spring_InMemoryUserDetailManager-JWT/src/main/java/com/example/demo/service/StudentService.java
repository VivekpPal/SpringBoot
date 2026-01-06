package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;

@Service
public class StudentService {

	List<Student> list= new ArrayList();
	
	public StudentService() {
		list.add(new Student(101,"ram","ram","ram@gmail.com"));
		list.add(new Student(102,"ajay","ajay","ajay@gmail.com"));
		list.add(new Student(103,"aman","aman","aman@gmail.com"));
		
	}
	//get all 
	public List<Student> getAllData(){
		
		
		return list;
	}
	
}
