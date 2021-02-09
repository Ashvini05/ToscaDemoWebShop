package com.website.ToscaDemoWebShop.Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import configuration.Configs;

public class TestBase {
	
	public static WebDriver driver;
	
	public WebDriver initilization()
	{
		System.setProperty("webdriver.chrome.driver", Configs.driverPath);
		driver = new ChromeDriver();
		driver.get(Configs.uri);
		driver.manage().timeouts().implicitlyWait(Configs.timeOut,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}
	
	public void closeBrowser()
	{
		driver.close();
	}
	

} 
