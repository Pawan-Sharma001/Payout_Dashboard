package com.Page_Objects_Repo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Pilot_Multi_Client_Payout {
	private static WebDriver driver;
	
	public static WebElement open_Pilot_Multi_Client_Daily_Sheet_Page(WebDriver driver)
	{
		WebElement Pilot_Multi_Client_Daily_Sheet=driver.findElement(By.xpath("//li[@class='flex items-center justify-center gap-2 text-[#ffffff] rounded-[4px] px-1 py-3 ml-2 mr-2 hover:bg-[#63dd99] hover:text-[#ffffff]  cursor-pointer bg-[#00CD5B] false hover:bg-[#0079FF] hover:text-white']"));
		Pilot_Multi_Client_Daily_Sheet.click();
		return Pilot_Multi_Client_Daily_Sheet;
		
	}
	
//=======================Test Case==========================================	
	public static void download_Template(WebDriver driver)
	{
		com.Common_Features.Common_Features.download_Template(driver).click();	
		com.utils.Page_Screen_Shot.capture_Screen_Shot(driver, "Daily Payout Template Downalod");
	}
	public static void click_On_Submit_Button_with_Out_File(WebDriver driver)
	{
	com.Common_Features.Common_Features.submit_Button(driver).click();
	com.utils.Page_Screen_Shot.capture_Screen_Shot(driver, "Submit With Out File");
	}
	public static void submit_Multi_Client_Daily_Sheet(WebDriver driver)
	{
    com.Common_Features.Common_Features.browse_Button(driver).sendKeys("C:\\Users\\GCV\\Downloads\\template-multiclient.xls");
    com.utils.Page_Screen_Shot.capture_Screen_Shot(driver, "File Browsed Sucessfully !!");
    com.Common_Features.Common_Features.submit_Button(driver).click();
	com.utils.Page_Screen_Shot.capture_Screen_Shot(driver, "File Uploaded Successfully !!");
	}
}
