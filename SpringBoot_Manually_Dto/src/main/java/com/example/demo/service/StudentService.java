package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.dto.Converter;
import com.example.demo.dto.StudentDto;
import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentRepository;
	@Autowired
	Converter converter;
	
	public void saveStudent(StudentDto dto) {
		//conversion
		Student st = this.converter.dtoToEntity(dto);
		this.studentRepository.save(st);
		
	}
public StudentDto getById(int id) {
	Optional<Student> optional = this.studentRepository.findById(id);
	Student s = optional.get();
	
	//conversion
	StudentDto dto = this.converter.entityToDto(s);
	return dto;
		
	}

}
