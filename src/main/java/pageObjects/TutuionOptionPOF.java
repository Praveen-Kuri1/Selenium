package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TutuionOptionPOF {
	public WebDriver driver;
	
	
	
	public TutuionOptionPOF(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//label[@for='agreeCheck']")
	WebElement iAgree;
	
	public WebElement IAgree()
	{
		return iAgree;
	}
	
	@FindBy(xpath = "(//button[@class='btn nextButton2'])[2]")
	WebElement savecontinue;
	public WebElement SaveContinue()
	{
		return savecontinue;
	}
	

	

}
