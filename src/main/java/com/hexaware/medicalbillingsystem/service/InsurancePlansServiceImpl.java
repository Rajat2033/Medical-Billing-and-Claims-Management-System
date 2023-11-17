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
	private InsurancePlansRepository repository;
	
	@Override
	public InsurancePlans addInsurancePlan(InsurancePlansDTO plansdto) {
		
		InsurancePlans plans=new InsurancePlans();
		plans.setPlanName(plansdto.getPlanName());
		plans.setPlanType(plansdto.getPlanType());
		plans.setPlanCoverAmount(plansdto.getPlanCoverAmount());
		plans.setPlanEmi(plansdto.getPlanEmi());
		plans.setPlanDetails(plansdto.getPlanDetails());
		
		
		return repository.save(plans);
	}



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
		planDTO.setPlanDetails(plans.getPlanDetails());
		planDTO.setClaims(plans.getClaims());
		return planDTO;
		
	}

	@Override
	public List<InsurancePlans> getAllPlans() {
		
		return repository.findAll();
	}

	@Override
	public InsurancePlans updateInsurancePlans(InsurancePlansDTO plansdto) {
		
		
		InsurancePlans plans=new InsurancePlans();
		plans.setPlanName(plansdto.getPlanName());
		plans.setPlanType(plansdto.getPlanType());
		plans.setPlanCoverAmount(plansdto.getPlanCoverAmount());
		plans.setPlanEmi(plansdto.getPlanEmi());
		plans.setPlanDetails(plansdto.getPlanDetails());
		
		
		return repository.save(plans);
	}


}
