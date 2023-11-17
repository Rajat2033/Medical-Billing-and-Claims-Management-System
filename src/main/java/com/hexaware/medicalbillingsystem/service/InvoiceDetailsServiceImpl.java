package com.hexaware.medicalbillingsystem.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.medicalbillingsystem.dto.InvoiceDetailsDTO;
import com.hexaware.medicalbillingsystem.entities.InvoiceDetails;
import com.hexaware.medicalbillingsystem.repository.InvoiceDetailsRepository;

@Service
public class InvoiceDetailsServiceImpl implements IInvoiceDetailsService {

	@Autowired
	private InvoiceDetailsRepository repository;
	
	@Override
	public InvoiceDetails generateInvoice(InvoiceDetailsDTO detailsDTO) {

		return null;
	}

	@Override
	public Set<InvoiceDetails> getAllInvoiceGenerated() {

		return null;
	}

	@Override
	public InvoiceDetailsDTO getInvoiceById(int invoiceId) {

		return null;
	}

}
