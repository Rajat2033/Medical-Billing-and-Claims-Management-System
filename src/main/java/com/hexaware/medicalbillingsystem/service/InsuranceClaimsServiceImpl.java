package com.hexaware.medicalbillingsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.medicalbillingsystem.dto.InsuranceClaimsDTO;
import com.hexaware.medicalbillingsystem.entities.InsuranceClaims;
import com.hexaware.medicalbillingsystem.entities.InsurancePlans;
import com.hexaware.medicalbillingsystem.entities.Patients;
import com.hexaware.medicalbillingsystem.repository.InsuranceClaimsRepository;

@Service
public class InsuranceClaimsServiceImpl implements IInsuranceClaimsService {

	@Autowired
	InsuranceClaimsRepository repository;
	@Override
	public InsuranceClaims verifyPatientStatus(Patients patient) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String approveClaim(int claimid) {
		
		return null;
	}

	@Override
	public int getTotalPendingInsuranceClaims(String claimStatus) {
		// TODO Auto-generated method stub
		return repository.getTotalPendingInsuranceClaims(claimStatus);
	}

	@Override
	public int getTotalApprovedClaims(String claimStatus) {
		// TODO Auto-generated method stub
		return repository.getTotalApprovedClaims(claimStatus);
	}

	@Override
	public InsuranceClaimsDTO getById(long claimId) {
		 InsuranceClaims claim=repository.findById(claimId).orElse(new InsuranceClaims());
		 
		 InsuranceClaimsDTO claimdto=new InsuranceClaimsDTO();
		 claimdto.setClaimId(claim.getClaimId());
		 claimdto.setClaimAmount(claim.getClaimAmount());
		 claimdto.setClaimStatus(claim.getClaimStatus());
		 claimdto.setPatient(claim.getPatient());
		return claimdto;
	}

	
	
}
