package com.website.ToscaDemoWebShop.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.website.ToscaDemoWebShop.Base.TestBase;

public class HomePage extends TestBase{
	//private String registerLink="//div//a[text()='Register']";
	//private String bookLink=  "//div [@class='header-menu']/ul[@class='top-menu']/li/a[@href='/books']";
	//private String shoppingCartLink= "//a[@href='/cart']//span[@class='cart-label']";
	
	private By registerLink = By.xpath("//div//a[text()='Register']");
	private By bookLink =  By.xpath("//div [@class='header-menu']/ul[@class='top-menu']/li/a[@href='/books']");
	private By shoppingCartLink= By.xpath("//a[@href='/cart']//span[@class='cart-label']");
	
	public void clickOnRegisterLink()
	{
		driver.findElement(registerLink).click();
		
		
	}
	
	public void clickOnBookLink()
	{
		driver.findElement(bookLink).click();

	}
	public void clickOnShoppingCartLink()
	{
		driver.findElement(shoppingCartLink).click();

	}

}
