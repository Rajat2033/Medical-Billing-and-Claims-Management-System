package com.hexaware.medicalbillingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexaware.medicalbillingsystem.entities.InsuranceClaims;

public interface InsuranceCompanyRepository extends JpaRepository<InsuranceClaims, Integer> {

}
