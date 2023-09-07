package com.website.ToscaDemoWebShop.Pages;

import java.util.Random;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;



public class BooksPage{
	private WebDriver driver;
	
	@FindBy(xpath="//h2[@class='product-title']//a[@href='/computing-and-internet']")
	private WebElement book_ComputingAndInternet;
	
	@FindBy(xpath = "//div[@class='page-title']//h1")
	private WebElement BooksPageText;
	

	public BooksInformationPage selectComputingAndInternetBook()
	{
		book_ComputingAndInternet.click();
		return new BooksInformationPage(driver);
		
	}
		
	public BooksPage(WebDriver driver) {
		 this.driver = driver;
		PageFactory.initElements(driver, this);
		Assert.assertEquals(BooksPageText.getText(), "Books" ,"Error navigating to book page");
	 }
	

}
