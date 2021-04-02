package androidLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomCustomorder 
{public WebDriver driver;
	@FindBy(xpath="//a[@href='/customOrder']")
	private WebElement CustomerOrderMOdule;
	
	@FindBy(id="input220")
	private WebElement NameTxtfield;
	
	@FindBy(id="input1")
	private WebElement cntacNOTxtfield;
	

	public PomCustomorder(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void customerMethod()
	 { 
		CustomerOrderMOdule.click();
		NameTxtfield.sendKeys("suvam");
		cntacNOTxtfield.sendKeys("7735002521");
		
	 }
		
}
