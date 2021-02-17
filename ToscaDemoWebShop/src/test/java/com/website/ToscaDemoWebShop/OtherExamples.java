package com.website.ToscaDemoWebShop;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
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
	
	@Test
	public void ActionsClassEx() throws InterruptedException {
		driver.get("https://demoqa.com/text-box");
		Actions act = new Actions(driver);
		driver.findElement(By.id("userName")).sendKeys("Pratap");
		act.sendKeys(Keys.TAB);
		act.sendKeys("pratap.1863@gmail.com");
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		act.sendKeys(Keys.TAB);
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.build().perform();
		Thread.sleep(5000);
		
	}
	
	@Test
	public void WebTable() throws InterruptedException {
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		WebElement webTable = driver.findElement(By.className("dataTable"));
		int cols = webTable.findElements(By.xpath("//tr/th")).size(); 
		System.out.println(cols);
		
		int rows = webTable.findElements(By.xpath("//tbody/tr")).size(); 
		System.out.println(rows);
		
		rows = webTable.findElements(By.xpath("//tr/td[1]")).size(); 
		System.out.println(rows);
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
