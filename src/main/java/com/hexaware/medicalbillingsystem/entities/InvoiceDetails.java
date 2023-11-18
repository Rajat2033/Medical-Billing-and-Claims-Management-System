package com.hexaware.medicalbillingsystem.entities;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotNull;
/*
@Author :  Hema Sree  
Modified Date : 28-10-2023
Description : Entity class for InvoiceDetails containing various properties
*/
@Entity
public class InvoiceDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int invoiceId;
	private LocalDate invoiceDate;
	private LocalDate invoiceDueDate;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "patient_Id")
	private Patients patient;

	@NotNull
	private int invoiceTax;

	
	private double invoiceTotalAmount;
	@DecimalMin(value="1000.00")
	@DecimalMax(value="8000.00")
	private double consultationFee;
	private double dianosticTestsFeee;
	private double diagnosticScanFee;

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
	public LocalDate getInvoiceDueDate() {
		return invoiceDueDate;
	}
	public void setInvoiceDueDate(LocalDate invoiceDueDate) {
		this.invoiceDueDate = invoiceDueDate;
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
	public double getConsultationFee() {
		return consultationFee;
	}
	public void setConsultationFee(double consultationFee) {
		this.consultationFee = consultationFee;
	}
	public double getDianosticTestsFeee() {
		return dianosticTestsFeee;
	}
	public void setDianosticTestsFeee(double dianosticTestsFeee) {
		this.dianosticTestsFeee = dianosticTestsFeee;
	}
	public double getDiagnosticScanFee() {
		return diagnosticScanFee;
	}
	public void setDiagnosticScanFee(double diagnosticScanFee) {
		this.diagnosticScanFee = diagnosticScanFee;
	}
public InvoiceDetails(int invoiceId, LocalDate invoiceDate, LocalDate invoiceDueDate, Patients patient,
		@NotNull int invoiceTax, double invoiceTotalAmount,
		@DecimalMin("1000.00") @DecimalMax("8000.00") double consultationFee, double dianosticTestsFeee,
		double diagnosticScanFee) {
	super();
	this.invoiceId = invoiceId;
	this.invoiceDate = invoiceDate;
	this.invoiceDueDate = invoiceDueDate;
	this.patient = patient;
	this.invoiceTax = invoiceTax;
	this.invoiceTotalAmount = invoiceTotalAmount;
	this.consultationFee = consultationFee;
	this.dianosticTestsFeee = dianosticTestsFeee;
	this.diagnosticScanFee = diagnosticScanFee;
}
public InvoiceDetails() {
	super();
}
}
