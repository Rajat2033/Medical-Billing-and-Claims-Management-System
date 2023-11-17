package com.hexaware.medicalbillingsystem.service;

import java.util.List;

import com.hexaware.medicalbillingsystem.dto.InvoiceDetailsDTO;
import com.hexaware.medicalbillingsystem.entities.InvoiceDetails;

public interface IInvoiceDetailsService {
	
	public InvoiceDetails generateInvoice(InvoiceDetailsDTO detailsDTO);
	
	public List<InvoiceDetails> getAllGeneratedInvoice();
	
	public InvoiceDetailsDTO getInvoiceById(int invoiceId);
	
	

}
