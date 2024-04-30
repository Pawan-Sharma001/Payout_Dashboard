package com.Common_Features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Common_Features {

	static WebDriver driver;
	public static WebElement download_Template(WebDriver driver)
	{
		WebElement Download_Template=driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary bg-blue-500 hover:bg-blue-700 text-white font css-de5hyy-MuiButtonBase-root-MuiButton-root']"));
		return Download_Template;
	}
	public static WebElement import_Button(WebDriver driver)
	{
		WebElement Import_btn=driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary css-1xnotki-MuiButtonBase-root-MuiButton-root']"));
		return Import_btn;
	}
	
	public static WebElement browse_Button(WebDriver driver)
	{
		WebElement Browse_btn=driver.findElement(By.xpath("//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1n4twyu-MuiInputBase-input-MuiOutlinedInput-input']"));
		return Browse_btn;
	}
	public static WebElement submit_Button(WebDriver driver)
	{
		WebElement Submit_btn=driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary bg-blue-500 hover:bg-blue-700 text-white font css-de5hyy-MuiButtonBase-root-MuiButton-root']"));
		return Submit_btn;
	}
}
