package com.website.ToscaDemoWebShop.Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestBase {
	
	protected static WebDriver driver;
	
	@BeforeTest
	public void initilization()
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}
	

} 
