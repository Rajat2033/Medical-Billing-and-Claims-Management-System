package com.hexaware.medicalbillingsystem.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;

@Entity
public class InsurancePlans implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int planId;
	@NotBlank
	private String planName;
	private String planType;
	private double planCoverAmount;
	private double planEmi;
	private String planDetails;
	
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "plans")
	Set<InsuranceClaims> claims=new HashSet<>();
	public InsurancePlans() {
		super();
		// TODO Auto-generated constructor stub
	}
	public InsurancePlans(int planId, @NotBlank String planName, String planType, double planCoverAmount,
			double planEmi, String planDetails, Set<InsuranceClaims> claims) {
		super();
		this.planId = planId;
		this.planName = planName;
		this.planType = planType;
		this.planCoverAmount = planCoverAmount;
		this.planEmi = planEmi;
		this.planDetails = planDetails;
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
				+ ", claims=" + claims + "]";
	}
	
	
	
}
