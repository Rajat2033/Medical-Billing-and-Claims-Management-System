package com.hexaware.medicalbillingsystem.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/*
@Author :  Hema Sree   
Modified Date : 14-11-2023
Description : Controller  for Login
*/
@RestController
@RequestMapping("/api/v1/login")
public class LoginRestController {
	
	public String hello()
	{
		return "Welcome to Login Page";
	}

}
