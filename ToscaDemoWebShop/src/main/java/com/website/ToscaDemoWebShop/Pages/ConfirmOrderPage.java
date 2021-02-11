package com.website.ToscaDemoWebShop.Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.website.ToscaDemoWebShop.Base.TestBase;

public class ConfirmOrderPage {
	private WebDriver driver;

	@FindBy (xpath ="//input[@value='Confirm']" )
	private WebElement ConfirmOrder_ConfirmButton;
	
	public ConfirmOrderPage(WebDriver driver) {
		 this.driver = driver;
		PageFactory.initElements(driver, this);
	 }
	
	
	public void clickOnConfirmButton()
	{
	    ConfirmOrder_ConfirmButton.click();

	}
	
	

}
