package com.utils;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Broken_Link {

	static WebDriver driver;

	public static String isBrokenUrl(URL url) throws IOException
	{
		String Response="";
		HttpURLConnection connection= (HttpURLConnection)url.openConnection();
		connection.connect();
		Response= connection.getResponseMessage();
		return Response;
	}
	public static void UrlFound(WebDriver driver)
	{
		
		List<WebElement>ElementList= driver.findElements(By.tagName("a"));
		System.out.println("Total Number of URL On Page :"+ElementList.size());
		for (WebElement Element:ElementList)
		{
		try {
			System.out.println("URL : "+Element.getAttribute("href")+"       Returned:===>     "+isBrokenUrl(new URL(Element.getAttribute("href"))));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		}
	}
	

}
