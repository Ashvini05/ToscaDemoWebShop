package com.website.ToscaDemoWebShop.Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BooksInformationPage  {
	private WebDriver driver;
	
	@FindBy(xpath= "//*[contains(@id,'add-to-cart-button')]")
	private WebElement addToCartButton;
	
	
	public void ClickOnAddToCartButton()
	{
	addToCartButton.click();
	}
	

	 public BooksInformationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	 }
}


//