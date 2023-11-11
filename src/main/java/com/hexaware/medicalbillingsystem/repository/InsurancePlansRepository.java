package com.hexaware.medicalbillingsystem.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.medicalbillingsystem.dto.InsurancePlansDTO;
import com.hexaware.medicalbillingsystem.entities.InsurancePlans;

@Repository
public interface InsurancePlansRepository extends JpaRepository<InsurancePlans, Integer> {

	Optional<InsurancePlans> findByPlanName(String planName);
}
