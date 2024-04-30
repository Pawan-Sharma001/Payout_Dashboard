package com.Execution_Layer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.Base.Browser_Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Execution_pipe {

	public static WebDriver driver;

	@BeforeTest
	public static void browser_Setup()
	{
		WebDriverManager.firefoxdriver().setup(); 
        driver = new FirefoxDriver();
		driver.navigate().to(com.Base.Config_file.Payout_DashBaord);
	}
	@Test(priority=1)
	public static void user_LogIn_Logout() throws InterruptedException
	{
		com.Page_Objects_Repo.Login_Page.login_With_Valid_User(driver);
	    Thread.sleep(10000);	
	    
	}
	
	@Test(priority=2)
	public static void import_Pilot_Daily_Payout() throws InterruptedException {
	com.Page_Objects_Repo.Pilot_Daily_Payout.Import_File(driver);
	com.Page_Objects_Repo.Pilot_Daily_Payout.verify_Data_in_Table_For_Daily_Payout(driver);
	
	}
	
	@Test(priority=3)
	public static void import_MultiClinet_Payout() throws InterruptedException 
	{
	Thread.sleep(10000);
	com.Page_Objects_Repo.Pilot_Multi_Client_Payout.open_Pilot_Multi_Client_Daily_Sheet_Page(driver);
    Thread.sleep(10000);
    
    com.Page_Objects_Repo.Pilot_Multi_Client_Payout.download_Template(driver);
    com.Page_Objects_Repo.Pilot_Multi_Client_Payout.click_On_Submit_Button_with_Out_File(driver);
	com.Page_Objects_Repo.Pilot_Multi_Client_Payout.submit_Multi_Client_Daily_Sheet(driver);
	}
}
