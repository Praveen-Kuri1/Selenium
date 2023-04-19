package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StudentRegisterPOF {
	public WebDriver driver;

	
	
	public StudentRegisterPOF(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	


	@FindBy(xpath = "//input[@id='firstName']")
	WebElement FN;
	
	public WebElement FirstName()
	{
		return FN;
	}
	
	@FindBy(xpath = "//input[@id='lastName']")
	WebElement LN;
	public WebElement LastName()
	{
		return LN;
	}
	
	@FindBy(xpath = "//input[@id='email']")
	WebElement email;
	public WebElement Email()
	{
		return email;
	}
	
	@FindBy(xpath = "//select[@id='country']")
	WebElement country;
	public WebElement Country()
	{
		return country;
	}
	
	@FindBy(xpath = "//option[@value='1'][1]")
	WebElement selectcountry;
	public WebElement SelectCountry()
	{
		return selectcountry;
	}
	@FindBy(xpath = "//select[@name='state']")
	WebElement state;
	public WebElement State()
	{
		return email;
	}
	@FindBy(xpath = "(//option[@value='2'])[2]")
	WebElement selectstate;
	public WebElement SelectState()
	{
		return selectstate;
	}
	
	
	
	@FindBy(xpath = "//input[@id='phoneNumber']")
	WebElement phone;
	public WebElement PhoneNumber()
	{
		return phone;
	}
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement submit;
	public WebElement Next()
	{
		return submit;
	}
	
	
	
	
	
	
	
}
