package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Student;
@Repository
public interface StudentRepositor extends CrudRepository<Student, Integer> {

}
