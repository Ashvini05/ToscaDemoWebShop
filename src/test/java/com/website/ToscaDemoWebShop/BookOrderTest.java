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


public class BookOrderTest extends TestBase

{
	private ConfirmOrderPage confirmOrder;
	private BillingAddressTestData testDataBA = new BillingAddressTestData();
	private String orderSuccessMessage = "Your order has been successfully processed!";
		
	@Test
	public void verifyBookOrderSuccess()
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
				.clickOnPaymentInformationContinueButton()
				.clickOnConfirmButton();
		Assert.assertEquals(confirmOrder.verifyOrderSuccessMessage(), orderSuccessMessage, "Orefer failed with error message");
	}

}
