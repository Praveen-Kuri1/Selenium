package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalPOF {
	public WebDriver driver;
	
	
	
	public PersonalPOF(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//label[.=' Male ']")
	WebElement gender;
	
	public WebElement GenderMale()
	{
		return gender;
	}
	
	@FindBy(xpath = "//input[@id='dateOfBirth']")
	WebElement dob;
	public WebElement DOB()
	{
		return dob;
	}
	
	@FindBy(xpath = "//input[@id='address']")
	WebElement address;
	public WebElement Address()
	{
		return address;
	}
	@FindBy(xpath = "//input[@id='city']")
	WebElement city;
	
	public WebElement City()
	{
		return city;
	}
	
	@FindBy(xpath = "//input[@id='zipCode']")
	WebElement zipcode;
	public WebElement Zipcode()
	{
		return zipcode;
	}
	
	@FindBy(xpath = "//label[.=' Non-Citizen ']")
	WebElement citzen;
	public WebElement Citzenship()
	{
		return citzen;
	}
	
	@FindBy(xpath = "//span[@class='dropdown-btn']")
	WebElement ethnicty;
	
	public WebElement Ethnicity()
	{
		return ethnicty;
	}
	
	@FindBy(xpath = "//div[.='Asian']")	
	WebElement selectethnicity;
	public WebElement SelectEthnicity()
	{
		return selectethnicity;
	}
	
	@FindBy(xpath = "(//label[.=' Yes '])[2]")
	WebElement latino;
	public WebElement Latino()
	{
		return latino;
	}
	@FindBy(xpath = "//select[@name='reference']")
	WebElement registration;
	public WebElement Registration()
	{
		return registration;
	}
	
	@FindBy(xpath = "//option[@value='708']")
	WebElement selectregistration;
	public WebElement SelectRegistration()
	{
		return selectregistration;
	}
	@FindBy(xpath = "(//button[@class='btn nextButton2'])[2]")
	WebElement savecontinue;
	public WebElement SaveContinue()
	{
		return savecontinue;
	}


}
