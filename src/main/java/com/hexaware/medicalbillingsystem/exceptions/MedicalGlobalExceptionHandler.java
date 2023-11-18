package com.hexaware.medicalbillingsystem.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
<<<<<<< HEAD:src/main/java/com/hexaware/medicalbillingsystem/exceptions/MedicalGlobalExceptionHandler.java

=======
/*
@Author : Rajat Darvhekar  
Modified Date : 15-10-2023
Description : Getting the exception of MedicalExceptionHandler
*/
>>>>>>> 5294ea0a4043e5eafc9eb48d7177d5d043fa09bb:src/main/java/com/hexaware/medicalbillingsystem/exceptions/MedicalExceptionHandler.java
@RestControllerAdvice
public class MedicalGlobalExceptionHandler {

	@ResponseStatus
	@ExceptionHandler({ PatientNotFoundException.class, PatientIllegalArgumentsException.class,
			PlanNotFoundException.class, NoSuchInvoiceGeneratedException.class, ClaimNotValidException.class,
			CompanyNotRegisteredException.class })
	public ResponseEntity<String> handleAnyException(Exception e) {
		return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
	}
}
