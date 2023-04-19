package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOF {
	public WebDriver driver;
	
	
	
	public LoginPOF(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//input[@id='userName']")
	WebElement UN;
	
	public WebElement UserName()
	{
		return UN;
	}
	
	@FindBy(xpath = "//input[@id='password']")
	WebElement PWD;
	public WebElement Password()
	{
		return PWD;
	}
	
	@FindBy(xpath = "//button[.='Login']")
	WebElement Submit;
	public WebElement SignIN()
	{
		return Submit;
	}
	
}
