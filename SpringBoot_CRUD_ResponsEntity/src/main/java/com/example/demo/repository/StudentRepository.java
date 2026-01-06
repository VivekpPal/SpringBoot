package com.example.demo.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>{
	
	//select*from Student where city=""
	//public Iterable<Student> findByCity(String city);
	@Query("select s from s where s.city:=c" )
	public Iterable<Student> m1(@Param("city") String city);

}
