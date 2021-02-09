package com.website.ToscaDemoWebShop.Pages;

import java.util.Random;

import org.openqa.selenium.*;

import com.website.ToscaDemoWebShop.Base.TestBase;

public class BooksPage extends TestBase {
	private By book_ComputingAndInternet =By.xpath("//h2[@class='product-title']//a[@href='/computing-and-internet']");
	private By book_Fiction = By.xpath("//h2[@class='product-title']//a[@href='/fiction']");
	private By book_CopyOfComputingAndInternet =By.xpath("//h2[@class='product-title']//a[@href='/copy-of-computing-and-internet']");
	private By book_FictionEx = By.xpath("//h2[@class='product-title']//a[@href='/fiction-ex']");
	private By book_Health = By.xpath("//h2[@class='product-title']//a[@href='/health']");
	private By book_Science =By.xpath("//h2[@class='product-title']//a[@href='/science']");
	
	
	public void selectRandomBook()
	{
		Random rand = new Random();
		int randvalue = rand.nextInt(6);
		switch (1) {
		case 1:
			driver.findElement(book_ComputingAndInternet).click();
			break;
		case 2:
			driver.findElement(book_Fiction).click();
			break;
		case 3:
			driver.findElement(book_CopyOfComputingAndInternet).click();
			break;
		case 4:
			driver.findElement(book_FictionEx).click();
			break;
		case 5:
			driver.findElement(book_Health).click();
			break;
		
		default:
			driver.findElement(book_Science).click();
			break;
		}

	}
	

}
