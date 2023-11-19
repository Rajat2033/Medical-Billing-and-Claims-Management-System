package com.hexaware.medicalbillingsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.medicalbillingsystem.dto.InvoiceDetailsDTO;
import com.hexaware.medicalbillingsystem.entities.InvoiceDetails;
import com.hexaware.medicalbillingsystem.service.IInvoiceDetailsService;
/*
@Author :  Hema Sree
Modified Date : 14-11-2023
Description : Controller  InvoiceDetails
*/
@RestController
@RequestMapping("/api/v1/invoicedetails")
public class InvoiceDetailsRestController {

	@Autowired
	private IInvoiceDetailsService service;
	
	@PostMapping( path="/add/newinvoice",consumes = "application/json",produces="application/json")
	@PreAuthorize("hasAuthority('PROVIDER')")
	public InvoiceDetails generateNewInvoice(@RequestBody InvoiceDetailsDTO detailsDTO)
	{
		return service.generateInvoice(detailsDTO);
	}
	
	@GetMapping(path = "/getinvoicebyid/{invoiceId}",produces="application/json")
	@PreAuthorize("hasAuthority('PROVIDER')")
	public InvoiceDetailsDTO getInvoiceDetailsById(@PathVariable int invoiceId )
	{
		return service.getInvoiceById(invoiceId);
	}
	
	@GetMapping("/getallinvoices")
	@PreAuthorize("hasAuthority('ADMIN')")
	public List<InvoiceDetails> getAllInvoiceDetails()
	{
		return service.getAllGeneratedInvoice();
	}
}

