package com.hexaware.medicalbillingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hexaware.medicalbillingsystem.dto.InsuranceClaimsDTO;
import com.hexaware.medicalbillingsystem.entities.InsuranceClaims;

@Repository
public interface InsuranceClaimsRepository extends JpaRepository<InsuranceClaims, Long> {

	

	@Query("select count(claim) from InsuranceClaims claim where claim.claimStatus=?1")
	public InsuranceClaimsDTO getTotalPendingInsuranceClaims(String claimStatus);
	
	@Query(value="select count(claim) from InsuranceClaims claim where claim.claimStatus=?1")
	public InsuranceClaimsDTO getTotalApprovedClaims(String claimStatus);
}
