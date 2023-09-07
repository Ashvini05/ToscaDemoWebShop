package com.website.ToscaDemoWebShop.Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.website.ToscaDemoWebShop.Base.TestData.RegisterUserTestData;

public class RegisterPage {
	
private WebDriver driver;


public RegisterPage(WebDriver driver) {
	 this.driver = driver;
	PageFactory.initElements(driver, this);
}

	
	@FindBy(id ="gender-female")
	private WebElement genderField;
	
	@FindBy(name = "FirstName" )
	private WebElement firstNameField;
	
	@FindBy(name = "LastName" )
	private WebElement lastNameField;
	
	@FindBy(name = "Email")
	private WebElement EmailField;
	
	@FindBy(name = "Password" )
	private WebElement PasswordField;
	
	@FindBy(name = "ConfirmPassword" )
	private WebElement confirmPasswordField;
	
    @FindBy(name = "register-button" )
	private WebElement registerButton;
    
    @FindBy(xpath="//div[@class='result']")
    private WebElement registrationResult;
    
    
	
	private RegisterPage selectGender()
	{
		genderField.click();
		return this;
	}
	private RegisterPage enterFirstName(String fname)
	{

	    firstNameField.sendKeys(fname);
	    return this;
	}   
	private RegisterPage enterLastName(String lname)
	{
		lastNameField.sendKeys(lname);
		return this;
	}      
	    
	private RegisterPage enterEmialID(String eID)
	{
		EmailField.sendKeys(eID);
		return this;
	}      
	private RegisterPage enterPassword(String Password)
	{
		PasswordField.sendKeys(Password);
		return this;
	}      
	private RegisterPage enterConfirmPassword(String confirmPassword)
	{
		confirmPasswordField.sendKeys(confirmPassword);
		return this;
	}      
	public RegisterPage clickOnRegisterButton()
	{
		registerButton.click();
		return this;
	}        
	
	public RegisterPage enterRegistrationRequiredDetails(RegisterUserTestData testDataRU)
	{
		selectGender();
		enterFirstName(testDataRU.getFirstName());
		enterLastName(testDataRU.getLastName());
		enterEmialID(testDataRU.getEmailID());
		enterPassword(testDataRU.getPassword());
		enterConfirmPassword(testDataRU.getPassword());
		return this;
	}  	
	
	
	public String verifySuccessMessage()
	{
		return registrationResult.getText();
		
	}

}
