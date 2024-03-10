package com.website.ToscaDemoWebShop;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

import com.website.ToscaDemoWebShop.Base.TestBase;
import com.website.ToscaDemoWebShop.Base.TestData.LoginUserTestData;
import com.website.ToscaDemoWebShop.Pages.LoginPage;


public class LoginTest extends TestBase {
	LoginPage login;
	private LoginUserTestData testDataLU = new LoginUserTestData();
	private String loginErrorMessage ="Login was unsuccessful. Please correct the errors and try again.";

	@Test
	public void veryfyLoginFaillure()
	{
		login = home.clickLogInLink()
				.enterLoginDetails(testDataLU)
				.clickOnLogInButton();
		Assert.assertEquals(login.verifyLoginErrorMessage(), loginErrorMessage, "Error Messaged Changed or user is able to login successfully!!");
	}

}
