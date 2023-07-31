package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatePasswordPOF {
	public WebDriver driver;

	
	
	public CreatePasswordPOF(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	


	@FindBy(xpath = "//input[@id='password']")
	WebElement pwd;
	
	public WebElement Password()
	{
		return pwd;
	}
	
	@FindBy(xpath = "//input[@id='password2']")
	WebElement cnpwd;
	public WebElement ConfirmPassword()
	{
		return cnpwd;
	}
	
	
	@FindBy(xpath = "//button[.=' Create My Account ']")
	WebElement submit;
	public WebElement CreateAccount()
	{
		return submit;
	}
	

	
}
