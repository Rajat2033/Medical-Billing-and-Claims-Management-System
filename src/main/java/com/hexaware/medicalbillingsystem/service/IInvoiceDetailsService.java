package com.hexaware.medicalbillingsystem.service;

import java.util.Set;

import com.hexaware.medicalbillingsystem.dto.InvoiceDetailsDTO;
import com.hexaware.medicalbillingsystem.entities.InvoiceDetails;

public interface IInvoiceDetailsService {
	
	public InvoiceDetails generateInvoice(InvoiceDetailsDTO detailsDTO);
	
	public Set<InvoiceDetails> getAllInvoiceGenerated();
	
	public InvoiceDetailsDTO getInvoiceById(int invoiceId);
	
	

}
