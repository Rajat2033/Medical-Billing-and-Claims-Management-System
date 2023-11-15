package com.hexaware.medicalbillingsystem.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.medicalbillingsystem.entities.Patients;

@Repository
public interface PatientRepository extends JpaRepository<Patients, Long> {
	
	Optional<Patients> findByPatientName(String patientName);
	

}
