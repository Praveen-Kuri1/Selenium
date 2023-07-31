package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProgramPOF {
	public WebDriver driver;
	
	
	
	public ProgramPOF(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//select[@name='startDate']")
	WebElement startdate;
	
	public WebElement StartDate()
	{
		return startdate;
	}
	
	@FindBy(xpath = "//option[@value='19542']")
	WebElement selectstartdate;
	public WebElement SelectStartDate()
	{
		return selectstartdate;
	}
	
	@FindBy(xpath = "(//button[@class='btn nextButton2'])[2]")
	WebElement next;
	public WebElement Next()
	{
		return next;
	}
	

}
