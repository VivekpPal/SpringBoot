package com.example.demo.service;







import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class Studentservice {

	@Autowired
	StudentRepository studentRepository;
	
	public Page<Student> getAllData(int page,int size) {
	 Pageable pageable = PageRequest.of(page, size);
		Page<Student> p = this.studentRepository.findAll(pageable);
		return p;
	}
	public  Page<Student> getDataBy_Page_sort(int page,int size,String sortBy, String sortDir) {
		//sort
		Sort sortby = sortDir.equalsIgnoreCase("asc")?
				Sort.by(sortBy).ascending():
					Sort.by(sortBy).descending();
		
		Pageable pageable = PageRequest.of(page, size, sortby);
	 Page<Student> p = this.studentRepository.findAll(pageable);
	 return p;
	}
}
