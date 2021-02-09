package com.website.ToscaDemoWebShop.Pages;

import org.openqa.selenium.*;

import com.website.ToscaDemoWebShop.Base.TestBase;

public class RegisterPage extends TestBase {
	private By genderField =  By.id("gender-female");
	private By firstNameField =  By.name("FirstName");
	private By lastNameField =  By.name("LastName");
	private By EmailField =  By.name("Email");
	private By PasswordField =  By.name("Password");
	private By confirmPasswordField =  By.name("ConfirmPassword");
	private By registerButton =  By.name("register-button");
	
	
	

	
	public void fillInformation()
	{

	    driver.findElement(genderField).click();
	    driver.findElement(firstNameField).sendKeys("test");
		driver.findElement(lastNameField).sendKeys("auto");
		driver.findElement(EmailField).sendKeys("sfaaashhv44raataw@gmail.com");
		driver.findElement( PasswordField).sendKeys("password123");
		driver.findElement( confirmPasswordField).sendKeys("password123");
		driver.findElement(registerButton).click();
	}
	
	public void logOut()
	{
		driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div.master-wrapper-main > div.center-2 > div > div.page-body > div.buttons > input")).click();
		driver.findElement(By.xpath("//div//a[text()='Log out']")).click();
		
	}

}
