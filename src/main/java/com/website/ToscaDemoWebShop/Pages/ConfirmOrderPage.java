package com.website.ToscaDemoWebShop.Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.website.ToscaDemoWebShop.Base.TestBase;

public class ConfirmOrderPage {
	private WebDriver driver;

	@FindBy (xpath ="//input[@value='Confirm']" )
	private WebElement ConfirmOrder_ConfirmButton;
	
	@FindBy (xpath = "//div[@class='title']//strong")
	private WebElement ConfirmationMessage;
	
	public ConfirmOrderPage(WebDriver driver) {
		 this.driver = driver;
		PageFactory.initElements(driver, this);
	 }
	
	
	public CheckOutPage clickOnConfirmButton()
	{
	    ConfirmOrder_ConfirmButton.click();
	    return new CheckOutPage(driver);

	}
	
	public String verifyOrderSuccessMessage()
	{
		return ConfirmationMessage.getText();
	}
	
	

}
