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
	
	
	 public void selectCountry(String country)
	    {
	    	Select sel = new Select(shippingCart_CountryId);
	    	sel.selectByVisibleText(country);
	    }
	 
	 /**
	  * To select a State from the Dropdown
	  * @author nagar
	  * @param state Provide the State Value to be selected
	  * @return void
	  */
	 public void selectState(String state)
	    {
	    	Select sel = new Select(shippingCart_StateProvinceId);
	    	sel.selectByVisibleText(state);
	    }
	 
	 /**
	  * To select a State from the dropdown using index
	  * @param stateIndex Provide the position of the value to be selected
	  * @return void
	  */
	 public void selectState(int stateIndex)
	    {
	    	Select sel = new Select(shippingCart_StateProvinceId);
	    	//select by Index
	    	sel.selectByIndex(stateIndex);
	    }
	  public void selectCheckbox()
	    {

	    	shippingCart_checkBox.click();
	    }
	  public void clickOnCheckOutButton()
	    {
	    	
	    	shippingCart_checkOutButton.click();
	}

	  //staleElement Exception - WebDriver Wait, refresh page, exception handling
	  //ElementClickIntercepted
}
