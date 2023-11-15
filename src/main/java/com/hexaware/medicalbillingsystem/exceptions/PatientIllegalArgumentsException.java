package com.hexaware.medicalbillingsystem.exceptions;

import org.springframework.http.HttpStatusCode;
import org.springframework.web.server.ResponseStatusException;

public class PatientIllegalArgumentsException extends ResponseStatusException {

	public PatientIllegalArgumentsException(HttpStatusCode status, String reason) {
		super(status, reason);

	}

	

}
