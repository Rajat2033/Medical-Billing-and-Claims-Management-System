package com.hexaware.medicalbillingsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.medicalbillingsystem.dto.InsurancePlansDTO;
import com.hexaware.medicalbillingsystem.entities.InsurancePlans;
import com.hexaware.medicalbillingsystem.exceptions.PlanNotFoundException;
import com.hexaware.medicalbillingsystem.service.IInsurancePlansService;
/*
@Author : Hema Sree 
Modified Date : 14-11-2023
Description : Controller  InsurancePlans
*/
@RestController
@RequestMapping("/api/insuranceplans")
public class InsurancePlansRestController {

	@Autowired
	private IInsurancePlansService service;

	@GetMapping("/welcome")
	public String visitor() {
		return "Welcome to our website Add Your Plans";

	}

	@PostMapping(path="/add/plan",consumes = "application/json",produces="application/json")
	public InsurancePlans addNewPlan(@RequestBody InsurancePlansDTO plansdto) {
		return service.addInsurancePlan(plansdto);
	}

	@DeleteMapping("/delete/plan/{planId}")
	public String deletePlans(@PathVariable int planId) {
		service.deleteInsurancePlan(planId);
		return "Plan with id " + planId + " deleted";
	}

	@GetMapping("/getplanbyname/{planName}")
	public InsurancePlansDTO getPlanByNamee(@PathVariable String planName) {
		InsurancePlansDTO planDTO = service.getPlanByName(planName);
		if (planDTO.getPlanName() == null) {
			throw new PlanNotFoundException(HttpStatus.NO_CONTENT,
					"There is no plan with name " + planName + " ! Kindly Add it");
		}
		return planDTO;
	}

	@GetMapping("/getallplans")
	public List<InsurancePlans> getAllPlanDetails() {
		return service.getAllPlans();
	}

}
