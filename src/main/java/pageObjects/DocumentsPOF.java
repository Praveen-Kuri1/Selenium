package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DocumentsPOF {
	public WebDriver driver;
	
	
	
	public DocumentsPOF(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy (xpath = "//button[@id='btn1']")
	WebElement uploaddocuments;
	
	public WebElement UploadDocuments()
	{
		return uploaddocuments;
	}

	

}
