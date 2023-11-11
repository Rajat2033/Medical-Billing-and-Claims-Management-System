package com.hexaware.medicalbillingsystem.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.medicalbillingsystem.dto.InsurancePlansDTO;
import com.hexaware.medicalbillingsystem.entities.InsuranceClaims;
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
		

        Set<InsuranceClaims> claimSet = new HashSet<>();
        for (InsuranceClaims claimdto : plans.getClaims()) {
            InsuranceClaims claims = new InsuranceClaims();
            claims.setClaimAmount(claimdto.getClaimAmount());
            claims.setClaimStatus(claimdto.getClaimStatus());
            claims.setPatient(claimdto.getPatient());
            claims.setPlans(plans);
           
            claimSet.add(claimdto);
        }

        plans.setClaims(claimSet);
		
		
		return repository.save(plans);
	}

	@Override
	public InsurancePlans updateInsurancePlans(InsurancePlansDTO plansdto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteInsurancePlan(int planId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public InsurancePlansDTO getPlanByName(String planName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<InsurancePlans> getAllPlans() {
		// TODO Auto-generated method stub
		return null;
	}


}
