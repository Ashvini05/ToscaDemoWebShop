package com.website.ToscaDemoWebShop.Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentInformationCheckOutPage {
	
    private WebDriver driver;
	
	@FindBy(xpath = "//input[@onclick='PaymentInfo.save()']")
	private WebElement paymentInformation_ContinueButton;
	
	public ConfirmOrderPage clickOnPaymentInformationContinueButton()
	{
		paymentInformation_ContinueButton.click();
		 return new ConfirmOrderPage(driver);
	}
	
	public PaymentInformationCheckOutPage(WebDriver driver) {
		 this.driver = driver;
		PageFactory.initElements(driver, this);
	 }
	

}
