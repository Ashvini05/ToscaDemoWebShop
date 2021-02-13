package com.website.ToscaDemoWebShop.Pages;

import java.util.Random;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class BooksPage{
	private WebDriver driver;
	
	@FindBy(xpath="//h2[@class='product-title']//a[@href='/computing-and-internet']")
	private WebElement book_ComputingAndInternet;
	
	@FindBy(xpath="//h2[@class='product-title']//a[@href='/fiction']")
	private WebElement book_Fiction;
	
	@FindBy(xpath="//h2[@class='product-title']//a[@href='/copy-of-computing-and-internet']")
	private WebElement book_CopyOfComputingAndInternet;
	
	@FindBy(xpath="//h2[@class='product-title']//a[@href='/fiction-ex']")
	private WebElement book_FictionEx;
	
	@FindBy(xpath="//h2[@class='product-title']//a[@href='/health']")
	private WebElement book_Health;
	
	@FindBy(xpath="//h2[@class='product-title']//a[@href='/science']")
	private WebElement book_Science;
	
	
	public void getAttributeScience(String attrName) {
		book_Science.getAttribute(attrName);
		book_Science.getText();
	}
	
	public void selectRandomBook()
	{
		Random rand = new Random();
		int randvalue = rand.nextInt(6);
		switch (1) {
		case 1:
			book_ComputingAndInternet.click();
			break;
		case 2:
			book_Fiction.click();
			break;
		case 3:
			book_CopyOfComputingAndInternet.click();
			break;
		case 4:
			book_FictionEx.click();
			break;
		case 5:
			book_Health.click();
			break;
		
		default:
			book_Science.click();
			break;
		}

	}
	
	public BooksPage(WebDriver driver) {
		 this.driver = driver;
		PageFactory.initElements(driver, this);
	 }
	

}
