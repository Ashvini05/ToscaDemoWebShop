package com.website.ToscaDemoWebShop.Pages;

import org.openqa.selenium.*;

import com.website.ToscaDemoWebShop.Base.TestBase;

public class ConfirmOrderPage  extends TestBase{
	private String ConfirmOrder_ConfirmButton = "//input[@value='Confirm']";
	
	
	public void clickOnConfirmButton()
	{
	    driver.findElement(By.xpath(ConfirmOrder_ConfirmButton)).click();

	}
	
	

}
