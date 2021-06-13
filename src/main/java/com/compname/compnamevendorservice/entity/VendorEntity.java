package com.compname.compnamevendorservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vendors")

public class VendorEntity {

	@Id
	private int Id;
	
	@Column(name="firstName")
	String firstName;

	@Column(name="lastName")
	String lastName;

	@Column(name="currentAddress")
	String currentAddress;

	@Column(name="permaInateAddress")
	String permaInateAddress;

	@Column(name="bloodgroup")
	String bloodgroup;

	@Column(name="emailId")
	String emailId;

	@Column(name="addharNumber")
	double addharNumber;

	@Column(name="bankAccoutNumber")
	double bankAccoutNumber;

	@Column(name="mobileNumber")
	double mobileNumber;

	public VendorEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VendorEntity(int id, String firstName, String lastName, String currentAddress, String permaInateAddress,
			String bloodgroup, String emailId, double addharNumber, double bankAccoutNumber, double mobileNumber) {
		super();
		this.Id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.currentAddress = currentAddress;
		this.permaInateAddress = permaInateAddress;
		this.bloodgroup = bloodgroup;
		this.emailId = emailId;
		this.addharNumber = addharNumber;
		this.bankAccoutNumber = bankAccoutNumber;
		this.mobileNumber = mobileNumber;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCurrentAddress() {
		return currentAddress;
	}

	public void setCurrentAddress(String currentAddress) {
		this.currentAddress = currentAddress;
	}

	public String getPermaInateAddress() {
		return permaInateAddress;
	}

	public void setPermaInateAddress(String permaInateAddress) {
		this.permaInateAddress = permaInateAddress;
	}

	public String getBloodgroup() {
		return bloodgroup;
	}

	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public double getAddharNumber() {
		return addharNumber;
	}

	public void setAddharNumber(double addharNumber) {
		this.addharNumber = addharNumber;
	}

	public double getBankAccoutNumber() {
		return bankAccoutNumber;
	}

	public void setBankAccoutNumber(double bankAccoutNumber) {
		this.bankAccoutNumber = bankAccoutNumber;
	}

	public double getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(double mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "VendorEntity [Id=" + Id + ", firstName=" + firstName + ", lastName=" + lastName + ", currentAddress="
				+ currentAddress + ", permaInateAddress=" + permaInateAddress + ", bloodgroup=" + bloodgroup
				+ ", emailId=" + emailId + ", addharNumber=" + addharNumber + ", bankAccoutNumber=" + bankAccoutNumber
				+ ", mobileNumber=" + mobileNumber + "]";
	}
	
	
	
	
}
