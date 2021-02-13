package com.website.ToscaDemoWebShop.Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;



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
    
    
	
	public void selectGender(String gender)
	{
		genderField.click();
	}
	public void enterFirstName(String fname)
	{

	    firstNameField.sendKeys(fname);
	  
	}   
	public void enterLastName(String lname)
	{
		lastNameField.sendKeys(lname);
	  
	}      
	    
	public void enterEmialID(String eID)
	{
		EmailField.sendKeys(eID);
	  
	}      
	public void enterPassword(String Password)
	{
		PasswordField.sendKeys(Password);
	  
	}      
	public void enterConfirmPassword(String confirmPassword)
	{
		confirmPasswordField.sendKeys(confirmPassword);
	  
	}      
	public void clickOnRegisterButton()
	{
		registerButton.click();
	  
	}                 

		
	
	public void logOut()
	{
		Assert.assertEquals(registrationResult.getText(), "Your registration completed", "Registration failed with error message");
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		driver.findElement(By.xpath("//div//a[text()='Log out']")).click();
		
	}

}
