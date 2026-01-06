package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;
	@Autowired PasswordEncoder passwordEncoder;
	
	public void saveData(Student student) {
		student.setPasssword(passwordEncoder.encode(student.getPasssword()));
		this.studentRepository.save(student);
		
	}
	public List<Student> getAllStudent() {
		List<Student> students = this.studentRepository.findAll();
		return students;
	}
	public Optional<Student> getById(int id) {
		Optional<Student> student = this.studentRepository.findById(id);
		return student;
	}
	
}
