package com.website.ToscaDemoWebShop.Pages;

import org.openqa.selenium.*;

import com.website.ToscaDemoWebShop.Base.TestBase;

public class BooksInformationPage extends TestBase {
	private String addToCartButton="//*[contains(@id,'add-to-cart-button')]";
	
	public void ClickOnAddToCartButton()
	{
	driver.findElement(By.xpath(addToCartButton)).click();
	}
}
