package com.hexaware.medicalbillingsystem.service;

import com.hexaware.medicalbillingsystem.entities.InsuranceClaims;
import com.hexaware.medicalbillingsystem.entities.Patients;

public interface IInsuranceClaimsService {
	
	public  InsuranceClaims verifyPatientStatus(Patients patient);
	
	public String approveClaim(int claimid);

}
