package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public void saveData(Student student) {
		this.studentRepository.save(student);
	}
	public 	Iterable<Student>  getData() {
		Iterable<Student> students = this.studentRepository.findAll();
		return students;
	}

}
