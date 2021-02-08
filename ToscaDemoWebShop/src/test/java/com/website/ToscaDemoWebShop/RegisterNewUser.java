package com.website.ToscaDemoWebShop;

import org.testng.annotations.Test;

import com.website.ToscaDemoWebShop.Base.TestBase;
import com.website.ToscaDemoWebShop.Pages.HomePage;
import com.website.ToscaDemoWebShop.Pages.RegisterPage;

public class RegisterNewUser extends TestBase{
	
	HomePage home = new HomePage();
	RegisterPage register = new RegisterPage();
	
	@Test
	public void registerUser() throws InterruptedException
	{
		home.clickOnRegisterLink();
		register.fillInformation();
		register.logOut();
		
		
		
	}
	

	
	

}
