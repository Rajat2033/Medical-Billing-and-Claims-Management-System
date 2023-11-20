package com.hexaware.medicalbillingsystem.dto;

import java.time.LocalDate;

/*
@Author :  Rajat Darvhekar 
Modified Date : 06-11-2023
Description :DTO class for InvoiceDetails containing various properties
*/
public class InvoiceDetailsDTO {
	private int invoiceId;
	private LocalDate invoiceDate;
	private LocalDate invoicedueDate;
	private int invoiceTax;
	private double consultationFee;
	private double diagnosticTestsFee;
	private double diagnosticScanFee;
	private double invoiceTotalAmount;

	public void setInvoiceTotalAmount(double invoiceTotalAmount) {
		this.invoiceTotalAmount = consultationFee + diagnosticScanFee + diagnosticTestsFee;
	}

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

	public int getInvoiceTax() {
		return invoiceTax;
	}

	public void setInvoiceTax(int invoiceTax) {
		this.invoiceTax = invoiceTax;
	}

	public double getInvoiceTotalAmount() {
		return invoiceTotalAmount;
	}

	public double getConsultationFee() {
		return consultationFee;
	}

	public void setConsultationFee(double consultationFee) {
		this.consultationFee = consultationFee;
	}

	public double getDiagnosticTestsFee() {
		return diagnosticTestsFee;
	}

	public void setDiagnosticTestsFee(double diagnosticTestsFee) {
		this.diagnosticTestsFee = diagnosticTestsFee;
	}

	public double getDiagnosticScanFee() {
		return diagnosticScanFee;
	}

	public void setDiagnosticScanFee(double diagnosticScanFee) {
		this.diagnosticScanFee = diagnosticScanFee;
	}
}
