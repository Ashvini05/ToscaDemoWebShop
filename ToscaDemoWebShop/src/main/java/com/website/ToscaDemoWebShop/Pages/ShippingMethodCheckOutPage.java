package com.website.ToscaDemoWebShop.Pages;

import org.openqa.selenium.*;

import com.website.ToscaDemoWebShop.Base.TestBase;

public class ShippingMethodCheckOutPage extends TestBase {
	private String shippingMethod_GroundRadioButton = "//input[@id='shippingoption_0']";
	private String shippingMethod_continueButton = "//input[@onclick='ShippingMethod.save()']";
	
	public void selectGroundRadioButton()
	{
		driver.findElement(By.xpath(shippingMethod_GroundRadioButton)).click();

		
	}
	public void clickOnContinueButton()
	{
	    driver.findElement(By.xpath(shippingMethod_continueButton)).click();

	}

}
