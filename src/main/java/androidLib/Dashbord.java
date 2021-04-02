package androidLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashbord 
{
	public WebDriver driver;
	@FindBy(xpath="//span[.='NEW ORDERS']")
	private WebElement newOrderButton;
	
	@FindBy(id="mat-tab-label-0-2")
	private WebElement declineTab;
	
	//@FindBy(xpath=]/form/div/div[3]/input[1]")
	//private WebElement loginButton;
	

	 public Dashbord(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void orderMethod()
	 { 
		newOrderButton.click();
		declineTab.click();
		//loginButton.click();
}}
