package com.hexaware.medicalbillingsystem.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.hexaware.medicalbillingsystem.entities.InsurancePlans;

@Service
public class InsurancePlansService implements IInsurancePlansService{

	@Override
	public int addInsurancePlan(InsurancePlans plans) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateInsurancePlans(InsurancePlans plans) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteInsurancePlan(int planId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public InsurancePlans getPlanByName(String planName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<InsurancePlans> getAllPlans() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
