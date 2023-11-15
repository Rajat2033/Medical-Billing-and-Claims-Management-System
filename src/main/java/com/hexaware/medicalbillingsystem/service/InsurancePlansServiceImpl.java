package com.hexaware.medicalbillingsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.medicalbillingsystem.dto.InsurancePlansDTO;
import com.hexaware.medicalbillingsystem.entities.InsurancePlans;
import com.hexaware.medicalbillingsystem.repository.InsurancePlansRepository;

@Service
public class InsurancePlansServiceImpl implements IInsurancePlansService{

	@Autowired
	IInsuranceClaimsService service;
	@Autowired
	InsurancePlansRepository repository;
	@Override
	public InsurancePlans addInsurancePlan(InsurancePlansDTO plansdto) {
		
		InsurancePlans plans=new InsurancePlans();
		plans.setPlanName(plansdto.getPlanName());
		plans.setPlanType(plansdto.getPlanType());
		plans.setPlanCoverAmount(plansdto.getPlanCoverAmount());
		plans.setPlanEmi(plansdto.getPlanEmi());
		plans.setPlanDetails(plansdto.getPlanDetails());
		/*
		 * 
		 * Set<InsuranceClaims> claimSet = new HashSet<>(); for (InsuranceClaims
		 * claimdto : plansdto.getClaims()) { InsuranceClaims claims = new
		 * InsuranceClaims(); claims.setClaimAmount(claimdto.getClaimAmount());
		 * claims.setClaimStatus(claimdto.getClaimStatus());
		 * claims.setPatient(claimdto.getPatient()); claims.setPlans(plans);
		 * 
		 * claimSet.add(claimdto); }
		 * 
		 * plans.setClaims(claimSet);
		 */
		
		
		return repository.save(plans);
	}

//	@Override
//	public InsurancePlans updateInsurancePlans(InsurancePlansDTO plansdto) {

//		return ;
//	}

	@Override
	public void deleteInsurancePlan(int planId) {
		
		repository.deleteById(planId);
		
	}

	@Override
	public InsurancePlansDTO getPlanByName(String planName) {
		InsurancePlans plans=repository.findByPlanName(planName).orElse(new InsurancePlans());
		InsurancePlansDTO planDTO=new InsurancePlansDTO();
		planDTO.setPlanId(plans.getPlanId());
		planDTO.setPlanName(plans.getPlanName());
		planDTO.setPlanType(plans.getPlanType());
		planDTO.setPlanCoverAmount(plans.getPlanCoverAmount());
		planDTO.setPlanEmi(plans.getPlanEmi());
		planDTO.setPlanEmi(plans.getPlanEmi());
		planDTO.setClaims(plans.getClaims());
		return planDTO;
		
	}

	@Override
	public List<InsurancePlans> getAllPlans() {
		
		return repository.findAll();
	}

	@Override
	public InsurancePlans updateInsurancePlans(InsurancePlansDTO plansdto) {
		
		return null;
	}


}
