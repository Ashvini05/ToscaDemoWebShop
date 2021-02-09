package com.website.ToscaDemoWebShop.Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import com.website.ToscaDemoWebShop.Base.TestBase;

public class ShoppingCartPage extends TestBase {
	
	
	public void shoppingCartFillInformation()
	{
		 Select contrydropdown = new Select(driver.findElement(By.id("CountryId")));
	    contrydropdown.selectByVisibleText("New Zealand");
	    Select statedropdown = new Select(driver.findElement(By.name("StateProvinceId")));
	    statedropdown.selectByVisibleText("Other (Non US)");
	    driver.findElement(By.id("termsofservice")).click();
	    driver.findElement(By.id("checkout")).click();

	}

}
