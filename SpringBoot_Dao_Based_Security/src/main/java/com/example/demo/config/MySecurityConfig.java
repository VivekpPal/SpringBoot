package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class MySecurityConfig {
	
	@Autowired
	MyUserDetailService myUserDetailService;
	
	
	
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		
		return new  BCryptPasswordEncoder();
	}
	
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) {
		http.authorizeHttpRequests(auth->
		auth.requestMatchers("/save/**", "/save").permitAll()
		.requestMatchers("/admin/**").hasRole("ADMIN")
		.requestMatchers("/user/**").hasRole("USER")
		
		.anyRequest().authenticated())
		
		.httpBasic(Customizer.withDefaults())
		
		.csrf(csrf->csrf.disable());
		return http.build();
		
	}

}
