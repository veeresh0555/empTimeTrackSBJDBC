package com.hcl.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.exception.RecordsNotFound;
import com.hcl.model.Employe;
import com.hcl.model.LoginTimeAudit;
import com.hcl.repository.EmployeeRepository;
import com.hcl.repository.LoginAuditRepository;

@RestController
public class TestController {

	@Autowired
	EmployeeRepository audit;
	
	@Autowired
	LoginAuditRepository loginrepo;
	
	@GetMapping("/getcount")
	public ResponseEntity<?> getempcount() throws RecordsNotFound{//for Testing
		
		
		return new ResponseEntity<Integer>(audit.count(), new HttpHeaders(), HttpStatus.OK);
	}
	
	
	@PostMapping("/empsave")
	public ResponseEntity<Integer> empsave(@Valid @RequestBody Employe emp) throws RecordsNotFound{
		return new ResponseEntity<Integer>(audit.empsave(emp),new HttpHeaders(),HttpStatus.OK);
	}

	
	
	@PostMapping("/timesave")
	public ResponseEntity<Integer> timesave(@Valid @RequestBody LoginTimeAudit laudit) throws RecordsNotFound{
		return new ResponseEntity<Integer>(loginrepo.auditsave(laudit),new HttpHeaders(),HttpStatus.OK);
	}
	
	
	
	
	
	/*
	 * @PostMapping("/empsave") public int empsavesave(Employe emp) { int result=0;
	 * try { result=audit.empsave(emp);
	 * 
	 * } catch (Exception e) { e.printStackTrace(); }
	 * 
	 * return result; }
	 */
	
	
	
	/*
	 * @GetMapping("/getcount") public int getempcount() { int result=0; try {
	 * result=audit.count(); System.out.println("Result: "+result); } catch
	 * (Exception e) { e.printStackTrace(); }
	 * 
	 * return result; }
	 */
	 
	
	
	/*
	 * @PostMapping("/Timesave") public int empsavesave(LoginTimeAudit laudit) { int
	 * result=0; try { result=loginrepo.auditsave(laudit);
	 * 
	 * } catch (Exception e) { e.printStackTrace(); }
	 * 
	 * return result; }
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
