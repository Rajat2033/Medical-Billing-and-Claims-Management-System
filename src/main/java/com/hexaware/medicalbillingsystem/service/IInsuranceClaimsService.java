package com.hexaware.medicalbillingsystem.service;

import com.hexaware.medicalbillingsystem.dto.InsuranceClaimsDTO;
import com.hexaware.medicalbillingsystem.entities.InsuranceClaims;
import com.hexaware.medicalbillingsystem.entities.Patients;

public interface IInsuranceClaimsService {
	
	public InsuranceClaims insertClaims(InsuranceClaimsDTO claimDTO);

	public InsuranceClaims verifyPatientStatus(Patients patient);

	public String approveClaim(int claimid);
 
	public InsuranceClaimsDTO getById(long claimId);
	 
	public int getTotalPendingInsuranceClaims(String claimStatus);

	public int getTotalApprovedClaims(String claimStatus);

}
