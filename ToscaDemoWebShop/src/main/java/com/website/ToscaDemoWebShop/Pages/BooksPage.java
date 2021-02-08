package com.website.ToscaDemoWebShop.Pages;

import java.util.Random;

import org.openqa.selenium.*;

import com.website.ToscaDemoWebShop.Base.TestBase;

public class BooksPage extends TestBase {
	private String book_ComputingAndInternet = "//h2[@class='product-title']//a[@href='/computing-and-internet']";
	private String book_Fiction = "//h2[@class='product-title']//a[@href='/fiction']";
	private String book_CopyOfComputingAndInternet = "//h2[@class='product-title']//a[@href='/copy-of-computing-and-internet']";
	private String book_FictionEx = "//h2[@class='product-title']//a[@href='/fiction-ex']";
	private String book_Health = "//h2[@class='product-title']//a[@href='/health']";
	private String book_Science = "//h2[@class='product-title']//a[@href='/science']";
	
	
	public void selectRandomBook()
	{
		Random rand = new Random();
		int randvalue = rand.nextInt(6);
		switch (1) {
		case 1:
			driver.findElement(By.xpath(book_ComputingAndInternet)).click();
			break;
		case 2:
			driver.findElement(By.xpath(book_Fiction)).click();
			break;
		case 3:
			driver.findElement(By.xpath(book_CopyOfComputingAndInternet)).click();
			break;
		case 4:
			driver.findElement(By.xpath(book_FictionEx)).click();
			break;
		case 5:
			driver.findElement(By.xpath(book_Health)).click();
			break;
		
		default:
			driver.findElement(By.xpath(book_Science)).click();
			break;
		}

	}
	

}
