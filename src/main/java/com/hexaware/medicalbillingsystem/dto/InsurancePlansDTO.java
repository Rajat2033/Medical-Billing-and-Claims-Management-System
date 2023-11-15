package com.hexaware.medicalbillingsystem.dto;

import java.util.Set;

import com.hexaware.medicalbillingsystem.entities.InsuranceClaims;

public class InsurancePlansDTO {
	private int planId;
	private String planName;
	private String planType;
	private double planCoverAmount;
	private double planEmi;
	private String planDetails;
	Set<InsuranceClaims> claims;

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

}
