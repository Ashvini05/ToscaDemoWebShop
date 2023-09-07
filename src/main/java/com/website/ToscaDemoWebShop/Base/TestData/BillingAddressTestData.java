package com.website.ToscaDemoWebShop.Base.TestData;

import java.util.Random;

public class BillingAddressTestData {

	Random rand = new Random();
	int randvalue = rand.nextInt(99999);
	private String firstName = "Ashvini";
	private String lastName = "More";
	private String emailID = "ashvini.more"+randvalue+"@gmail.com";
	private String company = "Chorus";
	private String country = "New Zealand";
	private String city = "Wellington";
	private String address1 = "2 Fairburn Grove";
	private String address2 = "Johnsonville";
	private String zipCode = "6037";
	private String phoneNumber = "02041730866";
	private String faxNumber = "1234567";
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getEmailID() {
		return emailID;
	}
	public String getCompany() {
		return company;
	}
	public String getCountry() {
		return country;
	}
	public String getCity() {
		return city;
	}
	public String getAddress1() {
		return address1;
	}
	public String getAddress2() {
		return address2;
	}
	public String getZipCode() {
		return zipCode;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String getFaxNumber() {
		return faxNumber;
	}
	
	
}
