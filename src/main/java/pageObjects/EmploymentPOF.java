package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmploymentPOF {
	public WebDriver driver;
	
	
	
	public EmploymentPOF(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//input[@id='flexCheckDefault']")
	WebElement idonot;
	
	public WebElement IDoNot()
	{
		return idonot;
	}
	
	@FindBy(xpath = "(//button[@class='btn nextButton2'])[2]")
	WebElement savecontinue;
	public WebElement SaveContinue()
	{
		return savecontinue;
	}
	

	

}
