package com.website.ToscaDemoWebShop;

import org.testng.annotations.Test;

import com.website.ToscaDemoWebShop.Base.TestBase;
import com.website.ToscaDemoWebShop.Pages.HomePage;
import com.website.ToscaDemoWebShop.Pages.RegisterPage;

@Test
public class RegisterNewUser extends TestBase{
	
	HomePage home = new HomePage(null);
	RegisterPage register = new RegisterPage(null);
	
	public void registerUser() throws InterruptedException
	{
		home.clickOnRegisterLink();
		register.genderRadioButton("Female");
		register.firstName("Test");
		register.lastName("Auto");
		register.email("sfaaashhv44raataw@gmail.com");
		register.password("password123");
		register.confirm("password123");
		register.clickOnRegisterButton();
		register.logOut();
		
		
		
	}
	

	
	

}
