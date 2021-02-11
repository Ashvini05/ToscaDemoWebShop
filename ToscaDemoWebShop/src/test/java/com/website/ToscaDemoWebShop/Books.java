package com.website.ToscaDemoWebShop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.website.ToscaDemoWebShop.Base.TestBase;
import com.website.ToscaDemoWebShop.Pages.BookAddressCheckOutPages;
import com.website.ToscaDemoWebShop.Pages.BooksInformationPage;
import com.website.ToscaDemoWebShop.Pages.BooksPage;
import com.website.ToscaDemoWebShop.Pages.CheckOutPage;
import com.website.ToscaDemoWebShop.Pages.ConfirmOrderPage;
import com.website.ToscaDemoWebShop.Pages.HomePage;
import com.website.ToscaDemoWebShop.Pages.LoginPage;
import com.website.ToscaDemoWebShop.Pages.PaymentInformationCheckOutPage;
import com.website.ToscaDemoWebShop.Pages.PaymentMethodCheckOutPage;
import com.website.ToscaDemoWebShop.Pages.ShippingAddressCheckOutPage;
import com.website.ToscaDemoWebShop.Pages.ShippingMethodCheckOutPage;
import com.website.ToscaDemoWebShop.Pages.ShoppingCartPage;

@Test
public class Books 
{
	HomePage home;
	BooksPage books;
	BooksInformationPage book1;
	ShoppingCartPage shoppingcart;
	LoginPage login;
	BookAddressCheckOutPages bookAddresscheckout;
	ShippingAddressCheckOutPage ShippingCheckOut;
	ShippingMethodCheckOutPage  ShippingMethodCheckOut;
	PaymentMethodCheckOutPage PaymentMethodCheckOut;
	PaymentInformationCheckOutPage PaymentInformationCheckOut;
	ConfirmOrderPage Confirmorder;
	CheckOutPage checkOut;
	TestBase testBase = new TestBase();
	private WebDriver driver;
	
	@BeforeTest
	public void setup() {
		driver = testBase.initilization();
		home = new HomePage(driver);
		books = new BooksPage(driver);
		book1 = new BooksInformationPage(driver);
		shoppingcart = new ShoppingCartPage(driver);
		login = new LoginPage(driver);
		bookAddresscheckout = new BookAddressCheckOutPages(driver);
		ShippingCheckOut= new ShippingAddressCheckOutPage(driver);
		ShippingMethodCheckOut= new ShippingMethodCheckOutPage(driver);
		PaymentMethodCheckOut = new PaymentMethodCheckOutPage(driver);
		PaymentInformationCheckOut= new PaymentInformationCheckOutPage(driver);
		Confirmorder = new ConfirmOrderPage(driver);
		checkOut = new CheckOutPage(driver);
	}
	
	@Test
	public void Orderbooks()
	{
		home.clickOnBookLink();
		books.selectRandomBook();
		book1.ClickOnAddToCartButton();
		home.clickOnShoppingCartLink();
		shoppingcart.selectCountry("India");
		shoppingcart.selectCheckbox();
		shoppingcart.clickOnCheckOutButton();
		login.clickOnCheckAsGuest();
		bookAddresscheckout.enterFirstName("ssssi");
		bookAddresscheckout.enterLastName("yyaa");
		bookAddresscheckout.enterEmail("aggaa563@gmail.com");
		bookAddresscheckout.enterCompany("Tata motors");
		bookAddresscheckout.selectCountry("India");
	    bookAddresscheckout.enterCity("Solapur");
		bookAddresscheckout.enterAddress1("Xyz street Solapur India");
		bookAddresscheckout.enterAddress2("zzz street Solapur India");
		bookAddresscheckout.enterZipPostalCode("21991");
		bookAddresscheckout.enterPhoneNumber("9970815987");
		bookAddresscheckout.enterFaxNumber("8882222");
	    bookAddresscheckout.clickOnContinueButton();
		ShippingCheckOut.clickOnContinueButton();
		ShippingMethodCheckOut.selectGroundRadioButton();
		ShippingMethodCheckOut.clickOnContinueButton();
		PaymentMethodCheckOut.selectPaymentMethod();
		PaymentMethodCheckOut.clikOnContinueBtn();
		PaymentInformationCheckOut.clickOnContinueButton();
		Confirmorder.clickOnConfirmButton();
		checkOut.clickOnOrderDetailsLink();
	}
	@AfterTest
	public void terminate()
	{
		driver.close();
	}
	

}
