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
	@JoinColumn(name = "patient_Name", referencedColumnName = "patientName" )
	private Patients patient;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private InsurancePlans plans;
	
	private InsuranceCompany company;
	public InsuranceClaims() {
		super();
		// TODO Auto-generated constructor stub
	}
	public InsuranceClaims(long claimId, Patients patient, double claimAmount, String claimStatus, InsurancePlans plans,
			InsuranceCompany company) {
		super();
		this.claimId = claimId;
		this.patient = patient;
		this.claimAmount = claimAmount;
		this.claimStatus = claimStatus;
		this.plans = plans;
		this.company = company;
	}
	public long getClaimId() {
		return claimId;
	}
	public void setClaimId(long claimId) {
		this.claimId = claimId;
	}
	public Patients getPatient() {
		return patient;
	}
	public void setPatient(Patients patient) {
		this.patient = patient;
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
	public InsurancePlans getPlans() {
		return plans;
	}
	public void setPlans(InsurancePlans plans) {
		this.plans = plans;
	}
	public InsuranceCompany getCompany() {
		return company;
	}
	public void setCompany(InsuranceCompany company) {
		this.company = company;
	}
	@Override
	public String toString() {
		return "InsuranceClaims [claimId=" + claimId + ", patient=" + patient + ", claimAmount=" + claimAmount
				+ ", claimStatus=" + claimStatus + ", plans=" + plans + ", company=" + company + "]";
	}

}
