package com.hexaware.medicalbillingsystem.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexaware.medicalbillingsystem.dto.PatientsDTO;
import com.hexaware.medicalbillingsystem.entities.Patients;

public interface PatientRepository extends JpaRepository<Patients, Long> {
	
	Optional<PatientsDTO> findByPatientName(String patientName);
	

}
