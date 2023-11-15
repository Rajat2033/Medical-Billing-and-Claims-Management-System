package com.hexaware.medicalbillingsystem.exceptions;

import org.springframework.http.HttpStatusCode;
import org.springframework.web.server.ResponseStatusException;

public class PlanNotFoundException extends ResponseStatusException{

	public PlanNotFoundException(HttpStatusCode status, String reason) {
		super(status, reason);

	}

	

}
