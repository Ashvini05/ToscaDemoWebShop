
package com.website.ToscaDemoWebShop;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.website.ToscaDemoWebShop.Base.TestBase;
import com.website.ToscaDemoWebShop.Pages.HomePage;
import com.website.ToscaDemoWebShop.Pages.RegisterPage;

public class RegisterNewUser{
	private WebDriver driver;
	TestBase testBase = new TestBase();
	HomePage home;
	RegisterPage register;
			
   @BeforeTest
   public void setup() {
	driver = testBase.initilization();
	home = new HomePage(driver);
	register = new RegisterPage(driver);
   }	
	
	
	@Test
	public void registerUser()
	{
		home.clickOnRegisterLink();
		register.selectGender("Female");
		register.enterFirstName("Test");
		register.enterLastName("Auto");
		register.enterEmialID("sfaaashhv44ra5ataw@gmail.com");
		register.enterPassword("password123");
		register.enterConfirmPassword("password123");
		register.clickOnRegisterButton();
		register.logOut();
	
	}
	

	
	

}
