package com.Welcome_Page;

import static org.testng.Assert.assertEquals;

import org.apache.logging.log4j.core.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Welcome_Page {
	public static void page_verification(WebDriver driver)
	{
	String Expected_Title="Zypp-Payout";
	String Actual_title=driver.getTitle();
	assertEquals(Expected_Title, Actual_title);
	
	}
	public static void Welcome_page_verification(WebDriver driver)
	{
	WebElement Page_text=driver.findElement(By.xpath("//p[@class='text-center font-bold text-3xl text-gray-500']"));
	
	System.out.println("Welcome Page Text:  "+Page_text.getText());
	String Expected_text="Welcome!";
	
	if (Expected_text.equals(Page_text))
	{
		System.out.println("Text On The Page Is Correct !!");
	}else
	{
		System.out.println("Text On The Page Is Mismatch !!");
	}
	
	}

}
