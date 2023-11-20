package com.hexaware.medicalbillingsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.hexaware.medicalbillingsystem.entities.InsuranceClaims;
/*
@Author : Hema Sree  
Modified Date :08-11-2023
Description : Repository for InsuranceClaims class extending JpaRepository
*/

@Repository
public interface InsuranceClaimsRepository extends JpaRepository<InsuranceClaims, Long> {

	

	@Query("select claim from InsuranceClaims claim where claim.claimStatus=?1")
	public List<InsuranceClaims> getSortedInsuranceclaims(String claimStatus);
}
