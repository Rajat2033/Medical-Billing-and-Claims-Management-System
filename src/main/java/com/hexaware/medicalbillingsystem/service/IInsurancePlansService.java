package com.hexaware.medicalbillingsystem.service;

import java.util.Set;

import com.hexaware.medicalbillingsystem.dto.InsurancePlansDTO;
import com.hexaware.medicalbillingsystem.entities.InsurancePlans;

public interface IInsurancePlansService {
	
	public InsurancePlans addInsurancePlan(InsurancePlansDTO plansdto);
	
	public InsurancePlans updateInsurancePlans(InsurancePlansDTO plansdto);
	 
	public void deleteInsurancePlan(int planId);
	
	public InsurancePlansDTO getPlanByName(String planName);
	
	public Set<InsurancePlans> getAllPlans();
	
}
