package com.hexaware.medicalbillingsystem.exceptions;

import org.springframework.http.HttpStatusCode;
import org.springframework.web.server.ResponseStatusException;

public class PatientNotFoundException extends ResponseStatusException{

	public PatientNotFoundException(HttpStatusCode status, String reason) {
		super(status, reason);
		// TODO Auto-generated constructor stub
	}

}
