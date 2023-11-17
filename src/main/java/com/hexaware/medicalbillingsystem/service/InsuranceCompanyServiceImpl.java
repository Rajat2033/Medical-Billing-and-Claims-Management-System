package com.hexaware.medicalbillingsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.hexaware.medicalbillingsystem.dto.InsuranceCompanyDTO;
import com.hexaware.medicalbillingsystem.entities.InsuranceCompany;
import com.hexaware.medicalbillingsystem.exceptions.CompanyNotRegisteredException;
import com.hexaware.medicalbillingsystem.repository.InsuranceCompanyRepository;

@Service
public class InsuranceCompanyServiceImpl implements IInsuranceCompanyService {

	@Autowired
	private InsuranceCompanyRepository repository;

	@Override
	public InsuranceCompany addCompany(InsuranceCompanyDTO companydto) {

		InsuranceCompany company = new InsuranceCompany();
		company.setCompanyName(companydto.getCompanyName());
		company.setCompanyPassword(companydto.getCompanyPassword());
		company.setCompanyEmail(companydto.getCompanyEmail());
		company.setCompanyContact(companydto.getCompanyContact());
		company.setCompanyStartYears(companydto.getCompanyStartYears());
		return repository.save(company);
	}

	@Override
	public InsuranceCompany updateCompany(InsuranceCompanyDTO companydto) {

		InsuranceCompany company = new InsuranceCompany();
		company.setCompanyId(companydto.getCompanyId());
		company.setCompanyName(companydto.getCompanyName());
		company.setCompanyPassword(companydto.getCompanyPassword());
		company.setCompanyEmail(companydto.getCompanyEmail());
		company.setCompanyContact(companydto.getCompanyContact());
		company.setCompanyStartYears(companydto.getCompanyStartYears());
		return repository.save(company);
	}

	@Override
	public void deleteCompanyById(int companyId) {
		repository.deleteById(companyId);

	}

	@Override
	public InsuranceCompanyDTO getCompanyByName(String companyName) {

		InsuranceCompany company = repository.findByCompanyName(companyName)
				.orElseThrow(() -> new CompanyNotRegisteredException(HttpStatus.SERVICE_UNAVAILABLE,
						"Company With name : " + companyName + " has not registered with us !!"));
		InsuranceCompanyDTO companyDTO = new InsuranceCompanyDTO();
		companyDTO.setCompanyId(company.getCompanyId());
		companyDTO.setCompanyName(company.getCompanyName());
		companyDTO.setCompanyPassword(company.getCompanyPassword());
		companyDTO.setCompanyEmail(company.getCompanyEmail());
		companyDTO.setCompanyContact(company.getCompanyContact());
		companyDTO.setCompanyStartYears(company.getCompanyStartYears());

		return companyDTO;
	}

	@Override
	public List<InsuranceCompany> getAllInsuranceCompanyDetails() {

		return repository.findAll();
	}

}
