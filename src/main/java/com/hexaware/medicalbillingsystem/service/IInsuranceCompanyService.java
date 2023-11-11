package com.hexaware.medicalbillingsystem.service;

import java.util.Set;

import com.hexaware.medicalbillingsystem.entities.InsuranceCompany;

public interface IInsuranceCompanyService {
	public int addCompany(InsuranceCompany company);
	public int updateCompany(InsuranceCompany company);
	public int deleteCompany(int companyId);
	public InsuranceCompany  getCompanyByName(String companyName);
	public Set<InsuranceCompany> getAllInsuranceCompanyDetails();
}
