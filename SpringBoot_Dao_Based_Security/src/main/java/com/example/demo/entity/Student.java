package com.example.demo.entity;

import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Student {

	@Id
	@GeneratedValue(strategy  = GenerationType.AUTO)
	private Integer id;
	private String username;
	private String passsword;
   private String email;
   @ElementCollection//if provide list then don't store one table so give this annotation
   private List<String> role;
}
