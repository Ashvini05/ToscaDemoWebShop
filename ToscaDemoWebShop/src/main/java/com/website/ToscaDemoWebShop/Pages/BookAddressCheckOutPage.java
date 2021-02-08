package com.website.ToscaDemoWebShop.Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import com.website.ToscaDemoWebShop.Base.TestBase;

public class BookAddressCheckOutPage  extends TestBase {
	private String billingAddress_FirstName = "BillingNewAddress_FirstName";
	private String billingAddress_LastName = "BillingNewAddress_LastName";
	private String billingAddress_Email = "BillingNewAddress_Email";
	private String billingAddress_Company = "BillingNewAddress_Company";
	private String billingAddress_CountryId = "BillingNewAddress_CountryId";
    private String billingAddress_StateProvinceId = "BillingNewAddress_StateProvinceId";
    private String billingAddress_City = "BillingNewAddress_City";
    private String billingAddress_Address1 = "BillingNewAddress_Address1";
    private String billingAddress_Address2 = "BillingNewAddress_Address2";
    private String billingAddress_ZipPostalCode = "BillingNewAddress_ZipPostalCode";
    private String billingAddress_PhoneNumber= "//input[@id='BillingNewAddress_PhoneNumber']";
    private String billingAddress_FaxNumber= "BillingNewAddress_FaxNumber";
    private String billingAddress_ContinueButton = "//div[@id='billing-buttons-container']/input[@title='Continue']";

	public void billingAddress() {
		// TODO Auto-generated method stub
	    driver.findElement(By.id(billingAddress_FirstName)).sendKeys("xyz");
	    driver.findElement(By.id(billingAddress_LastName)).sendKeys("aaak");
	    driver.findElement(By.id(billingAddress_Email)).sendKeys("aggaa563@gmail.com");
	    driver.findElement(By.id(billingAddress_Company)).sendKeys("Tata motors");
	   
	    Select contrydropdown1 = new Select(driver.findElement(By.id(billingAddress_CountryId)));
	    contrydropdown1.selectByVisibleText("New Zealand");
	    Select statedropdown1 = new Select(driver.findElement(By.id(billingAddress_StateProvinceId)));
	    statedropdown1.selectByVisibleText("Other (Non US)");
	    
	    driver.findElement(By.id(billingAddress_City)).sendKeys("Solapur");
	    driver.findElement(By.id(billingAddress_Address1)).sendKeys("Xyz street Solapur India");
	    driver.findElement(By.id(billingAddress_Address2)).sendKeys("zzz street Solapur India");
	    driver.findElement(By.id(billingAddress_ZipPostalCode)).sendKeys("21991");
	    driver.findElement(By.xpath(billingAddress_PhoneNumber)).sendKeys("9970815987");
	    driver.findElement(By.id(billingAddress_FaxNumber)).sendKeys("8882222");
	} 
	    
	 public void clickOnContinueButton() {
	  
	    driver.findElement(By.xpath(billingAddress_ContinueButton)).click();
	}

}


		
	


