package com.home.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity

public class Requirement {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)

	private int Id;

	private String BloodGroupName;

	private String EnterRequirementNumberOfUnit;

	private String DateOfRequirement;

	private String Requestfrom;

	private String RequestercontactNumber;

	
	private int Role = 1;

	private boolean Active = true;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	@NotEmpty(message="This field is mandatory")
	public String getBloodGroupName() {
		return BloodGroupName;
	}

	public void setBloodGroupName(String BloodGroupName) {
		BloodGroupName = BloodGroupName;
	}

	@NotEmpty(message="This field is mandatory")
	public String getEnterRequirementNumberOfUnit() {
		return  EnterRequirementNumberOfUnit;
	}

	public void setEnterRequirementNumberOfUnit(String EnterRequirementNumberOfUnit) {
		 EnterRequirementNumberOfUnit =  EnterRequirementNumberOfUnit;
	}

	@NotEmpty(message="This field is mandatory")
	public String getDateOfRequirement() {
		return DateOfRequirement;
	}

	public void setDateOfDonation(String DateOfDonation) {
		DateOfRequirement = DateOfRequirement;
	}

	@NotEmpty(message="This field is mandatory")
	@Email(message="Invalid Requestfrom format")
	public String getRequestfrom() {
		return Requestfrom;
	}

	public void setCity(String Requestfrom) {
		Requestfrom = Requestfrom;
	}

	

	@Pattern(message="Phone Number must be a valid 10 Digit Mobile Number",regexp="^[987][0-9]{9}$")
	@NotEmpty(message="This field is mandatory")
	public String getRequestercontactNumber() {
		return RequestercontactNumber;
	}

	public void setRequestercontactNumber(String RequestercontactNumber) {
		RequestercontactNumber = RequestercontactNumber;
	}

	public int getRole() {
		return Role;
	}

	public void setRole(int role) {
		Role = role;
	}

	public boolean isActive() {
		return Active;
	}

	public void setActive(boolean active) {
		Active = active;
	}




	}






