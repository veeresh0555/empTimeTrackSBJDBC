package com.hcl.repository;

import javax.validation.Valid;

import com.hcl.exception.RecordsNotFound;
import com.hcl.model.Employe;
import com.hcl.model.LoginTimeAudit;

public interface EmployeeRepository{

	
	int count() throws RecordsNotFound;

    int empsave(Employe emp) throws RecordsNotFound;
    
   int getempById(Long id);

   //Integer timesave(@Valid LoginTimeAudit laudit) throws RecordsNotFound;
	
}
