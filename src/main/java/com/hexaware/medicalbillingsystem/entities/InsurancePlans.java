package com.hexaware.medicalbillingsystem.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;


@Entity
public class InsurancePlans implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int planId;
	@NotBlank
	private String planName;
	private String planType;

	@DecimalMin(value = "150000.00")
	@DecimalMax(value = "750000.00")
	private double planCoverAmount;

	
	@DecimalMin(value="400.00")
	@DecimalMax(value = "3000.00")
	private double planEmi;
	private String planDetails;

	@OneToOne(mappedBy = "plans")
	private Patients patient;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "plans")
	private Set<InsuranceClaims> claims = new HashSet<>();

	public InsurancePlans() {
		super();

	}

	

	public InsurancePlans(int planId, @NotBlank String planName, String planType,
			@DecimalMin("150000.00") @DecimalMax("750000.00") double planCoverAmount,
			@DecimalMin("400.00") @DecimalMax("3000.00") double planEmi, String planDetails, Patients patient,
			Set<InsuranceClaims> claims) {
		super();
		this.planId = planId;
		this.planName = planName;
		this.planType = planType;
		this.planCoverAmount = planCoverAmount;
		this.planEmi = planEmi;
		this.planDetails = planDetails;
		this.patient = patient;
		this.claims = claims;
	}



	public int getPlanId() {
		return planId;
	}

	public void setPlanId(int planId) {
		this.planId = planId;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getPlanType() {
		return planType;
	}

	public void setPlanType(String planType) {
		this.planType = planType;
	}

	public double getPlanCoverAmount() {
		return planCoverAmount;
	}

	public void setPlanCoverAmount(double planCoverAmount) {
		this.planCoverAmount = planCoverAmount;
	}

	public double getPlanEmi() {
		return planEmi;
	}

	public void setPlanEmi(double planEmi) {
		this.planEmi = planEmi;
	}

	public String getPlanDetails() {
		return planDetails;
	}

	public void setPlanDetails(String planDetails) {
		this.planDetails = planDetails;
	}

	public Patients getPatient() {
		return patient;
	}

	public void setPatient(Patients patient) {
		this.patient = patient;
	}

	public Set<InsuranceClaims> getClaims() {
		return claims;
	}

	public void setClaims(Set<InsuranceClaims> claims) {
		this.claims = claims;
	}

	@Override
	public String toString() {
		return "InsurancePlans [planId=" + planId + ", planName=" + planName + ", planType=" + planType
				+ ", planCoverAmount=" + planCoverAmount + ", planEmi=" + planEmi + ", planDetails=" + planDetails
				+ ", patient=" + patient + ", claims=" + claims + "]";
	}

}
