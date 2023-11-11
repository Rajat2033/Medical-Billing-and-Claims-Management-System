package com.hexaware.medicalbillingsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.medicalbillingsystem.dto.PatientsDTO;
import com.hexaware.medicalbillingsystem.entities.InsurancePlans;
import com.hexaware.medicalbillingsystem.entities.Patients;
import com.hexaware.medicalbillingsystem.repository.PatientRepository;

@Service
public class PatientsServiceImpl implements IPatientsService {

	@Autowired
	PatientRepository repository;
	
	@Override
	public Patients addPatients(PatientsDTO patientsdto) {
		Patients patient=new Patients();
		patient.setPatientName(patientsdto.getPatientName());
		patient.setPatientEmail(patientsdto.getPatientEmail());
		patient.setPatientPassword(patientsdto.getPatientPassword());
		patient.setPatientDOB(patientsdto.getPatientDOB());
		patient.setPatientGender(patientsdto.getPatientGender());
		patient.setPatientContact(patientsdto.getPatientContact());
		patient.setPatientAddress(patientsdto.getPatientAddress());
		patient.setPatientDisease(patientsdto.getPatientDisease());
		patient.setPlans(patientsdto.getPlans() );
		return repository.save(patient);
	}

	@Override
	public Patients updatepatients(PatientsDTO patientsdto) {
		Patients patient=new Patients();
		patient.setPatientName(patientsdto.getPatientName());
		patient.setPatientEmail(patientsdto.getPatientEmail());
		patient.setPatientPassword(patientsdto.getPatientPassword());
		patient.setPatientDOB(patientsdto.getPatientDOB());
		patient.setPatientGender(patientsdto.getPatientGender());
		patient.setPatientContact(patientsdto.getPatientContact());
		patient.setPatientAddress(patientsdto.getPatientAddress());
		patient.setPatientDisease(patientsdto.getPatientDisease());
		return repository.save(patient);
	}

	@Override
	public void deletePatients(long patientId) {
		// TODO Auto-generated method stub
		 repository.deleteById(patientId);;
	}

	@Override
	public PatientsDTO getPatientByName(String patientName) {
	Patients patient=	repository.findByPatientName(patientName).orElse(new Patients());
	PatientsDTO patientdto=new PatientsDTO();
	patientdto.setPatientName(patient.getPatientName());
	patientdto.setPatientEmail(patient.getPatientEmail());
	patientdto.setPatientPassword(patient.getPatientPassword());
	patientdto.setPatientDOB(patient.getPatientDOB());
	patientdto.setPatientGender(patient.getPatientGender());
	patientdto.setPatientContact(patient.getPatientContact());
	patientdto.setPatientAddress(patient.getPatientAddress());
	patientdto.setPatientDisease(patient.getPatientDisease());
	
	return patientdto;
	}

	@Override
	public List<Patients> getAllPatients() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	
}
