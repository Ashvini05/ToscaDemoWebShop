
package com.website.ToscaDemoWebShop;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.website.ToscaDemoWebShop.Base.TestData.RegisterUserTestData;
import com.website.ToscaDemoWebShop.Base.TestBase;
import com.website.ToscaDemoWebShop.Pages.HomePage;
import com.website.ToscaDemoWebShop.Pages.RegisterPage;

public class RegisterNewUserTest extends TestBase{
	private WebDriver driver;
	RegisterPage register;
	private RegisterUserTestData testBaseRU = new RegisterUserTestData();
	private String successMessage = "Your registration completed";
  
	@Test
	public void verifyUserRegistration()
	{		
		register = home.clickOnRegisterLink()
		.enterRegistrationRequiredDetails(testBaseRU)
		.clickOnRegisterButton();		
		Assert.assertEquals(register.verifySuccessMessage(), successMessage, "Registration failed with error message");

	}

}
