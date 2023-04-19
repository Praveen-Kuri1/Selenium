package Maven.maven;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import pageObjects.CreatePasswordPOF;
import pageObjects.HomePagePOF;
import pageObjects.ProgramInfoPOF;
import pageObjects.StudentRegisterPOF;
import resources.baseTest2;

public class RegisterStudentScriptTest extends baseTest2 {
	public WebDriver driver;
	
 
	@BeforeTest
	public void alldrivers() throws IOException
	{
		driver=InitializeDrivers();
		driver.get(prop.getProperty("homeurl"));
	} 
		
	@Test
	public void StudentRegistration() throws InterruptedException
	{	
		JavascriptExecutor js=(JavascriptExecutor)driver;
		StudentRegisterPOF SA=new StudentRegisterPOF(driver); //PageObject 1
		SA.FirstName().sendKeys("Testing");
		SA.LastName().sendKeys("74");
		SA.Email().sendKeys("testing74@testingmail.com");
		SA.Country().click();
		SA.SelectCountry().click();
		SA.State().click();
		SA.SelectState().click();
		SA.PhoneNumber().sendKeys("1234567890");
		js.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(1000);
		SA.Next().click();
		
		js.executeScript("window.scrollBy(0,-780)", "");
		ProgramInfoPOF PI=new ProgramInfoPOF(driver);
		PI.HighestCompletedEducation().click();
		PI.SelectHighestCompletedEducation().click();;
		PI.Degree().click();
		PI.SelectDegree().click();
		PI.Program().click();
		PI.SelectProgram().click();
		js.executeScript("window.scrollBy(0,100)", "");
		//driver.findElement(By.xpath("//button[@class='btn nextButton2']")).click();
		PI.Next().click();
		
		CreatePasswordPOF CP=new CreatePasswordPOF(driver);
		CP.Password().sendKeys("Testing@4321");
		CP.ConfirmPassword().sendKeys("Testing@4321");
		CP.CreateAccount().click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='signOutSection']")));
		HomePagePOF hp=new HomePagePOF(driver);
		hp.SignOUT().click();
		//it will wait till the student register and click on logout in personal page	
	}
	
	@AfterTest
	public void tear()
	{
		driver.close();
	}
	
}
