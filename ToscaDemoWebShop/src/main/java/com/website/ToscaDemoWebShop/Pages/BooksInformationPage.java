package com.website.ToscaDemoWebShop.Pages;

import org.openqa.selenium.*;

import com.website.ToscaDemoWebShop.Base.TestBase;

public class BooksInformationPage extends TestBase {
	private By addToCartButton=By.xpath("//*[contains(@id,'add-to-cart-button')]");
	
	public void ClickOnAddToCartButton()
	{
	driver.findElement(addToCartButton).click();
	}
}
