package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class Studentsevice {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public void saveNewData(Student student) {
		this.studentRepository.save(student);
	}

	public Iterable<Student>  getAll() {
		Iterable<Student> students= this.studentRepository.findAll();
		return students;
	}
	public Optional<Student>  getSingleById(int id) {
		Optional<Student> student = this.studentRepository.findById(id);
		return student;
	}
}
