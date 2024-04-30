package com.Page_Objects_Repo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Login_Page {
	public static WebDriver driver;//=com.Base.Browser_Configuration.launch_Browser("");
	public static WebElement Element=null;
	
	
	
	public static WebElement user_Name(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(20000);
	 WebElement U_Name= driver.findElement(By.xpath("//input[@id='emailInstant']"));
	return U_Name;
		
	}
	public static WebElement passWord(WebDriver driver)
	{
		WebElement pass= driver.findElement(By.xpath("//input[@id='passwordInstant']"));
	return pass;
	}
	public static WebElement login_Button(WebDriver driver)
	{
		WebElement login_Btn=driver.findElement(By.xpath("//button[@type='submit']"));
		return login_Btn;
	}
//===================Test Scenarios=====================================================	
	
	public static void login_With_Valid_User(WebDriver driver) throws InterruptedException
	{
	
	Thread.sleep(10000);	
	com.Page_Objects_Repo.Login_Page.user_Name(driver).sendKeys("pawan.sharma@zypp.app");
	com.Page_Objects_Repo.Login_Page.passWord(driver).sendKeys("b6|o$W0V");
	com.Page_Objects_Repo.Login_Page.login_Button(driver).click();
    }
	public static void login_With_In_Valid_User(WebDriver driver) throws InterruptedException
	{
	Thread.sleep(2000);	
	com.Page_Objects_Repo.Login_Page.user_Name(driver).sendKeys("n.sharma@zypp.app");
	com.Page_Objects_Repo.Login_Page.passWord(driver).sendKeys("|o$W0V");
	com.Page_Objects_Repo.Login_Page.login_Button(driver).click();
    }
//============================Test Scenarios Execution==============================
	/*@Test()
	public static void Login_With_Valid_User() throws InterruptedException
	{
		Thread.sleep(10000);
		if (driver!= null)
		{
		System.out.println("Login Test Execution Starts:   ");	
		com.Page_Objects_Repo.Login_Page.login_With_Valid_User(driver);	
		}else if(driver==null)
		{
	System.out.println("driver is null !!");	
	com.Page_Objects_Repo.Login_Page.login_With_Valid_User(driver);	
		}
	//com.Page_Objects_Repo.Login_Page.login_With_Valid_User(driver);	
	}*/
	
	}

