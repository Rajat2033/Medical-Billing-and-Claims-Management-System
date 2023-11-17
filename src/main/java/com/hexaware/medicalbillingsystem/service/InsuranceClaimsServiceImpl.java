package com.hexaware.medicalbillingsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.hexaware.medicalbillingsystem.dto.InsuranceClaimsDTO;
import com.hexaware.medicalbillingsystem.entities.InsuranceClaims;
import com.hexaware.medicalbillingsystem.exceptions.ClaimNotValidException;
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
	public InsuranceClaimsDTO getTotalPendingInsuranceClaims(String claimStatus) {

		return repository.getTotalPendingInsuranceClaims(claimStatus);
	}

	@Override
	public InsuranceClaimsDTO getTotalApprovedClaims(String claimStatus) {

		return repository.getTotalApprovedClaims(claimStatus);
	}

	@Override
	public InsuranceClaimsDTO getById(long claimId) {
		InsuranceClaims claim = repository.findById(claimId).orElse(new InsuranceClaims());

		InsuranceClaimsDTO claimdto = new InsuranceClaimsDTO();
		claimdto.setClaimId(claim.getClaimId());
		claimdto.setClaimAmount(claim.getClaimAmount());
		claimdto.setClaimStatus(claim.getClaimStatus());
		claimdto.setPatient(claim.getPatient());
		claimdto.setInvoiceAmount(claim.getInvoiceAmount());
		return claimdto;
	}

	@Override
	public InsuranceClaims insertClaims(InsuranceClaimsDTO claimDTO) {
		InsuranceClaims claims = new InsuranceClaims();
		claims.setClaimAmount(claimDTO.getClaimAmount());
		claims.setClaimStatus(claimDTO.getClaimStatus());
		claims.setInvoiceAmount(claimDTO.getInvoiceAmount());
		claims.setPatient(claimDTO.getPatient());
		claims.setPlans(claimDTO.getPlans());
		return repository.save(claims);
	}

	@Override
	public InsuranceClaims updateClaimStatus(InsuranceClaimsDTO claimsDTO,long claimId) {
		Optional<InsuranceClaims> optionalClaims= repository.findById(claimId);
		InsuranceClaims claims = new InsuranceClaims();
		if(optionalClaims.isPresent())
		{
		claims=optionalClaims.get();
		
		claims.setClaimAmount(claimsDTO.getClaimAmount());
		claims.setClaimStatus(claimsDTO.getClaimStatus());
		claims.setPatient(claimsDTO.getPatient());
		claims.setPlans(claimsDTO.getPlans());
		claims.setInvoiceAmount(claimsDTO.getInvoiceAmount());
		}
		else 
		{
			throw new ClaimNotValidException(HttpStatus.BAD_REQUEST, "Claim with Id "+claimId+ " os invalid or never processed");
		}
		return repository.save(claims);
	}

	@Override
	public List<InsuranceClaims> getAllInsuranceClaims() {

		return repository.findAll();
	}

}
