package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.entity.Login;
import com.example.demo.service.LoginService;


@Controller
public class LoginController {
	
	@Autowired
	LoginService loginService;

	@RequestMapping(path="/login")
	public String getLoginPage() {
			return "login";
	}
	@RequestMapping(path="LoginSuccess", method=RequestMethod.POST)
	public String loginSuccess(@ModelAttribute Login login, Model model) {
		this.loginService.saveLoginDetails(login);
		Iterable<Login> loginList = this.loginService.getAllLoginDetails();
		model.addAttribute("LoginData", loginList);
		return "success";
	}
}
