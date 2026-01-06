package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
@Service
public class MyUserDetailService implements UserDetailsService{

	@Autowired StudentRepository studentRepository;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Student student=this.studentRepository.findByUsername(username);
		
		if(student==null) {
			throw new UsernameNotFoundException("User is not present in Database");
		}
		return new CustomUserDetails(student);
	}

}
