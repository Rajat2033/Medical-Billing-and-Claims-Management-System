package com.hexaware.medicalbillingsystem.dto;

import com.hexaware.medicalbillingsystem.entities.InsurancePlans;

public class PatientsDTO {
	
	private long patientId;
	private String patientName;
	private String patientEmail;
	private String patientPassword;
	private String patientDOB;
	private String patientGender;
	private long patientContact;
	private String patientAddress;
	private String patientDisease;
	private InsurancePlans plans;
	public PatientsDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PatientsDTO(long patientId, String patientName, String patientEmail, String patientPassword,
			String patientDOB, String patientGender, long patientContact, String patientAddress, String patientDisease,
			InsurancePlans plans) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.patientEmail = patientEmail;
		this.patientPassword = patientPassword;
		this.patientDOB = patientDOB;
		this.patientGender = patientGender;
		this.patientContact = patientContact;
		this.patientAddress = patientAddress;
		this.patientDisease = patientDisease;
		this.plans = plans;
	}
	public long getPatientId() {
		return patientId;
	}
	public void setPatientId(long patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getPatientEmail() {
		return patientEmail;
	}
	public void setPatientEmail(String patientEmail) {
		this.patientEmail = patientEmail;
	}
	public String getPatientPassword() {
		return patientPassword;
	}
	public void setPatientPassword(String patientPassword) {
		this.patientPassword = patientPassword;
	}
	public String getPatientDOB() {
		return patientDOB;
	}
	public void setPatientDOB(String patientDOB) {
		this.patientDOB = patientDOB;
	}
	public String getPatientGender() {
		return patientGender;
	}
	public void setPatientGender(String patientGender) {
		this.patientGender = patientGender;
	}
	public long getPatientContact() {
		return patientContact;
	}
	public void setPatientContact(long patientContact) {
		this.patientContact = patientContact;
	}
	public String getPatientAddress() {
		return patientAddress;
	}
	public void setPatientAddress(String patientAddress) {
		this.patientAddress = patientAddress;
	}
	public String getPatientDisease() {
		return patientDisease;
	}
	public void setPatientDisease(String patientDisease) {
		this.patientDisease = patientDisease;
	}
	public InsurancePlans getPlans() {
		return plans;
	}
	public void setPlans(InsurancePlans plans) {
		this.plans = plans;
	}

	
}
