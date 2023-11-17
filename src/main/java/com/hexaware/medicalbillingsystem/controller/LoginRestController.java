package com.hexaware.medicalbillingsystem.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/login")
public class LoginRestController {
	
	public String hello()
	{
		return "Welcome to Login Page";
	}

}
