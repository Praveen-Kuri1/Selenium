package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePOF {

	public WebDriver driver;
	
	public HomePagePOF(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	@FindBy(xpath = "//button[@id='signOutSection']")
	WebElement signout;
	
	public WebElement SignOUT()
	{
		return signout;
	}
}
