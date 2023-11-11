package com.hexaware.medicalbillingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.medicalbillingsystem.entities.InsuranceClaims;

@Repository
public interface InsuranceCompanyRepository extends JpaRepository<InsuranceClaims, Integer> {

}
