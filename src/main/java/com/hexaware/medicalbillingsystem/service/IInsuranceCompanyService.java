package com.hexaware.medicalbillingsystem.service;

import java.util.Set;

import com.hexaware.medicalbillingsystem.dto.InsuranceCompanyDTO;
import com.hexaware.medicalbillingsystem.entities.InsuranceCompany;

public interface IInsuranceCompanyService {
	public InsuranceCompany addCompany(InsuranceCompanyDTO companydto);
	public InsuranceCompany updateCompany(InsuranceCompanyDTO companydto);
	public void deleteCompany(int companyId);
	public InsuranceCompanyDTO  getCompanyByName(String companyName);
	public Set<InsuranceCompany> getAllInsuranceCompanyDetails();
}
