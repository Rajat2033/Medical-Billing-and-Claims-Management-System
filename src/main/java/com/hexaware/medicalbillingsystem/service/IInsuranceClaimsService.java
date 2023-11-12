package com.hexaware.medicalbillingsystem.service;

import java.util.List;

import com.hexaware.medicalbillingsystem.dto.InsuranceClaimsDTO;
import com.hexaware.medicalbillingsystem.entities.InsuranceClaims;
import com.hexaware.medicalbillingsystem.entities.Patients;

public interface IInsuranceClaimsService {
	
	public InsuranceClaims insertClaims(InsuranceClaimsDTO claimDTO);

	public InsuranceClaims updateClaimStatus(InsuranceClaimsDTO claimsDTO);

	public String approveClaim(int claimid);
 
	public InsuranceClaimsDTO getById(long claimId);
	 
	public int getTotalPendingInsuranceClaims(String claimStatus);

	public int getTotalApprovedClaims(String claimStatus);
	
	public List<InsuranceClaims> getAllInsuranceClaims();

}
