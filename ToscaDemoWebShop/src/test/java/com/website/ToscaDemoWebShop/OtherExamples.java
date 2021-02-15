package com.website.ToscaDemoWebShop;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.website.ToscaDemoWebShop.Base.TestBase;




public class OtherExamples {
	WebDriver driver;
	TestBase testBase;
	
	@BeforeTest
	public void setup() {
		testBase = new TestBase();
		driver = testBase.initilization();
	}
	
	@Test
	public void handlingAlerts() throws InterruptedException {
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("1234");
		driver.findElement(By.name("submit")).click();
		//driver.switchTo().alert().accept();
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		Assert.assertEquals(alertText, "Do you want to delete this Customer?", "The Alert Text is not matching");
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
