package com.hexaware.medicalbillingsystem.service;

import java.util.Set;

import com.hexaware.medicalbillingsystem.dto.HealthcareProviderDTO;
import com.hexaware.medicalbillingsystem.entities.HealthcareProvider;

public interface IHealthcareProviderService {

	public HealthcareProvider addProvider(HealthcareProviderDTO providerdto);
	public HealthcareProvider updateProvider(HealthcareProviderDTO providerdto);
	public String deleteProvider(int providerId);
	
	public Set<HealthcareProvider> getAllHealthcareProviders();
	public HealthcareProviderDTO getProviderById(int providerId);

	
}
