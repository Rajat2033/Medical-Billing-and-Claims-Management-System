package com.hexaware.medicalbillingsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.medicalbillingsystem.dto.InsurancePlansDTO;
import com.hexaware.medicalbillingsystem.entities.InsurancePlans;
import com.hexaware.medicalbillingsystem.service.IInsurancePlansService;
import com.hexaware.medicalbillingsystem.service.InsurancePlansServiceImpl;

@RestController
@RequestMapping("/api/insuranceplans")
public class InsurancePlansRestController {
	
	@Autowired 
	IInsurancePlansService service;
	
	@GetMapping("/welcome")
	public String visitor()
	{
		return "Welcome to our website";
		
		
	}
	
	@PostMapping("/add/plan")
	public InsurancePlans addNewPlan( @RequestBody InsurancePlansDTO plansdto)
	{
		return service.addInsurancePlan(plansdto);
	}
	

}
