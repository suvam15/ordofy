package androidLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomOrodofyLogin
{public WebDriver driver;

		@FindBy(id="userName")
		private WebElement usernametxtfld;
		
		@FindBy(xpath="/html/body/app-root/div/app-login/div[1]/div/div/div[2]/form/div/div[2]/input")
		private WebElement passwordtxtfld;
		
		@FindBy(xpath="/html/body/app-root/div/app-login/div[1]/div/div/div[2]/form/div/div[3]/input[1]")
		private WebElement loginButton;
		
	
		public PomOrodofyLogin(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		
		public void loginMethod()
		 { 
			usernametxtfld.sendKeys("akash1@gmail.com");
			passwordtxtfld.sendKeys("a12345678");
			loginButton.click();
			
		}
		

}
