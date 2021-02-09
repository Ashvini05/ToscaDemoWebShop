package com.website.ToscaDemoWebShop;

import org.openqa.selenium.WebDriver;
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
		home = new HomePage();
		books = new BooksPage();
		book1 = new BooksInformationPage();
		shoppingcart = new ShoppingCartPage();
		login = new LoginPage();
		bookAddresscheckout = new BookAddressCheckOutPages(driver);
		ShippingCheckOut= new ShippingAddressCheckOutPage();
		ShippingMethodCheckOut= new ShippingMethodCheckOutPage();
		PaymentMethodCheckOut = new PaymentMethodCheckOutPage();
		PaymentInformationCheckOut= new PaymentInformationCheckOutPage();
		Confirmorder = new ConfirmOrderPage();
		checkOut = new CheckOutPage();
	}
	
	
	@Test
	public void Orderbooks()
	{
		
		
		home.clickOnBookLink();
		books.selectRandomBook();
		book1.ClickOnAddToCartButton();
		home.clickOnShoppingCartLink();
		shoppingcart.shoppingCartFillInformation();
		login.clickOnCheckAsGuest();
		bookAddresscheckout.enterFirstName("Ashwini");
		bookAddresscheckout.billingAddress();
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
	

}
