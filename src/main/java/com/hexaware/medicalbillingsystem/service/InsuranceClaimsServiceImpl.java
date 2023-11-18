package com.hexaware.medicalbillingsystem.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.hexaware.medicalbillingsystem.dto.InsuranceClaimsDTO;
import com.hexaware.medicalbillingsystem.entities.InsuranceClaims;
import com.hexaware.medicalbillingsystem.exceptions.ClaimNotValidException;
import com.hexaware.medicalbillingsystem.repository.InsuranceClaimsRepository;

@Service
public class InsuranceClaimsServiceImpl implements IInsuranceClaimsService {

	Logger logger = LoggerFactory.getLogger(InsuranceClaimsServiceImpl.class);
	@Autowired
	InsuranceClaimsRepository repository;

	@Override
	public InsuranceClaimsDTO getTotalPendingInsuranceClaims(String claimStatus) {

		logger.info("Got all the pending claims!!!1");
		return repository.getTotalPendingInsuranceClaims(claimStatus);
	}

	@Override
	public InsuranceClaimsDTO getTotalApprovedClaims(String claimStatus) {

		logger.info("Got all the approved claims till now!!!!");
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
		logger.info("Fetched Claims for id "+claimId);
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
		logger.info("Claim is proceeded!!!");
		return repository.save(claims);
	}

	@Override
	public InsuranceClaims updateClaimStatus(InsuranceClaimsDTO claimsDTO, long claimId) {
		Optional<InsuranceClaims> optionalClaims = repository.findById(claimId);
		InsuranceClaims claims = new InsuranceClaims();
		if (optionalClaims.isPresent()) {
			claims = optionalClaims.get();

			claims.setClaimAmount(claimsDTO.getClaimAmount());
			claims.setClaimStatus(claimsDTO.getClaimStatus());
			claims.setPatient(claimsDTO.getPatient());
			claims.setPlans(claimsDTO.getPlans());
			claims.setInvoiceAmount(claimsDTO.getInvoiceAmount());
		} else {
			logger.error("Claim Id Not Found!!!!");
			throw new ClaimNotValidException(HttpStatus.BAD_REQUEST,
					"Claim with Id " + claimId + " os invalid or never processed");
		}
		return repository.save(claims);
	}

	@Override
	public List<InsuranceClaims> getAllInsuranceClaims() {

		logger.info("Fetched All the data!!!!");
		return repository.findAll();
	}

}
