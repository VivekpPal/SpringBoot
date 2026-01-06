package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.service.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;
	
public void saveStudent(Student student) {
		this.studentRepository.save(student);
	}

public List<Student>  getAllData() {
	List<Student> list = this.studentRepository.findAll();
	return list;
}
}
