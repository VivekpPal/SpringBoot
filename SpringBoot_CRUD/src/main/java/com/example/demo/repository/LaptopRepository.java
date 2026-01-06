package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Laptop;
@Repository
public interface LaptopRepository extends CrudRepository<Laptop, Integer>{
	
	//save -> save
	//get all -> findAll
	//get single -> findBYId
	///update
	//delete
	

}
