package com.hexaware.medicalbillingsystem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/insuranceclaims")
public class InsuranceClaimsRestController {
	
	@GetMapping("/new")
	public String getString()
	{
		return "Hello new user";
	}
	
	

}
