package com.website.ToscaDemoWebShop.Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;



public class RegisterPage {
	
private WebDriver driver;
	
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
    
    
	
	public void fillInformation()
	{

	    genderField.click();
	    firstNameField.sendKeys("test");
		lastNameField.sendKeys("auto");
		EmailField.sendKeys("sfaaashhv44raataw@gmail.com");
	    PasswordField.sendKeys("password123");
		confirmPasswordField.sendKeys("password123");
		registerButton.click();
	}
	
	public void logOut()
	{
		driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div.master-wrapper-main > div.center-2 > div > div.page-body > div.buttons > input")).click();
		driver.findElement(By.xpath("//div//a[text()='Log out']")).click();
		
	}

}
