package com.website.ToscaDemoWebShop;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
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
		act.keyUp(Keys.CONTROL);
		act.build().perform();
		Thread.sleep(5000);
	}
	
	@Test
	public void WebTable() throws InterruptedException {
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		WebElement webTable = driver.findElement(By.className("dataTable"));
		int cols = webTable.findElements(By.xpath("//th")).size(); 
		System.out.println(cols);
		
		int rows = webTable.findElements(By.xpath("//tbody/tr")).size(); 
		System.out.println(rows);
		
		rows = webTable.findElements(By.xpath("//tr/td[1]")).size(); 
		System.out.println(rows);
		
		
		rows = driver.findElements(By.xpath("//table[@class='dataTable']//tr/td[1]")).size(); 
		System.out.println(rows);
		
		List<WebElement> rowsData = driver.findElements(By.xpath("//table[@class='dataTable']//tr/td"));
		//Print Table Values
		for(WebElement ele:rowsData) {
			System.out.println(ele.getText());
		}
		
		//Print a Value in the column 4 and row 10
		//Take Company Name (Ex: Kwality) and provide the respective market value
	}
	
	@Test
	public void implicityWait() {
		/**
		 * Thread.sleep(milliseconds)
		 * implicitWait - works on the driver session on every element
		 * Waits until provide time before throwing an exception if element not found
		 * explicitWait - can provide timeout, can provide a condition on a single element
		 * when element is found in 5 seconds and timeout is 20 seconds, it completes after 5 seconds
		 * It has a polling time and it polls for the condition every 10 milliseconds
		 */
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void explicitWait() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.className("")));
		wait.until(ExpectedConditions.attributeContains(By.xpath(""), "value", "Submitted"));
	}
	
	@Test
	public void fluentWait() {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofMillis(100))
				.ignoring(Exception.class);

	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
