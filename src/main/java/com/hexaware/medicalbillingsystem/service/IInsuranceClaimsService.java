package com.hexaware.medicalbillingsystem.service;

import java.util.List;

import com.hexaware.medicalbillingsystem.dto.InsuranceClaimsDTO;
import com.hexaware.medicalbillingsystem.entities.InsuranceClaims;

public interface IInsuranceClaimsService {
	
	public InsuranceClaims insertClaims(InsuranceClaimsDTO claimDTO);

	public InsuranceClaims updateClaimStatus(InsuranceClaimsDTO claimsDTO,long claimId);

	
 
	public InsuranceClaimsDTO getById(long claimId);
	 
	public InsuranceClaimsDTO getTotalPendingInsuranceClaims(String claimStatus);

	public InsuranceClaimsDTO getTotalApprovedClaims(String claimStatus);
	
	public List<InsuranceClaims> getAllInsuranceClaims();

	

}
