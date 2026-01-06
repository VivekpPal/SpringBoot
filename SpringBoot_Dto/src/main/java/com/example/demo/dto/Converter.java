package com.example.demo.dto;



import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.example.demo.entity.Student;

@Component
public class Converter {
	//cpnvert Dto -> Entity
	public Student dtoToEntity(StudentDto dto) {//when data come from client
		Student student = new Student();
		student.setName(dto.getName());
		student.setCity(dto.getCity());
		return student;
	}
	//convert Entity to Dto
	public StudentDto entityToDto(Student student) {
		StudentDto dto = new StudentDto();
		dto.setName(student.getName());
		dto.setCity(student.getCity());
		return dto;
	}
	
	//concert List<Entity> to List<Dto>
	public List<StudentDto> entityToDto(List<Student> students){
		return students.stream()
				.map(this::entityToDto)
				.collect(Collectors.toList());
	}

}
