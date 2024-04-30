package com.Base;

import org.checkerframework.checker.units.qual.Temperature;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser_Configuration {
	public static WebDriver driver ;
	
	public Browser_Configuration()
	{
		this.driver=driver;
	}
    /*public static WebDriver browser_Launch(WebDriver driver)
	{
		WebDriverManager.firefoxdriver().setup();
	    driver = new FirefoxDriver();
		driver.navigate().to(com.Base.Config_file.Payout_DashBaord);
		return driver;
	}*/
	@Parameters({"Browser"})
	@BeforeTest()
	public static WebDriver launch_Browser(String Browser)
    {
    	if(Browser.equals("Mozila"))
    	{

    		WebDriverManager.firefoxdriver().setup();
    		driver= new FirefoxDriver();
            System.out.println("Test Execution Start On Mozila Firefox !! ");
    		}else
    			if(Browser.equals("Chrome"))
    			{
    				WebDriverManager.chromedriver().setup();
    				driver=new ChromeDriver();
    				System.out.println("Test Execution Start On Google Chrome !! ");
    			}else
    			{
    				System.out.println("Browser Not Found !!");
    				throw new IllegalArgumentException("The Browser Type is Undefined");
    				
    			}
    	driver.navigate().to(com.Base.Config_file.Payout_DashBaord);
    	com.Welcome_Page.Welcome_Page.page_verification(driver);
    	com.Welcome_Page.Welcome_Page.Welcome_page_verification(driver);
		return driver;
    }
    }

