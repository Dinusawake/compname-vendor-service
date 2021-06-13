package com.compname.compnamevendorservice.dto;

public class VendorDTO {

	
		
		private int Id;
		
		String firstName;

		
		String lastName;

		
		String currentAddress;


		String permaInateAddress;


		String bloodgroup;


		String emailId;


		double addharNumber;


		double bankAccoutNumber;


		double mobileNumber;


		public VendorDTO() {
			super();
			// TODO Auto-generated constructor stub
		}


		public VendorDTO(int id, String firstName, String lastName, String currentAddress, String permaInateAddress,
				String bloodgroup, String emailId, double addharNumber, double bankAccoutNumber, double mobileNumber) {
			super();
			Id = id;
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
			return "VendorDTO [Id=" + Id + ", firstName=" + firstName + ", lastName=" + lastName + ", currentAddress="
					+ currentAddress + ", permaInateAddress=" + permaInateAddress + ", bloodgroup=" + bloodgroup
					+ ", emailId=" + emailId + ", addharNumber=" + addharNumber + ", bankAccoutNumber="
					+ bankAccoutNumber + ", mobileNumber=" + mobileNumber + "]";
		}


	
}
