package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.College;
import com.example.demo.repository.CollegeRepository;
import com.example.demo.service.CollegeService;

@RestController
public class CollegeController {

    private final CollegeRepository collegeRepository;
	@Autowired
	CollegeService collegeService;

    CollegeController(CollegeRepository collegeRepository) {
        this.collegeRepository = collegeRepository;
    }
	
	@PostMapping("/save")
	public String saveDat(@RequestBody College college) {
		this.collegeService.saveData(college);
		
		return "dsata saved";
		
	}

	@GetMapping("/getAll")
	public List<College> getAll() {
	List<College> list = this.collegeService.getAll();
	return list;
	}
	@GetMapping(path="/getById/{id}")
	public College getById(@PathVariable ("id") int id) {
		College c = this.collegeService.getSingleData(id);
		return c;
		
	}
	@DeleteMapping("/delete/{id}")
	public String deletById(@PathVariable("id") int id) {
		this.collegeService.deleteData(id);
		return id+"Data deleted";
	}
	
}
