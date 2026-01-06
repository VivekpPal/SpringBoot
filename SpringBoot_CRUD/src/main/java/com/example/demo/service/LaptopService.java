package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Laptop;
import com.example.demo.repository.LaptopRepository;

@Service
public class LaptopService {

@Autowired
  LaptopRepository laptopRepository;

public void saveLaptopDetails(Laptop laptop) {
	this.laptopRepository.save(laptop);
}
public Iterable<Laptop> getAllvailableLaptop() {
	Iterable<Laptop> iterableofLaptop = this.laptopRepository.findAll();
	return iterableofLaptop;
}
public Optional<Laptop> getsingleData(int id) {
	Optional<Laptop> optionalofLaptop = this.laptopRepository.findById(id);
	return optionalofLaptop;
}
public void deleteData(int id) {
	this.laptopRepository.deleteById(id);
}
	
}
