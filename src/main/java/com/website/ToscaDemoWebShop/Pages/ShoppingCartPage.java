package com.website.ToscaDemoWebShop.Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ShoppingCartPage {
	
 private WebDriver driver;
	
  public ShoppingCartPage(WebDriver driver) {
		 this.driver = driver;
		PageFactory.initElements(driver,  this);
	 }
	
	@FindBy(id = "CountryId")
	private WebElement shippingCart_CountryId;
	
	@FindBy(id = "StateProvinceId")
	private WebElement shippingCart_StateProvinceId;
	
	@FindBy(id = "termsofservice")
	private WebElement shippingCart_checkBox;
	
	@FindBy(id = "checkout")
	private WebElement shippingCart_checkOutButton;
	
	
	 public ShoppingCartPage selectCountry(String country)
	    {
	    	Select sel = new Select(shippingCart_CountryId);
	    	sel.selectByVisibleText(country);
	    	return this;
	    }
	
	 public ShoppingCartPage selectState(String state)
	    {
	    	Select sel = new Select(shippingCart_StateProvinceId);
	    	sel.selectByVisibleText(state);
	    	return this;

	    }
	  public ShoppingCartPage selectCheckbox()
	    {

	    	shippingCart_checkBox.click();
	    	return this;

	    	
	    }
	  public LoginPage clickOnCheckOutButton()
	    {
	    	
	    	shippingCart_checkOutButton.click();
	    	return new LoginPage(driver);
	}

}
