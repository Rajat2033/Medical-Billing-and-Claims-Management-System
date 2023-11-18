package com.hexaware.medicalbillingsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.medicalbillingsystem.entities.HealthcareProvider;
import com.hexaware.medicalbillingsystem.entities.InsuranceClaims;
import com.hexaware.medicalbillingsystem.entities.InsurancePlans;
import com.hexaware.medicalbillingsystem.entities.Patients;
import com.hexaware.medicalbillingsystem.service.IHealthcareProviderService;
import com.hexaware.medicalbillingsystem.service.IInsuranceClaimsService;
import com.hexaware.medicalbillingsystem.service.IInsurancePlansService;
import com.hexaware.medicalbillingsystem.service.IPatientsService;

@RestController
@RequestMapping("/api/v1/admin")
public class AdminRestController {

	@Autowired
	private IHealthcareProviderService providerService;

	@Autowired
	private IPatientsService patientService;

	@Autowired
	private IInsuranceClaimsService claimService;

	@Autowired
	private IInsurancePlansService planService;

	@GetMapping("/welcome")
	
	public String heyAdmin() {
		return "Welcome Admin";
	}

	@GetMapping("/getallpatients")
	
	public List<Patients> getAllPatients() {
		return patientService.getAllPatients();
	}

	@GetMapping("/getallproviders")
	public List<HealthcareProvider> getAllHealthcareProviders() {
		return providerService.getAllHealthcareProviders();
	}

	@GetMapping("/getallinsuranceclaims")
	public List<InsuranceClaims> getAllInsuranceClaims() {
		return claimService.getAllInsuranceClaims();
	}

	@GetMapping("/getallinsuranceplans")
	public List<InsurancePlans> getAllInsurancePlans() {
		return planService.getAllPlans();
	}

}
