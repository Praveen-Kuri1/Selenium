package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomeBackPagePOF {
	public WebDriver driver;

	
	
	public WelcomeBackPagePOF(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	


	@FindBy(xpath = "//input[@id='address2']")
	WebElement address;
	
	public WebElement Address()
	{
		return address;
	}
	
	

	@FindBy(xpath = "(//button[@class='btn nextButton2'])[2]")
	WebElement save;
	public WebElement Save()
	{
		return save;
	}

	@FindBy(xpath = "//button[@id='signOutSection']")
	WebElement signout;
	public WebElement SignOut()
	{
		return signout;
	}
	
}
