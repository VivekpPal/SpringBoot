package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	public void saveStudentData(Student student) {
		this.studentRepository.save(student);
	}
	public Iterable<Student> getAllStudentRecord() {
		Iterable<Student> students = this.studentRepository.findAll();	
		return students;
	}
	public Optional<Student> getstudentById(int id ){
		Optional<Student> optionalofStudent = this.studentRepository.findById(id);
		return optionalofStudent;
	}
	public void deletStudentById(int id) {
		this.studentRepository.deleteById(id);
	}
	
	public Iterable<Student> findByCity(String city){
		Iterable<Student> students = this.studentRepository.findByCity(city);
		return students;
	}
	
}
