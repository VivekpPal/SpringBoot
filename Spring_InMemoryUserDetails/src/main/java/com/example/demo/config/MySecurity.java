package com.example.demo.config;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class MySecurity {
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) {
		
		http.authorizeHttpRequests(auth->auth.anyRequest().authenticated())
		.httpBasic(Customizer.withDefaults());
		return http.build();
		
		
	}
	@Bean
	public UserDetailsService userDetailsService() {
		UserDetails user1 = User.builder().username("Vivek").password(passwordEncoder().encode("vivek")).roles("ADMIN").build();
		UserDetails user2= User.builder().username("Deepak").password(passwordEncoder().encode("deepak")).roles("USER").build();
		UserDetails user3= User.builder().username("Kabita").password(passwordEncoder().encode("kabita")).roles("USER").build();
		
		return new InMemoryUserDetailsManager(user1,user2,user3);
		
	}
@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
