package com.website.ToscaDemoWebShop.Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.website.ToscaDemoWebShop.Pages.HomePage;
import configuration.Configs;



public class TestBase {
	
	public static WebDriver driver;
	public HomePage home;
	public Configs conf = new Configs();
	
	@BeforeTest
	public WebDriver initilization()
	{
		System.setProperty("webdriver.chrome.driver", conf.driverPath);
		driver = new ChromeDriver();
		driver.get(conf.uri);
		driver.manage().timeouts().implicitlyWait(conf.timeOut,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		home = new HomePage(driver);
		
		return driver;
	}
		
	@AfterTest
	public void closeBrowser()
	{
		driver.quit();
	}
	

} 
