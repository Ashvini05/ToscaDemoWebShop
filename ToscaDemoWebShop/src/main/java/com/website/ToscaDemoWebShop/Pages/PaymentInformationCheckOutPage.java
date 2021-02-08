package com.website.ToscaDemoWebShop.Pages;

import org.openqa.selenium.*;

import com.website.ToscaDemoWebShop.Base.TestBase;

public class PaymentInformationCheckOutPage extends TestBase {
	private String paymentInformation_ContinueButton ="//input[@onclick='PaymentInfo.save()']";
	
	
	public void clickOnContinueButton()
	{
		driver.findElement(By.xpath(paymentInformation_ContinueButton)).click();
	}
	

}
