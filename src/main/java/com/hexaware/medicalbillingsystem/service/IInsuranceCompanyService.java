package com.hexaware.medicalbillingsystem.service;

import java.util.List;

import com.hexaware.medicalbillingsystem.dto.InsuranceCompanyDTO;
import com.hexaware.medicalbillingsystem.entities.InsuranceCompany;

public interface IInsuranceCompanyService {
	public InsuranceCompany addCompany(InsuranceCompanyDTO companydto);

	public InsuranceCompany updateCompany(InsuranceCompanyDTO companydto);

	public void deleteCompanyById(int companyId);

	public InsuranceCompanyDTO getCompanyByName(String companyName);

	public List<InsuranceCompany> getAllInsuranceCompanyDetails();
}
