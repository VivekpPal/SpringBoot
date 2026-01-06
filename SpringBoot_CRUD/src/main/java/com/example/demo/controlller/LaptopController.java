package com.example.demo.controlller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Laptop;
import com.example.demo.service.LaptopService;

@RestController
public class LaptopController {
	//service
	//handler method-> API
	
	@Autowired
	LaptopService laptopService;
	@PostMapping("/saveLaptopDetails")
	public String saveLaptopdetails(@RequestBody Laptop laptop) {
		this.laptopService.saveLaptopDetails(laptop);
		
		return "Data saved..!!";
	}

	@GetMapping("/getAllAvailableLaptop")
	public Iterable<Laptop> getAllAvailableLaptop() {
		Iterable<Laptop> laptops = this.laptopService.getAllvailableLaptop();
		return laptops;
	}
	@GetMapping("/getLaptopById/{id}")
	public Optional<Laptop> getSingleLaptopDetailsById(@PathVariable ("id") int id) {
		Optional<Laptop> laptop = this.laptopService.getsingleData(id);
		return laptop;
	}
	@DeleteMapping("/deleteData/{id}")
	public String deletedata(@PathVariable ("id") int id) {
		this.laptopService.deleteData(id);
		return "Data deleted "+id;
	}
}
