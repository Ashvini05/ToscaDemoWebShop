package com.website.ToscaDemoWebShop;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.website.ToscaDemoWebShop.Base.TestBase;
import com.website.ToscaDemoWebShop.Pages.HomePage;
import com.website.ToscaDemoWebShop.Pages.Computers.ComputerPage;
import com.website.ToscaDemoWebShop.Pages.Computers.DesktopsPage;

public class Computers {
	
	    private WebDriver driver;
		TestBase testBase = new TestBase();
		HomePage home;
		ComputerPage computer;
		DesktopsPage desktop;
				
	   @BeforeTest
	   public void setup() {
		driver = testBase.initilization();
		home = new HomePage(driver);
		computer = new ComputerPage(driver);
		desktop = new DesktopsPage(driver);
	   }
	   
	   @Test
	   public void orderComputer()
	   {
		   home.clickOnComputerLink();
		   computer.clickOnDesktopsImage();
		   desktop.selectSortBy("Name: Z to A");
	
	   }
	   
	   
	   @Test
	   public void checkComputerfilter()
	   {
		   home.clickOnComputerLink();
		   computer.clickOnDesktopsImage();
		   desktop.clickOnFilterByPriceUnder1000();
		   
	
	   }
	   

	   @Test
	   public void checkComputerfilterOver1200()
	   {
		   home.clickOnComputerLink();
		   computer.clickOnDesktopsImage();
		   desktop.clickOnFilterByPriceOver1200();
		  
	
	   }
	   @Test
	   public void checkComputerfilterBetween1000_1200()
	   {
		   home.clickOnComputerLink();
		   computer.clickOnDesktopsImage();
		   desktop.clickOnFilterByPriceBetween1000_1200();
		  
	   }
	   

}
