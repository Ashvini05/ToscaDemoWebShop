package com.website.ToscaDemoWebShop.Pages;

import org.openqa.selenium.*;

import com.website.ToscaDemoWebShop.Base.TestBase;

public class ShippingMethodCheckOutPage extends TestBase {
	private By shippingMethod_GroundRadioButton = By.xpath("//input[@id='shippingoption_0']");
	private By shippingMethod_continueButton = By.xpath("//input[@onclick='ShippingMethod.save()']");
	
	public void selectGroundRadioButton()
	{
		driver.findElement(shippingMethod_GroundRadioButton).click();

		
	}
	public void clickOnContinueButton()
	{
	    driver.findElement(shippingMethod_continueButton).click();

	}

}
