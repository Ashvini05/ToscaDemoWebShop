package com.website.ToscaDemoWebShop.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;



public class HomePage {
	private WebDriver driver;
	
	 	//private String registerLink="//div//a[text()='Register']";
	//private String bookLink=  "//div [@class='header-menu']/ul[@class='top-menu']/li/a[@href='/books']";
	//private String shoppingCartLink= "//a[@href='/cart']//span[@class='cart-label']";
	
	@FindBy( xpath = "//div//a[text()='Register']" )
	private WebElement registerLink;
	
	@FindBy( xpath = "//div [@class='header-menu']/ul[@class='top-menu']/li/a[@href='/books']" )
	private WebElement bookLink;
	
	@FindBy(xpath = "//div [@class='header-menu']/ul[@class='top-menu']/li/a[@href='/computers']")
	private WebElement computerLink;
		
	@FindBy( xpath = "//a[@href='/cart']//span[@class='cart-label']" )
	private WebElement shoppingCartLink;
	
	@FindBy (xpath = "//a[text()='Log in']")
	private WebElement logIn;
	
	public RegisterPage clickOnRegisterLink()
	{
		registerLink.click();
		return new RegisterPage(driver);
	}
	
	public BooksPage clickOnBookLink()
	{
		bookLink.click();
		return new BooksPage(driver);
	}

	public ShoppingCartPage clickOnShoppingCartLink()
	{
		shoppingCartLink.click();
		return new ShoppingCartPage(driver);

	}
	public LoginPage clickLogInLink()
	{
		logIn.click();
		return new LoginPage(driver);
	}
	public HomePage(WebDriver driver) {
		 this.driver = driver;
		PageFactory.initElements(driver, this);
		
	 }
	
}
