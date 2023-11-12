package com.hexaware.medicalbillingsystem.entities;

import java.time.LocalDate;
import java.util.Objects;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

@Entity
public class InvoiceDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int invoiceId;
	private LocalDate invoiceDate;
	private LocalDate invoicedueDate;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "patient_Id")
	private Patients patient;

	@NotNull

	private int invoiceTax;
	private double invoiceTotalAmount;

	public InvoiceDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "InvoiceDetails [invoiceId=" + invoiceId + ", invoiceDate=" + invoiceDate + ", invoicedueDate="
				+ invoicedueDate + ", patient=" + patient + ", invoiceTax=" + invoiceTax + ", invoiceTotalAmount="
				+ invoiceTotalAmount + "]";
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

	public InvoiceDetails(int invoiceId, LocalDate invoiceDate, LocalDate invoicedueDate, Patients patient,
			@NotNull int invoiceTax, double invoiceTotalAmount) {
		super();
		this.invoiceId = invoiceId;
		this.invoiceDate = invoiceDate;
		this.invoicedueDate = invoicedueDate;
		this.patient = patient;
		this.invoiceTax = invoiceTax;
		this.invoiceTotalAmount = invoiceTotalAmount;
	}

}
