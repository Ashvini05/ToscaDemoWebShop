package com.website.ToscaDemoWebShop.Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.website.ToscaDemoWebShop.Base.TestData.BillingAddressTestData;
import com.website.ToscaDemoWebShop.Base.TestData.RegisterUserTestData;

public class BillingAddressCheckOutPage {
	private WebDriver driver;
	
	 public BillingAddressCheckOutPage(WebDriver driver) {
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
	
	
	private BillingAddressCheckOutPage enterFirstName(String fName)
    {
    	billingAddress_FirstName.sendKeys(fName);
    	return this;
    }
    
	private BillingAddressCheckOutPage enterLastName(String lName)
    {
    	billingAddress_LastName.sendKeys(lName);
    	return this;

    }
    
	private BillingAddressCheckOutPage enterEmail(String emailId)
    {
    	billingAddress_Email.sendKeys(emailId);
    	return this;

    }
    
	private BillingAddressCheckOutPage enterCompany( String cName)
    {
    	billingAddress_Company.sendKeys(cName);
    	return this;

    }
    
	private BillingAddressCheckOutPage selectCountry(String country)
    {
    	Select sel = new Select(billingAddress_CountryId);
    	sel.selectByVisibleText(country);
    	return this;

    }
    
	private BillingAddressCheckOutPage selectState(String state)
    {
    	Select sel = new Select(billingAddress_StateProvinceId);
    	sel.selectByVisibleText(state);
    	return this;

    }
    
	private BillingAddressCheckOutPage enterCity(String city)
    {
    	billingAddress_City.sendKeys(city);
    	return this;

    }
    
	private BillingAddressCheckOutPage enterAddress1(String address1)
    {
    	billingAddress_Address1.sendKeys(address1);
    	return this;

    }
    
	private BillingAddressCheckOutPage enterAddress2(String address2)
    {
    	billingAddress_Address2.sendKeys(address2);
    	return this;

    }
    
	private BillingAddressCheckOutPage enterZipPostalCode(String zipPostalCode)
    {
    	billingAddress_ZipPostalCode.sendKeys(zipPostalCode);
    	return this;

    }
    
	private BillingAddressCheckOutPage enterPhoneNumber(String phoneNumber)
    {
    	billingAddress_PhoneNumber.sendKeys(phoneNumber);
    	return this;

    }
    
	private BillingAddressCheckOutPage enterFaxNumber(String faxNumber)
    {
    	billingAddress_FaxNumber.sendKeys(faxNumber);
    	return this;

    }
	    
	 public ShippingAddressCheckOutPage clickOnBillingAddressContinueButton() {
	  
	   billingAddress_ContinueButton.click();
	   return new ShippingAddressCheckOutPage(driver);
	}
	 
	 public BillingAddressCheckOutPage enterBillingRegistrationDetails(BillingAddressTestData testDataBA)
	 {
		 enterFirstName(testDataBA.getFirstName());
		 enterLastName(testDataBA.getLastName());
		 enterEmail(testDataBA.getEmailID());
		 enterCompany(testDataBA.getCompany());
		 selectCountry(testDataBA.getCountry());
		 enterCity(testDataBA.getCity());
		 enterAddress1(testDataBA.getAddress1());
		 enterAddress2(testDataBA.getAddress2());
		 enterZipPostalCode(testDataBA.getZipCode());
		 enterPhoneNumber(testDataBA.getPhoneNumber());
		 enterFaxNumber(testDataBA.getFaxNumber());
		 return this;
	 }
	 
	

}


		
	


