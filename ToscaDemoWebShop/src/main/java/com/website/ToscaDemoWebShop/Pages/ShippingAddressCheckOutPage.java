package com.website.ToscaDemoWebShop.Pages;

import org.openqa.selenium.*;

import com.website.ToscaDemoWebShop.Base.TestBase;

public class ShippingAddressCheckOutPage extends TestBase{
 private String shippingAddress_continueButton = "//input[@class='button-1 new-address-next-step-button' and @onclick='Shipping.save()'] ";

	public void clickOnContinueButton()
	{
		driver.findElement(By.xpath(shippingAddress_continueButton)).click();
		
	    

	}

}
