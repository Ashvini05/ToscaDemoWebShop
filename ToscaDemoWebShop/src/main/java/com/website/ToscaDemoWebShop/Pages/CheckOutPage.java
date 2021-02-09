package com.website.ToscaDemoWebShop.Pages;

import org.openqa.selenium.By;

import com.website.ToscaDemoWebShop.Base.TestBase;

public class CheckOutPage extends TestBase {
	private By orderDetailsLink= By.xpath(" //a[contains(@href,'/orderdetails/')]\"");
	 
	public void clickOnOrderDetailsLink()
	{
		driver.findElement(orderDetailsLink).click();	}

}
