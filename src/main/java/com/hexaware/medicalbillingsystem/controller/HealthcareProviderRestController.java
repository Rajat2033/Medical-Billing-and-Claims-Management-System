package com.hexaware.medicalbillingsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.medicalbillingsystem.dto.HealthcareProviderDTO;
import com.hexaware.medicalbillingsystem.entities.HealthcareProvider;
import com.hexaware.medicalbillingsystem.service.IHealthcareProviderService;

@RestController
@RequestMapping("/api/v1/provider")
public class HealthcareProviderRestController {

	@Autowired
	private  IHealthcareProviderService service;

	@GetMapping("/welcome")
	public String newProvider() {
		return "Hello New Provider";
	}

	@PostMapping(path="/add/provider",consumes = "application/json",produces="application/json")
	public HealthcareProvider insertNewProvider(@RequestBody HealthcareProviderDTO providerdto) {
		return service.addProvider(providerdto);
	}

	@PutMapping("/update/provider")
	public HealthcareProvider updateprovider(@RequestBody HealthcareProviderDTO providerdto) {
		return service.updateProvider(providerdto);
	}

	@GetMapping("/getall/provider")
	public List<HealthcareProvider> getAllProviders() {
		return service.getAllHealthcareProviders();
	}

	@DeleteMapping("/delete/provider")
	public String deleteProvider(int providerId) {
		service.deleteProvider(providerId);
		return "Providet with id " + providerId + " is deleted";
	}

	@GetMapping("/getById/{providerId}")
	public HealthcareProviderDTO getProviderById(int providerId) {
		return service.getProviderById(providerId);
	}

}
