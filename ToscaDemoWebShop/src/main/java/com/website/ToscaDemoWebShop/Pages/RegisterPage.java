package com.website.ToscaDemoWebShop.Pages;

import org.openqa.selenium.*;

import com.website.ToscaDemoWebShop.Base.TestBase;

public class RegisterPage extends TestBase {
	
	public void fillInformation()
	{

	    driver.findElement(By.id("gender-female")).click();
	    driver.findElement(By.name("FirstName")).sendKeys("test");
		driver.findElement(By.name("LastName")).sendKeys("auto");
		driver.findElement(By.name("Email")).sendKeys("sfaaashhv44raataw@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("password123");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("password123");
		driver.findElement(By.name("register-button")).click();
	}
	
	public void logOut()
	{
		driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div.master-wrapper-main > div.center-2 > div > div.page-body > div.buttons > input")).click();
		driver.findElement(By.xpath("//div//a[text()='Log out']")).click();
		
	}

}
