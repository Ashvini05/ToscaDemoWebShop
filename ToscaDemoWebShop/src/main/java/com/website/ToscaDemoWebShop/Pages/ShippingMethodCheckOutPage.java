package com.website.ToscaDemoWebShop.Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class ShippingMethodCheckOutPage  {
	private WebDriver driver;
	
	 public ShippingMethodCheckOutPage(WebDriver driver) {
		 this.driver = driver;
		PageFactory.initElements(driver, this);
	 }

	
	@FindBy(xpath= "//input[@id='shippingoption_0']")
	private WebElement shippingMethod_GroundRadioButton;
	
	@FindBy(xpath= "//input[@onclick='ShippingMethod.save()']")
	private WebElement shippingMethod_continueButton;
	
	
	public void selectGroundRadioButton()
	{
		shippingMethod_GroundRadioButton.click();

		
	}
	public void clickOnContinueButton()
	{
	    shippingMethod_continueButton.click();

	}

}
