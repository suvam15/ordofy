package ordofyFeaturesTestClasses;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import androidLib.PomOrodofyLogin;


public class ordofymultitest1 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	@Test
	public void enterordofy()
	{
		Reporter.log("Browser is opening");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.ordofy.com/login");	 

        PomOrodofyLogin login=new PomOrodofyLogin(driver);
		login.loginMethod(); 
		
		
	}

}
