package com.website.ToscaDemoWebShop.Pages;

import org.openqa.selenium.*;

import com.website.ToscaDemoWebShop.Base.TestBase;

public class PaymentMethodCheckOutPage extends TestBase {
	private By paymentMethod_cashOnDelivery=By.xpath("//input[@id='paymentmethod_0']");
	private By paymentMethod_ContinueBtn=By.xpath("//input[@onclick='PaymentMethod.save()']");
	

	public void selectPaymentMethod()
	{
	    driver.findElement(paymentMethod_cashOnDelivery).click();
	    
	}
	public void clikOnContinueBtn()
	{
		driver.findElement(paymentMethod_ContinueBtn).click();
	}
	

}
