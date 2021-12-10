package com.travel.phptravels;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchModule {

	public static void main(String[] args)
	{
		String browsertype="chrome";
		String url="https://www.phptravels.net/";		
     	WebDriver driver=com.travel.utilities.BookingUtility.Calldriver(browsertype);
    	//WebElement Dropdown=driver.findElement(By.cssSelector("span[class='select2-search select2-search--dropdown']"));
     //	WebElement Dropdown=driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
    	//WebElement ClickSearch=driver.findElement(By.id("submit"));
     	driver.get(url);
     	//Dropdown.click();
     	//Dropdown.sendKeys("Chennai,India");
     	//ClickSearch.click();
	
     	

	}

}
