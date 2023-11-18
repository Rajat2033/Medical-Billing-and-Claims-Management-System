package com.hexaware.medicalbillingsystem.entities;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.validation.constraints.NotNull;

@Entity
public class InvoiceDetails {

	@Id
	@SequenceGenerator(name="invoiceSeq",initialValue = 500,allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "invoiceSeq")
	private int invoiceId;
	private LocalDate invoiceDate;
	private LocalDate invoiceDueDate;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "patient_Id")
	private Patients patient;

	@NotNull
	private int invoiceTax;

	
	private double invoiceTotalAmount;

	public InvoiceDetails() {
		super();

	}

	public InvoiceDetails(int invoiceId, LocalDate invoiceDate, LocalDate invoiceDueDate, Patients patient,
			@NotNull int invoiceTax, double invoiceTotalAmount) {
		super();
		this.invoiceId = invoiceId;
		this.invoiceDate = invoiceDate;
		this.invoiceDueDate = invoiceDueDate;
		this.patient = patient;
		this.invoiceTax = invoiceTax;
		this.invoiceTotalAmount = invoiceTotalAmount;
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

	@Override
	public String toString() {
		return "InvoiceDetails [invoiceId=" + invoiceId + ", invoiceDate=" + invoiceDate + ", invoiceDueDate="
				+ invoiceDueDate + ", patient=" + patient + ", invoiceTax=" + invoiceTax + ", invoiceTotalAmount="
				+ invoiceTotalAmount + "]";
	}

	


}
