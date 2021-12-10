package com.travel.phptravels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) 
	{
		 String email="user@phptravels.com";
		 String password="demouser";
		 String login="button[class='btn btn-default btn-lg btn-block effect ladda-button waves-effect']";
		String browsertype="chrome";
		String url="https://www.phptravels.net/";	
		WebDriver driver=com.travel.utilities.BookingUtility.Calldriver(browsertype);
		driver.get(url);
		driver.findElement(By.cssSelector("a[class='theme-btn theme-btn-small theme-btn-transparent ml-1 waves-effect']")).click();
        LoginModel lm=new LoginModel(driver);
        lm.setEmail(email);
        lm.setPassword(password);
        lm.clickbutton(login);
        lm.logout();
       // lm.logout("a[href='https://www.phptravels.net/account/logout'][class='dropdown-item waves-effect']");
        driver.close();  
        
}

}
