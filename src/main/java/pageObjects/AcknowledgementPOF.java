package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AcknowledgementPOF {
	public WebDriver driver;
	
	
	
	public AcknowledgementPOF(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy (xpath = "(//button[@class='btn nextButton2'])[2]")
	WebElement savecontinue;
	
	public WebElement saveContinue()
	{
		return savecontinue;
	}

	

}
