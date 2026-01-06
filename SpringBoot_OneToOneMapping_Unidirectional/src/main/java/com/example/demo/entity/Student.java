package com.example.demo.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Student {

	@Id
	private int studentId;
	private String studentName;
	private String studentColllegName;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentColllegName() {
		return studentColllegName;
	}

	public void setStudentColllegName(String studentColllegName) {
		this.studentColllegName = studentColllegName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentColllegName="
				+ studentColllegName + ", address=" + address + "]";
	}

	public Student(int studentId, String studentName, String studentColllegName, Address address) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentColllegName = studentColllegName;
		this.address = address;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
