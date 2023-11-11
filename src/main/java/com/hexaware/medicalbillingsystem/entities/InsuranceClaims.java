package com.hexaware.medicalbillingsystem.entities;

import java.io.Serializable;
import java.util.Objects;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class InsuranceClaims implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long claimId;
	private double claimAmount;
	private String claimStatus="Pending";
	@OneToOne
	@JoinColumn(name = "patient_Id", referencedColumnName = "patientId" )
	private Patients patient;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="planId")
	private InsurancePlans plans;
	
	
	public InsuranceClaims() {
		super();
		// TODO Auto-generated constructor stub
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


	public InsuranceClaims(long claimId, double claimAmount, String claimStatus, Patients patient,
			InsurancePlans plans) {
		super();
		this.claimId = claimId;
		this.claimAmount = claimAmount;
		this.claimStatus = claimStatus;
		this.patient = patient;
		this.plans = plans;
	}
	
}
