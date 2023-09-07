package com.website.ToscaDemoWebShop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.website.ToscaDemoWebShop.Base.TestBase;
import com.website.ToscaDemoWebShop.Base.TestData.BillingAddressTestData;
import com.website.ToscaDemoWebShop.Pages.BillingAddressCheckOutPage;
import com.website.ToscaDemoWebShop.Pages.ConfirmOrderPage;


public class BookOrder extends TestBase

{
	ConfirmOrderPage confirmOrder;
	BillingAddressTestData testDataBA = new BillingAddressTestData();
	private String orderSuccessMessage = "Your order has been successfully processed!";
	private WebDriver driver;
	
	@Test
	public void Orderbooks()
	{
		confirmOrder = home.clickOnBookLink()
				.selectComputingAndInternetBook()
				.ClickOnAddToCartButton()
				.clickOnShoppingCartLink()
				.selectCountry(testDataBA.getCountry())
				.selectCheckbox()
				.clickOnCheckOutButton()
				.clickOnCheckAsGuest()
				.enterBillingRegistrationDetails(testDataBA)
				.clickOnBillingAddressContinueButton()
				.clickOnShippingAddressContinueButton()
				.selectShippingMethodGroundRadioButton()
				.clickOnShippingMethodContinueButton()
				.selectPaymentMethod()
				.clikOnPaymentMethodContinueBtn()
				.clickOnPaymentInformationContinueButton();
		confirmOrder.clickOnConfirmButton();
		Assert.assertEquals(confirmOrder.verifyOrderSuccessMessage(), orderSuccessMessage, "Orefer failed with error message");
	}

}
