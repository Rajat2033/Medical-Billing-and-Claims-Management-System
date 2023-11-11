package com.hexaware.medicalbillingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.medicalbillingsystem.entities.HealthcareProvider;
import com.hexaware.medicalbillingsystem.entities.InvoiceDetails;

@Repository
public interface InvoiceDetailsRepository extends JpaRepository<InvoiceDetails, Integer> {

}
