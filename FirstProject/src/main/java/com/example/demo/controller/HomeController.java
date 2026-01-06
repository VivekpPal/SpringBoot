package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	//@ResponseBody
	@RequestMapping(path="/index")
	public String get() {
		return "index";
	}
	@RequestMapping(path="/home")
	public String homepage() {
		return "home";
	}
	

}
