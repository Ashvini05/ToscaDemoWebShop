package com.website.ToscaDemoWebShop.Pages;

import org.openqa.selenium.*;

import com.website.ToscaDemoWebShop.Base.TestBase;

public class PaymentMethodCheckOutPage extends TestBase {
	private String paymentMethod_cashOnDelivery="//input[@id='paymentmethod_0']";
	private String paymentMethod_ContinueBtn="//input[@onclick='PaymentMethod.save()']";
	

	public void selectPaymentMethod()
	{
	    driver.findElement(By.xpath(paymentMethod_cashOnDelivery)).click();
	    
	}
	public void clikOnContinueBtn()
	{
		driver.findElement(By.xpath(paymentMethod_ContinueBtn)).click();
	}
	

}
