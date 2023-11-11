package com.hexaware.medicalbillingsystem.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexaware.medicalbillingsystem.dto.HealthcareProviderDTO;
import com.hexaware.medicalbillingsystem.entities.HealthcareProvider;

public interface HealthcareProviderRepository extends JpaRepository<HealthcareProvider, Integer> {

}
