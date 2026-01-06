package com.example.demo.config;

import java.util.Collection;
import java.util.List;

import org.jspecify.annotations.Nullable;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.example.demo.entity.Student;

public class CustomUserDetails implements UserDetails{
	
	//give information db entity/user
	private Student student;

	public CustomUserDetails(Student student) {
		super();
		this.student = student;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		//return List.of(new SimpleGrantedAuthority(student.getRole()));
		//for multipe Role
		List l=this.student.getRole().stream().map(role-> new SimpleGrantedAuthority(role)).toList();
		return l;
		
	}

	@Override
	public @Nullable String getPassword() {
		// TODO Auto-generated method stub
		return student.getPasssword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return student.getUsername();
	}
	

}
