package com.hexaware.medicalbillingsystem.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.medicalbillingsystem.dto.AuthRequest;
import com.hexaware.medicalbillingsystem.dto.InsuranceCompanyDTO;
import com.hexaware.medicalbillingsystem.entities.InsuranceCompany;
import com.hexaware.medicalbillingsystem.service.AuthJWTService;
import com.hexaware.medicalbillingsystem.service.IInsuranceCompanyService;

/*
@Author :  Rajat Darvhekar 
Modified Date : 14-11-2023
Description : Controller  InsuranceCompany
*/
@RestController
@RequestMapping("/api/v1/companies")
public class InsuranceCompanyRestController {
	Logger logger=LoggerFactory.getLogger(InsuranceCompanyRestController.class);
	@Autowired
	AuthenticationManager authenticationManager;

	@Autowired
	private AuthJWTService jwtService;

	@Autowired
	private IInsuranceCompanyService service;

	@PostMapping(path = "/add/company", consumes = "application/json", produces = "application/json")
	public InsuranceCompany addNewCompany(@RequestBody InsuranceCompanyDTO companyDTO) {
		return service.addCompany(companyDTO);
	}

	@PutMapping(path = "/update/company", consumes = "application/json", produces = "application/json")
	@PreAuthorize("hasAuthority('COMPANY')")
	public InsuranceCompany updateExistingCompany(@RequestBody InsuranceCompanyDTO companyDTO) {
		return service.updateCompany(companyDTO);
	}

	@DeleteMapping("/delete/companyById/{companyId}")
	public void deleteExistingCompany(@PathVariable int companyId) {
		service.deleteCompanyById(companyId);
	}

	@GetMapping("/getbycompanyname/{companyName}")
	@PreAuthorize("hasAuthority('COMPANY')")
	public InsuranceCompanyDTO getCompanyByName(@PathVariable String companyName) {
		return service.getCompanyByName(companyName);

	}


	@GetMapping("/getallcompaniesdata")
	public List<InsuranceCompany> getAllInsuranceCompanies() {
		return service.getAllInsuranceCompanyDetails();
	}

	@PostMapping("/authenticate")
	public String authenticateAndGenerateToken(@RequestBody AuthRequest authReq) {

		Authentication authenticate = authenticationManager
				.authenticate(new UsernamePasswordAuthenticationToken(authReq.getUsername(), authReq.getPassword()));

		// If authentication is successful, generate a JWT
		String Token = null;
		if (authenticate.isAuthenticated()) {
			Token = jwtService.generateToken(authReq.getUsername());
			logger.info("JWT Token successfully generated!!!");
		}

		else {
			logger.info("Not Found USERNAME!!!!");
			throw new UsernameNotFoundException("UserName Not Found!!!! ");
		}
		return Token;

	}
}
