package com.hcl.repository;

import com.hcl.exception.RecordsNotFound;
import com.hcl.model.LoginTimeAudit;

public interface LoginAuditRepository {
	
	int auditcount();

    int auditsave(LoginTimeAudit auditsave) throws RecordsNotFound;

    //int auditupdate(LoginTimeAudit auditupdate);
}
