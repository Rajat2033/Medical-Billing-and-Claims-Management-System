package com.hexaware.medicalbillingsystem.service;

import java.util.Set;

import com.hexaware.medicalbillingsystem.entities.InsurancePlans;

public interface IInsurancePlansService {
	
	public int addInsurancePlan(InsurancePlans plans);
	
	public int updateInsurancePlans(InsurancePlans plans);
	 
	public int deleteInsurancePlan(int planId);
	
	public InsurancePlans getPlanByName(String planName);
	
	public Set<InsurancePlans> getAllPlans();
	
}
