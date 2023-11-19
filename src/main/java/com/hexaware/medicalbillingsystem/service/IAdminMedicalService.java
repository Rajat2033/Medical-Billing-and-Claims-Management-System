package com.hexaware.medicalbillingsystem.service;

import com.hexaware.medicalbillingsystem.dto.AdminMedicalDTO;
import com.hexaware.medicalbillingsystem.entities.AdminMedical;

public interface IAdminMedicalService {
	public AdminMedical insertNewAdmin(AdminMedicalDTO adminDTO);
	public AdminMedical updateAdmin(AdminMedicalDTO adminDTO,int adminId);
	

}
