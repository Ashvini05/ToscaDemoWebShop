package com.website.ToscaDemoWebShop.Pages;

import org.openqa.selenium.*;

import com.website.ToscaDemoWebShop.Base.TestBase;

public class ShippingAddressCheckOutPage extends TestBase{
 private By shippingAddress_continueButton = By.xpath("//input[@class='button-1 new-address-next-step-button' and @onclick='Shipping.save()'] ");

	public void clickOnContinueButton()
	{
		driver.findElement(shippingAddress_continueButton).click();
		
	    

	}

}
