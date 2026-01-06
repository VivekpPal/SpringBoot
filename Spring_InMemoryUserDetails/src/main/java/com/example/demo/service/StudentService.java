package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Student;

@Service
public class StudentService {
	
	List<Student> list= new ArrayList();
	
	
	public StudentService() {
		list.add(new Student(101,"Ram","ram"));
		list.add(new Student(102,"Shyam","shyam"));
		list.add(new Student(103,"Vivek","vvek"));
		list.add(new Student(104,"Avya","avya"));
		

	}
	public List<Student> getAll()
	{
		return list;
		
	
		
		
	}
	
	

}
