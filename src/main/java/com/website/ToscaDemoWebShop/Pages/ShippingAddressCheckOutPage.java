package com.website.ToscaDemoWebShop.Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class ShippingAddressCheckOutPage{
	
	private WebDriver driver;
	
	 public ShippingAddressCheckOutPage(WebDriver driver) {
		 this.driver = driver;
		PageFactory.initElements(driver, this);
	 }

	
	@FindBy(xpath= "//div [@id='shipping-buttons-container']//input[@ class ='button-1 new-address-next-step-button' ]")
	private WebElement shippingAddress_continueButton;
	
    public ShippingMethodCheckOutPage clickOnShippingAddressContinueButton()
	{
		shippingAddress_continueButton.click();
		return new ShippingMethodCheckOutPage(driver);
		
	    

	}

}
