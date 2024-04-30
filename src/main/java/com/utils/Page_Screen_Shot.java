package com.utils;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Page_Screen_Shot {
	static WebDriver driver;
	public static void capture_Screen_Shot(WebDriver driver,String ScreenShotName)
	{
	try {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source= ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("C:\\Pawan Sharma\\Project\\Zypp_PayOut_DashBaord\\ScreenShots\\"+ScreenShotName+".jpeg"));
		System.out.println("Screen Shot is captured !!");
	} catch (Exception e) {
	System.out.println("Exception while taking the ScreenShot"+e.getMessage());
		
	} 
	}	

}
