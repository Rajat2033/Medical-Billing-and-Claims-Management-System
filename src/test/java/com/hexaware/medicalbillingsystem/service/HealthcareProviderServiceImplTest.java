package com.hexaware.medicalbillingsystem.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.hexaware.medicalbillingsystem.dto.HealthcareProviderDTO;
import com.hexaware.medicalbillingsystem.entities.HealthcareProvider;
import com.hexaware.medicalbillingsystem.repository.HealthcareProviderRepository;

class HealthcareProviderServiceImplTest {

	@Mock
	HealthcareProviderRepository providerRepositoryMock;
	
	@Autowired
	HealthcareProviderRepository providerRepository;
	
	@Mock
	private PasswordEncoder passwordEncoderMock;

	@MockBean
	private PasswordEncoder passwordEncoder;
	
	@InjectMocks
	HealthcareProviderServiceImpl providerService;

	@BeforeEach
	public void setup() {
		MockitoAnnotations.openMocks(this);
	}

	@Test
	void testAddProvider() {
		HealthcareProviderDTO providerDTO=new HealthcareProviderDTO();
		HealthcareProvider provider = new HealthcareProvider();
		provider.setProviderId(providerDTO.getProviderId());
		provider.setProviderName(providerDTO.getProviderName());
		provider.setProviderPassword(providerDTO.getProviderPassword());
		provider.setProviderEmail(providerDTO.getProviderEmail());
		provider.setProviderGender(providerDTO.getProviderGender());
		provider.setProviderSpeciality(providerDTO.getProviderSpeciality());
		provider.setProviderDesignation(providerDTO.getProviderDesignation());
		provider.setProviderExperience(providerDTO.getProviderExperience());
		provider.setProviderQualification(providerDTO.getProviderQualification());
		
		
		when(passwordEncoderMock.encode(providerDTO.getProviderPassword())).thenReturn("encodedPassword");
		when(providerRepositoryMock.save(any(HealthcareProvider.class))).thenReturn(provider);

		HealthcareProvider createdProvider= providerService.addProvider(providerDTO);

		verify(passwordEncoderMock).encode(providerDTO.getProviderPassword());
		verify(providerRepositoryMock).save(any(HealthcareProvider.class));

		assertEquals(provider.getProviderId(), createdProvider.getProviderId());
		assertEquals(provider.getProviderName(),createdProvider.getProviderName());
		assertEquals(provider.getProviderPassword(), createdProvider.getProviderPassword());
		assertEquals(provider.getProviderEmail(), createdProvider.getProviderEmail());
		assertEquals(provider.getProviderGender(), createdProvider.getProviderGender());
		assertEquals(provider.getProviderSpeciality(),createdProvider.getProviderSpeciality());
		assertEquals(provider.getProviderDesignation(), createdProvider.getProviderDesignation());
		assertEquals(provider.getProviderExperience(), createdProvider.getProviderExperience());
		assertEquals(provider.getProviderQualification(),createdProvider.getProviderQualification());
		assertEquals(provider.getRole(),createdProvider.getRole());
		
		


	}

	@Test
	void testUpdateProvider() {
		HealthcareProviderDTO providerDTO=new HealthcareProviderDTO();
		int providerIdToUpdate=providerDTO.getProviderId();
	        HealthcareProvider existingProvider = new HealthcareProvider();
	        existingProvider.setProviderId(providerIdToUpdate);

	        HealthcareProvider updatedProvider = new HealthcareProvider();
	        updatedProvider.setProviderId(providerIdToUpdate);
	        updatedProvider.setProviderName(providerDTO.getProviderName());

	        when(providerRepository.findById(providerIdToUpdate)).thenReturn(Optional.of(existingProvider));
	        when(providerRepository.save(any())).thenReturn(updatedProvider);

	        // Act
	        HealthcareProvider result = providerService.updateProvider( providerDTO);

	        // Assert
	        verify(providerRepository, times(1)).findById(providerIdToUpdate);
	        verify(providerRepository, times(1)).save(updatedProvider);
	}

	@Test
	void testDeleteProvider() {
		HealthcareProvider existingProvider=new HealthcareProvider();
		HealthcareProviderDTO providerDTO=new HealthcareProviderDTO();
		existingProvider.setProviderId(providerDTO.getProviderId());
		existingProvider.setProviderName(existingProvider.getProviderName());
		existingProvider.setProviderPassword(existingProvider.getProviderPassword());
		existingProvider.setProviderEmail(existingProvider.getProviderEmail());
		existingProvider.setProviderGender(existingProvider.getProviderGender());
		existingProvider.setProviderSpeciality(existingProvider.getProviderSpeciality());
		existingProvider.setProviderDesignation(existingProvider.getProviderDesignation());
		existingProvider.setProviderExperience(existingProvider.getProviderExperience());
		existingProvider.setProviderQualification(existingProvider.getProviderQualification());
		
		when(providerRepositoryMock.findById(existingProvider.getProviderId())).thenReturn(Optional.of(existingProvider));
		
		providerService.deleteProvider(existingProvider.getProviderId());
		
		verify(providerRepositoryMock).findById(existingProvider.getProviderId());
		verify(providerRepositoryMock).delete(existingProvider);
		
	}

	@Test
	void testGetAllHealthcareProviders() {
		providerService.getAllHealthcareProviders();
		verify(providerRepositoryMock).findAll();
	}

	@Test
	void testGetProviderById() {
		
		HealthcareProvider existingProvider=new HealthcareProvider();
		existingProvider.setProviderId(existingProvider.getProviderId());
		existingProvider.setProviderName(existingProvider.getProviderName());
		existingProvider.setProviderPassword(existingProvider.getProviderPassword());
		existingProvider.setProviderEmail(existingProvider.getProviderEmail());
		existingProvider.setProviderGender(existingProvider.getProviderGender());
		existingProvider.setProviderSpeciality(existingProvider.getProviderSpeciality());
		existingProvider.setProviderDesignation(existingProvider.getProviderDesignation());
		existingProvider.setProviderExperience(existingProvider.getProviderExperience());
		existingProvider.setProviderQualification(existingProvider.getProviderQualification());
		
		when(providerRepositoryMock.findById(existingProvider.getProviderId())).thenReturn(Optional.of(existingProvider));
		HealthcareProviderDTO providerDTO=providerService.getProviderById(existingProvider.getProviderId());
		verify(providerRepositoryMock).findById(existingProvider.getProviderId());
		assertEquals(existingProvider.getProviderId(), providerDTO.getProviderId());
		
	}

	}


