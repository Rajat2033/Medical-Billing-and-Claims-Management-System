package com.hexaware.medicalbillingsystem.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.hexaware.medicalbillingsystem.dto.InvoiceDetailsDTO;
import com.hexaware.medicalbillingsystem.entities.InvoiceDetails;
import com.hexaware.medicalbillingsystem.exceptions.NoSuchInvoiceGeneratedException;
import com.hexaware.medicalbillingsystem.repository.InvoiceDetailsRepository;
/*
@Author :   Rajat Darvhekar
Modified Date : 04-11-2023
Description :Service Implementation class for InvoiceDetailsServiceImpl implementing InvoiceDetailsService
*/
@Service
public class InvoiceDetailsServiceImpl implements IInvoiceDetailsService {

	Logger logger=LoggerFactory.getLogger(InvoiceDetailsServiceImpl.class);
	
	@Autowired
	private InvoiceDetailsRepository repository;
	
	@Override
	public InvoiceDetails generateInvoice(InvoiceDetailsDTO detailsDTO) {
		InvoiceDetails details=new InvoiceDetails();
		details.setInvoiceDate(detailsDTO.getInvoiceDate());
		details.setInvoiceDueDate(detailsDTO.getInvoicedueDate());
		details.setInvoiceTax(detailsDTO.getInvoiceTax());
		details.setInvoiceTotalAmount(detailsDTO.getInvoiceTotalAmount());
		details.setPatient(detailsDTO.getPatient());
<<<<<<< HEAD
		logger.info("Invoice Generated Successfully!!!!!!!");
=======
		details.setConsultationFee(detailsDTO.getConsultationFee());
		deails.setDiagnosticTestsFee(detailsDTO.getDiagnosticTestsFee());
		details.setDiagnosticScanFee(detailsDTO.getDiagnosticScanFee());
>>>>>>> 5294ea0a4043e5eafc9eb48d7177d5d043fa09bb
		return repository.save(details);
	}

	@Override
	public List<InvoiceDetails> getAllGeneratedInvoice() {

		logger.info("All the Invoice Generated Details Fetched Successfully!!!!!");
		return repository.findAll();
	}

	@Override
	public InvoiceDetailsDTO getInvoiceById(int invoiceId) {
		InvoiceDetails details= repository.findById(invoiceId).orElseThrow(() -> new NoSuchInvoiceGeneratedException(
		         HttpStatus.NO_CONTENT,"No such Invoice with Id :"+invoiceId+" Found"));
		InvoiceDetailsDTO detailsDTO=new InvoiceDetailsDTO();
		detailsDTO.setInvoiceId(details.getInvoiceId());
		detailsDTO.setInvoiceDate(details.getInvoiceDate());
		detailsDTO.setInvoicedueDate(details.getInvoiceDueDate());
		detailsDTO.setInvoiceTax(details.getInvoiceTax());
		detailsDTO.setInvoiceTotalAmount(details.getInvoiceTotalAmount());
		detailsDTO.setPatient(details.getPatient());
<<<<<<< HEAD
		logger.info("Fetched the Invoice by Id "+invoiceId+" !!!!!!!!!");
=======
		detailsDTO.setConsultationFee(details.getConsultationFee());
		deailsDTO.setDiagnosticTestsFee(details.getDiagnosticTestsFee());
		detailsDTO.setDiagnosticScanFee(details.getDiagnosticScanFee());
>>>>>>> 5294ea0a4043e5eafc9eb48d7177d5d043fa09bb
		return detailsDTO;
	}

}
