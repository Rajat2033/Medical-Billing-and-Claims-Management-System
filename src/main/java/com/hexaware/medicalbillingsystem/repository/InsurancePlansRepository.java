package com.hexaware.medicalbillingsystem.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.medicalbillingsystem.entities.InsurancePlans;
/*
@Author :   Rajat Darvhekar  
Modified Date :06-11-2023
Description : Repository for InsurancePlans class extending JpaRepository
*/
@Repository
public interface InsurancePlansRepository extends JpaRepository<InsurancePlans, Integer> {

	Optional<InsurancePlans> findByPlanName(String planName);
}
