package com.website.ToscaDemoWebShop;

import org.testng.annotations.Test;

import com.website.ToscaDemoWebShop.Base.TestBase;
import com.website.ToscaDemoWebShop.Pages.BookAddressCheckOutPage;
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

public class Books extends TestBase 
{
	HomePage home = new HomePage();
	BooksPage books = new BooksPage();
	BooksInformationPage book1 = new BooksInformationPage();
	ShoppingCartPage shoppingcart = new ShoppingCartPage();
	LoginPage login = new LoginPage();
	BookAddressCheckOutPage bookAddresscheckout = new BookAddressCheckOutPage();
	ShippingAddressCheckOutPage ShippingCheckOut= new ShippingAddressCheckOutPage();
	ShippingMethodCheckOutPage  ShippingMethodCheckOut= new ShippingMethodCheckOutPage();
	PaymentMethodCheckOutPage PaymentMethodCheckOut = new PaymentMethodCheckOutPage();
	PaymentInformationCheckOutPage PaymentInformationCheckOut= new PaymentInformationCheckOutPage();
	ConfirmOrderPage Confirmorder = new ConfirmOrderPage();
	CheckOutPage checkOut = new CheckOutPage();
	
	@Test
	public void Orderbooks()
	{
		
		
		home.clickOnBookLink();
		books.selectRandomBook();
		book1.ClickOnAddToCartButton();
		home.clickOnShoppingCartLink();
		shoppingcart.shoppingCartFillInformation();
		login.clickOnCheckAsGuest();
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
