package com.website.ToscaDemoWebShop.Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



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
	
	@FindBy(xpath = "Email")
	private WebElement EmailField;
	
	@FindBy(xpath = "Password" )
	private WebElement PasswordField;
	
	
    @FindBy(xpath = "ConfirmPassword" )
	private WebElement confirmPasswordField;
	
    @FindBy(xpath = "register-button" )
	private WebElement registerButton;
    
    
	
	public void selectGender(String gender)
	{
		genderField.click();
	}
	public void firstName(String fname)
	{

	    firstNameField.sendKeys(fname);
	  
	}   
	public void lastName(String lname)
	{
		lastNameField.sendKeys(lname);
	  
	}      
	    
	public void email(String eID)
	{
		EmailField.sendKeys(eID);
	  
	}      
	public void password(String validPassword)
	{
		PasswordField.sendKeys(validPassword);
	  
	}      
	public void confirm(String cPassword)
	{
		confirmPasswordField.sendKeys(cPassword);
	  
	}      
	public void clickOnRegisterButton()
	{
		registerButton.click();
	  
	}                 

		
	
	public void logOut()
	{
		driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div.master-wrapper-main > div.center-2 > div > div.page-body > div.buttons > input")).click();
		driver.findElement(By.xpath("//div//a[text()='Log out']")).click();
		
	}

}
