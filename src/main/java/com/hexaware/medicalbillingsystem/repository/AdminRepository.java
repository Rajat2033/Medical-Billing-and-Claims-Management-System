package com.hexaware.medicalbillingsystem.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.medicalbillingsystem.entities.AdminMedical;

@Repository
public interface AdminRepository extends JpaRepository<AdminMedical, Integer> {
	
	Optional<AdminMedical> findByAdminName(String adminName);

}
