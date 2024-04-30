package com.Page_Objects_Repo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Common_Features.Common_Features;

public class Pilot_Daily_Payout{

	public static WebDriver driver;
	
	//===========================Test Case==========================================//
	
	public static void download_Template(WebDriver driver) throws InterruptedException
	{
	Thread.sleep(10000);	
	com.Common_Features.Common_Features.download_Template(driver).click();	
	com.utils.Page_Screen_Shot.capture_Screen_Shot(driver, "Daily Payout Template Downalod");
	}
	
	
	public static void click_at_Import_Button_Without_file(WebDriver driver) throws InterruptedException
	{
	Thread.sleep(10000);
	com.Common_Features.Common_Features.import_Button(driver).click();
	com.utils.Page_Screen_Shot.capture_Screen_Shot(driver, "Please Select a File First");
}
	
	public static void  Import_File(WebDriver driver) throws InterruptedException
	{
	Thread.sleep(10000);
	com.Common_Features.Common_Features.browse_Button(driver).sendKeys("C:\\Users\\GCV\\Downloads\\template-daily.xls");
	Thread.sleep(10000);
	com.Common_Features.Common_Features.import_Button(driver).click();
	Thread.sleep(10000);
	com.utils.Page_Screen_Shot.capture_Screen_Shot(driver, "Pilot Daily Payout Sheet is ");
	}
	
	public static void verify_Data_in_Table_For_Daily_Payout(WebDriver driver)
	{
	String SQLQuery="select * from mobycypayout.pilot_daily_payout where userId='6174737'";	
	com.utils.DataBase.Extract_Single_Data_From_Table(SQLQuery);	
	}
}
