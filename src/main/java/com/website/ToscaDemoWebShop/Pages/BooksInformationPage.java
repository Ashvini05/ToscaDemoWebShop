package com.website.ToscaDemoWebShop.Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BooksInformationPage  {
	private WebDriver driver;
	
	@FindBy(xpath= "//*[contains(@id,'add-to-cart-button')]")
	private WebElement addToCartButton;
	
	
	public HomePage ClickOnAddToCartButton()
	{
		addToCartButton.click();
		return new HomePage(driver);
	}
	

	 public BooksInformationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	 }
}
