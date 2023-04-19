package Maven.maven;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import pageObjects.HomePagePOF;
import pageObjects.LoginPOF;
import resources.baseTest2;

public class LoginScriptTest extends baseTest2 {
	
	public WebDriver driver;	
	public ExtentReports extent;	
	

	@BeforeTest
	public void CallingDriver() throws IOException
	{
		 driver=InitializeDrivers();
		 driver.get(prop.getProperty("loginurl"));
	}
	
	@Test
	public void Login() throws InterruptedException
	{		
		LoginPOF log=new LoginPOF(driver);
		log.UserName().sendKeys("Test.02");
		log.Password().sendKeys("Test@4321");
		log.SignIN().click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='signOutSection']")));
		HomePagePOF hp=new HomePagePOF(driver);
		hp.SignOUT().click();
		System.out.println("Test Successfully Passed!");
		
	}

/*		
	@Test	
	public void VerifyTitle()
	{
	String ActualTitle = driver.getTitle();
	String ExpectedTitle ="Apply Form - Login";
	if(ActualTitle.equalsIgnoreCase(ExpectedTitle))
		System.out.println("Title Matched");
	else
		System.out.println("Title didn't match");	

	Assert.assertEquals(ActualTitle, ExpectedTitle);
	Assert.assertEquals("Condition true", ActualTitle, ExpectedTitle);
	}
*/	
	@AfterTest
	public void tear()
	{
		driver.close();
	}	
}
