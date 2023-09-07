package com.website.ToscaDemoWebShop.Base.TestData;

import java.util.Random;

public class RegisterUserTestData {
	
	
	Random rand = new Random();
	int randvalue = rand.nextInt(99999);
	private String country = "India";
	private String firstName = "Ashvini";
	private String lastName = "More";
	private String emailID = "ashvini.more"+randvalue+"@gmail.com";
	private String password = "Password123";

	public String getCountry() {
		return country;
	}	
	
	public String getFirstName() {
		return firstName;
	}	
	
	public String getLastName() {
		return lastName;
	}
	public String getEmailID() {
		return emailID;
	}
	public String getPassword() {
		return password;
	}

	
	
	
			

}
