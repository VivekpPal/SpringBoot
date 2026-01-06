package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Address {

	@Id
	private int address_id;
	private String city;
	private String state;
	public int getAddress_id() {
		return address_id;
		
		
	}
	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Address(int address_id, String city, String state) {
		super();
		this.address_id = address_id;
		this.city = city;
		this.state = state;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [address_id=" + address_id + ", city=" + city + ", state=" + state + "]";
	}
	
	
	
	
}
