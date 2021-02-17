package com.website.ToscaDemoWebShop.Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BookAddressCheckOutPages {
	private WebDriver driver;
	
	 public BookAddressCheckOutPages(WebDriver driver) {
		 this.driver = driver;
		PageFactory.initElements(driver, this);
	 }

	
	@FindBy(id = "BillingNewAddress_FirstName")
	private WebElement billingAddress_FirstName;
	
	@FindBy (id="BillingNewAddress_LastName")
	private WebElement billingAddress_LastName;
	
	@FindBy(id = "BillingNewAddress_Email")
	private WebElement billingAddress_Email;
	
	@FindBy(id="BillingNewAddress_Company")
	private WebElement billingAddress_Company; 
	
	@FindBy(id = "BillingNewAddress_CountryId")
	private WebElement billingAddress_CountryId;
	
	@FindBy(id = "BillingNewAddress_StateProvinceId")
	private WebElement billingAddress_StateProvinceId;
	
	@FindBy(id = "BillingNewAddress_City")
	private WebElement billingAddress_City;
	
	@FindBy(id = "BillingNewAddress_Address1")
	private WebElement billingAddress_Address1;
	
	@FindBy(id = "BillingNewAddress_Address2")
	private WebElement billingAddress_Address2;
	
	@FindBy(id = "BillingNewAddress_ZipPostalCode")
	private WebElement billingAddress_ZipPostalCode;
	
	@FindBy(xpath= "//input[@id='BillingNewAddress_PhoneNumber']")
	private WebElement billingAddress_PhoneNumber;
	
	@FindBy(id = "BillingNewAddress_FaxNumber")
	private WebElement billingAddress_FaxNumber;
	
	@FindBy(xpath = "//div[@id='billing-buttons-container']/input[@title='Continue']")
	private WebElement billingAddress_ContinueButton;
	
	
    public void enterFirstName(String fName)
    {
    	billingAddress_FirstName.sendKeys(fName);
    }
    
    public void enterLastName(String lName)
    {
    	billingAddress_LastName.sendKeys(lName);
    }
    
    public void enterEmail(String emailId)
    {
    	billingAddress_Email.sendKeys(emailId);
    }
    
    public void enterCompany( String cName)
    {
    	billingAddress_Company.sendKeys(cName);
    }
    
    public void selectCountry(String country)
    {
    	Select sel = new Select(billingAddress_CountryId);
    	sel.selectByVisibleText(country);
    }
    
    public void selectState(String state)
    {
    	Select sel = new Select(billingAddress_StateProvinceId);
    	sel.selectByVisibleText(state);
    }
    
    public void enterCity(String city)
    {
    	billingAddress_City.sendKeys(city);
    }
    
    public void enterAddress1(String address1)
    {
    	billingAddress_Address1.sendKeys(address1);
    }
    
    public void enterAddress2(String address2)
    {
    	billingAddress_Address2.sendKeys(address2);
    }
    
    public void enterZipPostalCode(String zipPostalCode)
    {
    	billingAddress_ZipPostalCode.sendKeys(zipPostalCode);
    }
    
    public void enterPhoneNumber(String phoneNumber)
    {
    	billingAddress_PhoneNumber.sendKeys(phoneNumber);
    }
    
    public void enterFaxNumber(String faxNumber)
    {
    	billingAddress_FaxNumber.sendKeys(faxNumber);
    }
	    
	 public void clickOnContinueButton() {
	  
	   billingAddress_ContinueButton.click();
	}
	 
	

}


		
	


