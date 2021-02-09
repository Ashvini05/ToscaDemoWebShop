package com.website.ToscaDemoWebShop.Pages;

import org.openqa.selenium.*;

import com.website.ToscaDemoWebShop.Base.TestBase;

public class PaymentInformationCheckOutPage extends TestBase {
	private By paymentInformation_ContinueButton =By.xpath("//input[@onclick='PaymentInfo.save()']");
	
	
	public void clickOnContinueButton()
	{
		driver.findElement(paymentInformation_ContinueButton).click();
	}
	

}
