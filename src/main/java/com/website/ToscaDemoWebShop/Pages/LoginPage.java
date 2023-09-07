package com.website.ToscaDemoWebShop.Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.website.ToscaDemoWebShop.Base.TestBase;
import com.website.ToscaDemoWebShop.Base.TestData.LoginUserTestData;

public class LoginPage  {
	private WebDriver driver;
	
	@FindBy(id="Email")
	private WebElement emailField;
	
	@FindBy(id="Password")
	private WebElement passwordField;
	
	@FindBy(xpath="//input[@class='button-1 login-button']")
	private WebElement LoginButton;
	
    @FindBy(xpath = "//input[@class='button-1 checkout-as-guest-button']" )
	private WebElement checkAsGuest;
    
    @FindBy(xpath = "//div[@class='validation-summary-errors']//span")
    private WebElement loginErrorMessage;
	

	private LoginPage enterEmailId(String emailID)
	{

		emailField.sendKeys(emailID);
	    return this;
	}   
	
	private LoginPage enterPassword(String password)
	{

		passwordField.sendKeys(password);
	    return this;
	}   
	
	public String verifyLoginErrorMessage()
	{
		
		return loginErrorMessage.getText();
	}
	
	public LoginPage enterLoginDetails(LoginUserTestData testDataLU)
	{
		enterEmailId(testDataLU.getEmailID());
		enterPassword(testDataLU.getPassword());
		
		return this;
	}
	
	public LoginPage clickOnLogInButton()
	{

		LoginButton.click();
	    return this;
	}   
	public BillingAddressCheckOutPage clickOnCheckAsGuest()
	{
	    checkAsGuest.click();
	    return new BillingAddressCheckOutPage(driver);
	   
	}
	public LoginPage(WebDriver driver) {
		 this.driver = driver;
		PageFactory.initElements(driver, this);
	 }


}
