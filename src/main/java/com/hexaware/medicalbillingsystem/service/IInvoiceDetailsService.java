package com.hexaware.medicalbillingsystem.service;

import java.util.Set;

import com.hexaware.medicalbillingsystem.entities.InvoiceDetails;

public interface IInvoiceDetailsService {
	
	
	public Set<InvoiceDetails> generateInvoice();
	public String invoiceGenerated(int invoiceId);

}
