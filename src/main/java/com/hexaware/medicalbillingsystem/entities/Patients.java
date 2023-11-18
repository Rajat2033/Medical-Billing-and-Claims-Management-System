package com.hexaware.medicalbillingsystem.entities;

import java.io.Serializable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
/*
@Author :  Hema Sree 
Modified Date : 26-10-2023
Description : Entity class for Patients containing various properties
*/

@Entity
public class Patients implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Min(value = 1)
	private long patientId;
	@NotBlank
	private String patientName;
	@Email
	private String patientEmail;
	@Pattern(regexp = "^[a-zA-Z0-9]{8}", message = "Letter must be 8")
	private String patientPassword;
	private String patientDOB;
	@NotBlank
	private String patientGender;
	private long patientContact;
	private String patientAddress;
	@NotBlank
	private String patientDisease;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "planId")
	private InsurancePlans plans;

	private final String role="PATIENTS";
	public Patients() {
		super();

	}

	public Patients(long patientId, @NotBlank String patientName, @Email String patientEmail,
			@Pattern(regexp = "^[a-zA-Z0-9]{8}", message = "Letter must be 8") String patientPassword,
			String patientDOB, @NotBlank String patientGender, long patientContact, String patientAddress,
			@NotBlank String patientDisease, InsurancePlans plans) {
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

	public String getRole() {
		return role;
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

	@Override
	public String toString() {
		return "Patients [patientId=" + patientId + ", patientName=" + patientName + ", patientEmail=" + patientEmail
				+ ", patientPassword=" + patientPassword + ", patientDOB=" + patientDOB + ", patientGender="
				+ patientGender + ", patientContact=" + patientContact + ", patientAddress=" + patientAddress
				+ ", patientDisease=" + patientDisease + ", plans=" + plans + "]";
	}

}
