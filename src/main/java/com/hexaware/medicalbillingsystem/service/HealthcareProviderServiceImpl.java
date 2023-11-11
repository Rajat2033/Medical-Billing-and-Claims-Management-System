package com.hexaware.medicalbillingsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.medicalbillingsystem.dto.HealthcareProviderDTO;
import com.hexaware.medicalbillingsystem.entities.HealthcareProvider;
import com.hexaware.medicalbillingsystem.repository.HealthcareProviderRepository;

@Service
public class HealthcareProviderServiceImpl implements IHealthcareProviderService {

	@Autowired
	HealthcareProviderRepository repository;

	@Override
	public HealthcareProvider addProvider(HealthcareProviderDTO providerdto) {
		HealthcareProvider provider = new HealthcareProvider();

		provider.setProviderName(providerdto.getProviderName());
		provider.setProviderPassword(providerdto.getProviderPassword());
		provider.setProviderEmail(providerdto.getProviderEmail());
		provider.setProviderGender(providerdto.getProviderGender());
		provider.setProviderSpeciality(providerdto.getProviderSpeciality());
		provider.setProviderDesignation(providerdto.getProviderDesignation());
		provider.setProviderExperience(providerdto.getProviderExperience());
		provider.setProviderQualification(providerdto.getProviderQualification());
		return repository.save(provider);
	}

	@Override
	public HealthcareProvider updateProvider(HealthcareProviderDTO providerdto) {

		HealthcareProvider provider = new HealthcareProvider();
		provider.setProviderName(providerdto.getProviderName());
		provider.setProviderPassword(providerdto.getProviderPassword());
		provider.setProviderEmail(providerdto.getProviderEmail());
		provider.setProviderGender(providerdto.getProviderGender());
		provider.setProviderSpeciality(providerdto.getProviderSpeciality());
		provider.setProviderDesignation(providerdto.getProviderDesignation());
		provider.setProviderExperience(providerdto.getProviderExperience());
		provider.setProviderQualification(providerdto.getProviderQualification());
		return repository.save(provider);
	}

	@Override
	public void deleteProvider(int providerId) {
		repository.deleteById(providerId);

	}

	@Override
	public List<HealthcareProvider> getAllHealthcareProviders() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public HealthcareProviderDTO getProviderById(int providerId) {
		// TODO Auto-generated method stub
		
		HealthcareProvider provider=repository.findById(providerId).orElse(new HealthcareProvider());
		HealthcareProviderDTO providerdto=new HealthcareProviderDTO();
		providerdto.setProviderId(provider.getProviderId());
		providerdto.setProviderName(provider.getProviderName());
		providerdto.setProviderPassword(provider.getProviderPassword());
		providerdto.setProviderEmail(provider.getProviderEmail());
		providerdto.setProviderGender(provider.getProviderGender());
		providerdto.setProviderSpeciality(provider.getProviderSpeciality());
		providerdto.setProviderDesignation(provider.getProviderDesignation());
		providerdto.setProviderExperience(provider.getProviderExperience());
		providerdto.setProviderQualification(provider.getProviderQualification());
		return providerdto;
	}

}
