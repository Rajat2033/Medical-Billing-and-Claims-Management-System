package com.hexaware.medicalbillingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexaware.medicalbillingsystem.entities.HealthcareProvider;
import com.hexaware.medicalbillingsystem.entities.InvoiceDetails;

public interface InvoiceDetailsRepository extends JpaRepository<InvoiceDetails, Integer> {

}
