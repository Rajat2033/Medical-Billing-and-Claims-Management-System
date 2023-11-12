package com.hexaware.medicalbillingsystem.service;

import java.util.List;
import java.util.Optional;

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

	@Override
	public InsuranceClaims insertClaims(InsuranceClaimsDTO claimDTO) {
		InsuranceClaims claims=new InsuranceClaims();
		claims.setClaimAmount(claimDTO.getClaimAmount());
		claims.setClaimStatus(claimDTO.getClaimStatus());
		claims.setPatient(claimDTO.getPatient());
		claims.setPlans(claimDTO.getPlans());
		return repository.save(claims);
	}

	@Override
	public InsuranceClaims updateClaimStatus(InsuranceClaimsDTO claimsDTO) {
		InsuranceClaims claims=new InsuranceClaims();
		claims.setClaimAmount(claimsDTO.getClaimAmount());
		claims.setClaimStatus(claimsDTO.getClaimStatus());
		claims.setPatient(claimsDTO.getPatient());
		claims.setPlans(claimsDTO.getPlans());
		return repository.save(claims);
	}

	@Override
	public List<InsuranceClaims> getAllInsuranceClaims() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	
	
}
