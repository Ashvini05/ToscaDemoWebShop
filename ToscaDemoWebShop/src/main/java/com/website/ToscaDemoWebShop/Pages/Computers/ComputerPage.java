package com.website.ToscaDemoWebShop.Pages.Computers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputerPage {
	private WebDriver driver;
	
	public ComputerPage(WebDriver driver) {
		 this.driver = driver;
		PageFactory.initElements(driver, this);
	 }
	
	@FindBy(xpath = "//img[@alt='Picture for category Desktops']")
	private WebElement desktop;
	
	public void clickOnDesktopsImage()
	{
		desktop.click();
	}

}
