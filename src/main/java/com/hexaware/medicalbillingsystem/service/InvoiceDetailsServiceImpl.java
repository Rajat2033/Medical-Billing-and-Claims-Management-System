package com.hexaware.medicalbillingsystem.service;


import java.util.Set;

import org.springframework.stereotype.Service;

import com.hexaware.medicalbillingsystem.entities.InvoiceDetails;

@Service
public class InvoiceDetailsServiceImpl implements IInvoiceDetailsService{

	@Override
	public Set<InvoiceDetails> generateInvoice() {
		
		return null;
	}

	@Override
	public void invoiceGenerated(int invoiceId) {
		
	
	}

}
