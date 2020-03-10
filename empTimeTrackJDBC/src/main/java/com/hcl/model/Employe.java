package com.hcl.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class Employe {

	   @NotNull
	   @NotBlank(message = "Id cannot be blank")
	   private Long id;
	   @NotNull
	   @NotBlank(message = "Emp Id cannot be blank")
	   private Long eid;
	   @NotNull
	   @NotBlank(message = "Ename cannot be blank")
	   private String ename;
	   @NotNull
	   @NotBlank(message = "Designation cannot be blank")
	   private String designation;
	   @NotNull
	   @NotBlank(message = "Location cannot be blank")
	   private String location;
	
	   public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}
	   
	public Long getEid() {
		return eid;
	}
	
	public void setEid(Long eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	   
	   
	   
	   
	
	
	
}
