package com.website.ToscaDemoWebShop.Pages.Computers;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DesktopsPage {
	
private WebDriver driver;
	
   public DesktopsPage(WebDriver driver) {
		 this.driver = driver;
		PageFactory.initElements(driver, this);
	 }
	
   @FindBy (xpath = "//div[@class='picture']//a[@href='/simple-computer']")
   private WebElement desktops_SimpleComputerLink;
   
   /*
   @FindBy (xpath = "//span[@class='price actual-price']")
   private List<WebElement> multiple;
   */
   
   public void clickOnSimpleComputerLink()
   {
	   desktops_SimpleComputerLink.click();
   }


}
