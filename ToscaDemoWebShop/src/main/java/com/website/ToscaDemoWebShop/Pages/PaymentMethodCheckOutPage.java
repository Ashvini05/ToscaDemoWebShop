package com.website.ToscaDemoWebShop.Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentMethodCheckOutPage  {
	  private WebDriver driver;
		
	@FindBy(xpath = "//input[@id='paymentmethod_0']")
	private WebElement paymentMethod_cashOnDelivery;
		
	@FindBy(xpath = "//input[@onclick='PaymentMethod.save()']")
	private WebElement paymentMethod_ContinueBtn;
		

	public void selectPaymentMethod()
	{
	    paymentMethod_cashOnDelivery.click();
	    
	}
	public void clikOnContinueBtn()
	{
		paymentMethod_ContinueBtn.click();
	}
	public PaymentMethodCheckOutPage(WebDriver driver) {
		 this.driver = driver;
		PageFactory.initElements(driver, this);
	 }
	
	

}
