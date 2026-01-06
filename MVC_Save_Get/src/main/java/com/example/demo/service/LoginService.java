package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Login;
import com.example.demo.repository.LoginRepository;

@Service
public class LoginService {

	@Autowired
	LoginRepository loginRepository;
	
	public void saveLoginDetails(Login login) {
		this.loginRepository.save(login);
	}
	public Iterable<Login> getAllLoginDetails() {
		Iterable<Login> loginList= this.loginRepository.findAll();
	return loginList;
	}
	public Optional<Login> getSingleData(int id) {
		Optional<Login> login = this.loginRepository.findById(id);
		return login;
	}
}
