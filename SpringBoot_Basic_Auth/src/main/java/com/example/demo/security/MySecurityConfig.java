package com.example.demo.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class MySecurityConfig {
	@Bean
	public SecurityFilterChain getSecurityFilterChain(HttpSecurity http){
		
		http.authorizeHttpRequests(auth->auth.anyRequest().authenticated())
		.httpBasic(Customizer.withDefaults());
		
		return http.build();
		
	}

}
