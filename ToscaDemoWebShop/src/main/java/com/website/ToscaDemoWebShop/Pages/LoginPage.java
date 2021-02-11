package com.website.ToscaDemoWebShop.Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.website.ToscaDemoWebShop.Base.TestBase;

public class LoginPage  {
	private WebDriver driver;
	
	@FindBy(xpath = "//input[@class='button-1 checkout-as-guest-button']" )
	private WebElement checkAsGuest;

	public void clickOnCheckAsGuest()
	{
	    checkAsGuest.click();
	   
	}
	public LoginPage(WebDriver driver) {
		 this.driver = driver;
		PageFactory.initElements(driver, this);
	 }


}
