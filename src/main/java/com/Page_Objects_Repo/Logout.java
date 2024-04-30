package com.Page_Objects_Repo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Logout {
	
	private static WebDriver driver;
	
	public static WebElement logout_Btn(WebDriver driver)
	{
	WebElement Logout_Button=driver.findElement(By.xpath("//img[@class='h-6' and @src='/assets/logout.png' and  @aria-label='Logout']"));
	Logout_Button.click();
	return Logout_Button;
	}

}
