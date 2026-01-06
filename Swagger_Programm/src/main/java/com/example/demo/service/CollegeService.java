package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.College;
import com.example.demo.repository.CollegeRepository;

@Service
public class CollegeService {

	
	@Autowired
	CollegeRepository collegeRepository;
	
	public void saveData(College college) {
		this.collegeRepository.save(college);
	}
	public List<College> getAll() {
		List<College> list = this.collegeRepository.findAll();
		return list;
	}
	public College getSingleData(int id) {
		Optional<College> optional = this.collegeRepository.findById(id);
		College c = optional.get();
		return c;
	}
	
	public void deleteData(int id) {
		this.collegeRepository.deleteById(id);
	}
	}
