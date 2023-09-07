package com.website.ToscaDemoWebShop.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class CheckOutPage  {
	private WebDriver driver;

	@FindBy (xpath= " //a[contains(@href,'/orderdetails/')]")
	private WebElement orderDetailsLink;
	
	 
	public void clickOnOrderDetailsLink()
	{
		orderDetailsLink.click();	
	}
	
	 public CheckOutPage(WebDriver driver) {
		 this.driver = driver;
		PageFactory.initElements(driver, this);

}

}