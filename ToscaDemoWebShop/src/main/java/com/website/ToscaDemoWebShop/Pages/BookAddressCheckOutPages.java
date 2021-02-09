package com.website.ToscaDemoWebShop.Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.website.ToscaDemoWebShop.Base.TestBase;

public class BookAddressCheckOutPages {
	private WebDriver driver;
	
	@FindBy(id = "BillingNewAddress_FirstName")
	private WebElement billingAddress_FirstName;
	
	@FindBy (id="BillingNewAddress_LastName")
	private WebElement billingAddress_LastName;
	
	@FindBy(id = "BillingNewAddress_Email")
	private WebElement billingAddress_Email;
	@FindBy(id = "BillingNewAddress_CountryId")
	private WebElement billingAddress_CountryId;
	
	private By billingAddress_Company = By.id("BillingNewAddress_Company");

    private By billingAddress_StateProvinceId = By.id("BillingNewAddress_StateProvinceId");
    private By billingAddress_City = By.id("BillingNewAddress_City");
    private By billingAddress_Address1 = By.id("BillingNewAddress_Address1");
    private By billingAddress_Address2 = By.id("BillingNewAddress_Address2");
    private By billingAddress_ZipPostalCode = By.id("BillingNewAddress_ZipPostalCode");
    private By billingAddress_PhoneNumber= By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    private By billingAddress_FaxNumber= By.id("BillingNewAddress_FaxNumber");
    private By billingAddress_ContinueButton =By.xpath("//div[@id='billing-buttons-container']/input[@title='Continue']");
    
    public void enterFirstName(String fName) {
    	billingAddress_FirstName.sendKeys(fName);
    }
	public void billingAddress() {
		// TODO Auto-generated method stub
		billingAddress_FirstName.sendKeys("xyz");
		billingAddress_LastName.sendKeys("aaak");
		billingAddress_Email.sendKeys("aggaa563@gmail.com");
		
	    driver.findElement(billingAddress_Company).sendKeys("Tata motors");
	   
	    Select contrydropdown1 = new Select(billingAddress_CountryId);
	    contrydropdown1.selectByVisibleText("New Zealand");
	    Select statedropdown1 = new Select(driver.findElement(billingAddress_StateProvinceId));
	    statedropdown1.selectByVisibleText("Other (Non US)");
	    
	    driver.findElement(billingAddress_City).sendKeys("Solapur");
	    driver.findElement(billingAddress_Address1).sendKeys("Xyz street Solapur India");
	    driver.findElement(billingAddress_Address2).sendKeys("zzz street Solapur India");
	    driver.findElement(billingAddress_ZipPostalCode).sendKeys("21991");
	    driver.findElement(billingAddress_PhoneNumber).sendKeys("9970815987");
	    driver.findElement(billingAddress_FaxNumber).sendKeys("8882222");
	} 
	    
	 public void clickOnContinueButton() {
	  
	    driver.findElement(billingAddress_ContinueButton).click();
	}
	 
	 public BookAddressCheckOutPages(WebDriver driver) {
		 this.driver = driver;
		PageFactory.initElements(driver, this);
	 }

}


		
	


