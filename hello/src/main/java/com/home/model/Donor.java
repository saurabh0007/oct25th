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

	public class Donor{
		
		@Id @GeneratedValue(strategy=GenerationType.AUTO)

	private int Id;

	private String DonorName;

	private String EmailID;

	private String DateOfDonation;

	private String City;

	private String ZipCode;

	private String PhoneNo;

	private int Role = 1;

	private boolean Active = true;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	@NotEmpty(message="This field is mandatory")
	public String getDonorName() {
		return DonorName;
	}

	public void setUsername(String username) {
		DonorName = DonorName;
	}

	@NotEmpty(message="This field is mandatory")
	public String getEmailID() {
		return EmailID;
	}

	public void setEmailID(String password) {
		EmailID = EmailID;
	}

	@NotEmpty(message="This field is mandatory")
	public String getDateOfDonation() {
		return DateOfDonation;
	}

	public void setDateOfDonation(String DateOfDonation) {
		DateOfDonation = DateOfDonation;
	}

	@NotEmpty(message="This field is mandatory")
	@Email(message="Invalid City format")
	public String getCity() {
		return City;
	}

	public void setCity(String City) {
		City = City;
	}

	
	@NotEmpty(message="This field is mandatory")
	public String getZipCoden() {
		return ZipCode;
	}

	public void setZipCode(String ZipCode) {
		ZipCode = ZipCode;
	}

	@Pattern(message="Phone Number must be a valid 10 Digit Mobile Number",regexp="^[987][0-9]{9}$")
	@NotEmpty(message="This field is mandatory")
	public String getPhone() {
		return PhoneNo;
	}

	public void setPhoneNO(String PhoneNo) {
		PhoneNo = PhoneNo;
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




