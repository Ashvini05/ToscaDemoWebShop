package com.website.ToscaDemoWebShop.Pages;

import org.openqa.selenium.*;

import com.website.ToscaDemoWebShop.Base.TestBase;

public class LoginPage extends TestBase {
	private By checkAsGuest =  By.xpath("//input[@class='button-1 checkout-as-guest-button']");
	 
	public void clickOnCheckAsGuest()
	{
	    driver.findElement(checkAsGuest).click();
	}

}
