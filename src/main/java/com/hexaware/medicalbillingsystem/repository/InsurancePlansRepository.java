package com.hexaware.medicalbillingsystem.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexaware.medicalbillingsystem.dto.InsurancePlansDTO;
import com.hexaware.medicalbillingsystem.entities.InsurancePlans;

public interface InsurancePlansRepository extends JpaRepository<InsurancePlans, Integer> {

	Optional<InsurancePlansDTO> findByPlanName(String planName);
}
