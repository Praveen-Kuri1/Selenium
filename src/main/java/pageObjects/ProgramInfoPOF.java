package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProgramInfoPOF {
	public WebDriver driver;

	
	
	public ProgramInfoPOF(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	


	
	


	@FindBy(xpath = "//select[@name='highestCompletedEdu']")
	WebElement HCE;
	
	public WebElement HighestCompletedEducation()
	{
		return HCE;
	}
	
	@FindBy(xpath = "//option[@value='18']")
	WebElement HCEValue;
	public WebElement SelectHighestCompletedEducation()
	{
		return HCEValue;
	}
	
	@FindBy(xpath = "//select[@name='degreeOfInterest']")
	WebElement degree;
	public WebElement Degree()
	{
		return degree;
	}
	@FindBy(xpath = "//option[@value='67']")
	WebElement selectdegree;
	public WebElement SelectDegree()
	{
		return selectdegree;
	}
	
	@FindBy(xpath = "//select[@name='progOfInterest']")
	WebElement program;
	public WebElement Program()
	{
		return program;
	}
	
	@FindBy(xpath = "//option[@value='CERTTL']")
	WebElement selectprogram;
	public WebElement SelectProgram()
	{
		return selectprogram;
	}
	@FindBy(xpath = "//button[.='Next']")
	WebElement next;
	public WebElement Next()
	{
		return next;
	}
}
