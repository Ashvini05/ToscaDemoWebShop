package com.website.ToscaDemoWebShop.Pages.Computers;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.google.common.collect.Ordering;

public class DesktopsPage {
	
private WebDriver driver;
	
   public DesktopsPage(WebDriver driver) {
		 this.driver = driver;
		PageFactory.initElements(driver, this);
	 }
   
   @FindBy (xpath = "//select[@id='products-orderby']")
   private WebElement desktops_SortBy;
   
   @FindBy (xpath = "//h2[@class='product-title']//a")
   private List <WebElement> desktop_List;
   
   @FindBy ( xpath = "//a[@href=\"http://demowebshop.tricentis.com/desktops?price=-1000\"]")
   private WebElement desktops_FilterByPriceunder1000;
   
   @FindBy ( xpath ="//a[@href=\"http://demowebshop.tricentis.com/desktops?price=1200-\"]")
   private WebElement desktops_FilterByPriceunder1200;
   
   @FindBy (xpath ="//a[@href=\"http://demowebshop.tricentis.com/desktops?price=1000-1200\"]")
   private WebElement desktops_FilterByPriceBetween1000_1200;
   
   @FindBy ( xpath = "//span[@class='price actual-price']")
   private List <WebElement> filterByPriceList;
   
   @FindBy ( xpath ="//span[@class='PriceRange']")
   private WebElement priceRange;
   
   @FindBy ( xpath ="//span[@class='PriceRange']")
   private List <WebElement> priceRangeBetween; 
   
   
   public void selectSortBy(String sortBy)
   {
   	Select sel = new Select(desktops_SortBy);
   	sel.selectByVisibleText(sortBy);
   	getSortByText();
   	
   }
   
   public void getSortByText()
   {
	 //  int size = desktop_List.size();
  
	   	 for(WebElement element:desktop_List) {
			    System.out.println( element.getText());
			}
   }
   public void clickOnFilterByPriceUnder1000()
   {
	   desktops_FilterByPriceunder1000.click();
	   getFilterByprice();
   }
   
   public void clickOnFilterByPriceOver1200()
   {
	   desktops_FilterByPriceunder1200.click();
	   getFilterByprice();
   }
   
   public void clickOnFilterByPriceBetween1000_1200()
   {
	   desktops_FilterByPriceBetween1000_1200.click();
	   getFilterByprice();
   }
   
   public void getFilterByprice()
   {
	   for(WebElement element:filterByPriceList) {
//		  to check price is under 1000
		   for(WebElement pricefilter:priceRangeBetween)
		   {
			   if((Float.parseFloat(pricefilter.getText())<=Float.parseFloat(element.getText())) && (Float.parseFloat(pricefilter.getText())>=Float.parseFloat(element.getText())))
			   {
				   
				   System.out.println("Price is between 1000 to 1200");
			   }
			   else if(Float.parseFloat(element.getText())<=Float.parseFloat(pricefilter.getText()))
			   {
			   
				   System.out.println("Price is under "+pricefilter.getText());
			   }
			   
//		   to check price is over 1000
		   
			   else if(Float.parseFloat(element.getText())>=Float.parseFloat(pricefilter.getText()))
			   {
				   
				   System.out.println("Price is over "+pricefilter.getText());
			   }
		  
		   }
		   
		   }	   

   	}
   
   
   
}
