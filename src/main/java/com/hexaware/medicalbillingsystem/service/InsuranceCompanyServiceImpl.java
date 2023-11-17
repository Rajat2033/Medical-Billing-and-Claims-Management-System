package com.hexaware.medicalbillingsystem.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.medicalbillingsystem.dto.InsuranceCompanyDTO;
import com.hexaware.medicalbillingsystem.entities.InsuranceCompany;
import com.hexaware.medicalbillingsystem.repository.InsuranceCompanyRepository;

@Service
public class InsuranceCompanyServiceImpl implements IInsuranceCompanyService {

	@Autowired
	private InsuranceCompanyRepository repository;
	
	@Override
	public InsuranceCompany addCompany(InsuranceCompanyDTO companydto) {

		InsuranceCompany company=new InsuranceCompany();
		company.setCompanyName(companydto.getCompanyName());
		company.setCompanyPassword(companydto.getCompanyPassword());
		company.setCompanyEmail(companydto.getCompanyEmail());
		company.setCompanyContact(companydto.getCompanyContact());
		company.setCompanyStartYears(companydto.getCompanyStartYears());
		return repository.save(company);
	}

	@Override
	public InsuranceCompany updateCompany(InsuranceCompanyDTO companydto) {

		return null;
	}

	@Override
	public void deleteCompany(int companyId) {

		repository.deleteById(companyId);
		
	}

	@Override
	public InsuranceCompanyDTO getCompanyByName(String companyName) {
	
		return null;
	}

	@Override
	public List<InsuranceCompany> getAllInsuranceCompanyDetails() {
		
	
		return repository.findAll();
	}

	
}
