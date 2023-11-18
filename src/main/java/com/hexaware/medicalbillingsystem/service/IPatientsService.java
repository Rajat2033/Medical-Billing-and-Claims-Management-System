package com.hexaware.medicalbillingsystem.service;

import java.util.List;

import com.hexaware.medicalbillingsystem.dto.PatientsDTO;
import com.hexaware.medicalbillingsystem.entities.Patients;


public interface IPatientsService {
	
	public Patients addPatients(PatientsDTO patientsdto);
	public Patients updatepatients(PatientsDTO patientsdto);
	public void deletePatients(long patientId);
	public PatientsDTO getPatientByName(String patientName);
	public List<Patients> getAllPatients();
	public boolean loginPatient(String patientEmail,String password);

}
