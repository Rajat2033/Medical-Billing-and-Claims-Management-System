package com.hexaware.medicalbillingsystem.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;

@Entity
public class InsuranceClaims implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long claimId;

	@NotBlank
	private double claimAmount;
	private String claimStatus;
	
	@DecimalMin(value="12000.00")
	@DecimalMax(value="100000.00")
	private double invoiceAmount;
	@OneToOne
	@JoinColumn(name = "patient_Id", referencedColumnName = "patientId")
	private Patients patient;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "planId")
	private InsurancePlans plans;

	public InsuranceClaims() {
		super();

	}

	public long getClaimId() {
		return claimId;
	}

	public void setClaimId(long claimId) {
		this.claimId = claimId;
	}

	public double getClaimAmount() {
		return claimAmount;
	}

	public void setClaimAmount(double claimAmount) {
		this.claimAmount = claimAmount;
	}

	public String getClaimStatus() {
		return claimStatus;
	}

	public void setClaimStatus(String claimStatus) {
		this.claimStatus = claimStatus;
	}

	public Patients getPatient() {
		return patient;
	}

	public void setPatient(Patients patient) {
		this.patient = patient;
	}

	public InsurancePlans getPlans() {
		return plans;
	}

	public void setPlans(InsurancePlans plans) {
		this.plans = plans;
	}

	public InsuranceClaims(long claimId, @NotBlank double claimAmount, String claimStatus,
			@DecimalMin("12000.00") @DecimalMax("100000.00") double invoiceAmount, Patients patient,
			InsurancePlans plans) {
		super();
		this.claimId = claimId;
		this.claimAmount = claimAmount;
		this.claimStatus = claimStatus;
		this.invoiceAmount = invoiceAmount;
		this.patient = patient;
		this.plans = plans;
	}

	public double getInvoiceAmount() {
		return invoiceAmount;
	}

	public void setInvoiceAmount(double invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}



}
