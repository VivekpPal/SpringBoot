package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService studentService;

	/*
	 * @PostMapping("/saveNewStudent") public String saveStudentData(@RequestBody
	 * Student student) { this.studentService.saveStudentData(student); return
	 * "new student add"; }
	 */
	
	@PostMapping("/saveNewStudent")
	public ResponseEntity<String> saveStudentData(@RequestBody Student student) {
		this.studentService.saveStudentData(student);
		return new ResponseEntity<String>("new student add", HttpStatus.CREATED);
	}

	/*
	 * @GetMapping("/getallstudentRecord") public Iterable<Student>
	 * getAllStudentRecord() { Iterable<Student> student =
	 * this.studentService.getAllStudentRecord(); return student; }
	 */
	
	@GetMapping("/getallstudentRecord")
	public ResponseEntity<Iterable<Student>>  getAllStudentRecord() {
		Iterable<Student> student = this.studentService.getAllStudentRecord();
		return new ResponseEntity<Iterable<Student>>(student, HttpStatus.OK);
	}
	
	//----------------------------------------------------------
	/*
	 * @GetMapping("/getStudentBYId/{id}") public Optional<Student>
	 * getstudentById(@PathVariable("id") int id) { Optional<Student> student =
	 * this.studentService.getstudentById(id); return student; }
	 */
	
	

	@GetMapping("/getStudentBYId/{id}")
	public ResponseEntity< Optional<Student>> getstudentById(@PathVariable("id") int id) {
		Optional<Student> student = this.studentService.getstudentById(id);
		//return new ResponseEntity<Optional<Student>>(student, HttpStatus.ACCEPTED);
		if(student.isPresent()) {
			return new ResponseEntity<Optional<Student>>(student, HttpStatus.OK);
			
		}
		else {
			return new ResponseEntity<Optional<Student>>(student, HttpStatus.NO_CONTENT);
		}
		
	}
	
	
	//task if present who give and do not present then who give
	//--------------------------------------------------
	
	
	/*
	 * @DeleteMapping("/deleteById/{id}") public String
	 * deleteStudentById( @PathVariable("id") int id) {
	 * this.studentService.deletStudentById(id); return id+"id data deleted"; }
	 */
	
	
	@DeleteMapping("/deleteById/{id}")
	public ResponseEntity<String> deleteStudentById( @PathVariable("id") int id) {
		this.studentService.deletStudentById(id);
		return new ResponseEntity<String>(id+"data deleted", HttpStatus.NO_CONTENT);
	}
	@GetMapping("/getStudentByCity/{city}")
	public Iterable<Student> getStudentyByCity(@PathVariable ("city") String city) {
		Iterable<Student> students = this.studentService.findByCity(city);	
	  return students;	
	
	}
}

