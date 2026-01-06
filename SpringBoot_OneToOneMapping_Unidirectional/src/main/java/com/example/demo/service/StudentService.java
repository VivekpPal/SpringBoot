package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepositor;

@Service
public class StudentService {

	@Autowired
	private StudentRepositor studentRepositor;
	
	public void saveStudentData(Student  student) {
		this.studentRepositor.save(student);
	}
}
