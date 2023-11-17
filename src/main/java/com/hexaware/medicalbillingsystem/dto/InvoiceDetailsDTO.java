package com.hexaware.medicalbillingsystem.dto;

import java.time.LocalDate;

import com.hexaware.medicalbillingsystem.entities.Patients;

public class InvoiceDetailsDTO {
	private int invoiceId;
	private LocalDate invoiceDate;
	private LocalDate invoicedueDate;
	private int invoiceTax;
	private double invoiceTotalAmount;
	private Patients patient;

	public int getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}

	public LocalDate getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(LocalDate invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public LocalDate getInvoicedueDate() {
		return invoicedueDate;
	}

	public void setInvoicedueDate(LocalDate invoicedueDate) {
		this.invoicedueDate = invoicedueDate;
	}

	public Patients getPatient() {
		return patient;
	}

	public void setPatient(Patients patient) {
		this.patient = patient;
	}

	public int getInvoiceTax() {
		return invoiceTax;
	}

	public void setInvoiceTax(int invoiceTax) {
		this.invoiceTax = invoiceTax;
	}

	public double getInvoiceTotalAmount() {
		return invoiceTotalAmount;
	}

	public void setInvoiceTotalAmount(double invoiceTotalAmount) {
		this.invoiceTotalAmount = invoiceTotalAmount;
	}

}
