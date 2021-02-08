package com.website.ToscaDemoWebShop.Pages;

import org.openqa.selenium.By;

import com.website.ToscaDemoWebShop.Base.TestBase;

public class CheckOutPage extends TestBase {
	 
	public void clickOnOrderDetailsLink()
	{
		driver.findElement(By.xpath( " //a[contains(@href,'/orderdetails/')]")).click();
	}

}
