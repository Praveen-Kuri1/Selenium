package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentGatewayPOF {
	public WebDriver driver;
	
	
	
	public PaymentGatewayPOF(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//input[@id='cc_number']")
	WebElement cardnumber;
	
	public WebElement CardNumber()
	{
		return cardnumber;
	}
	
	@FindBy(xpath = "//input[@id='expdate_month']")
	WebElement expmonth;
	public WebElement ExpMonth()
	{
		return expmonth;
	}
	@FindBy(xpath = "//input[@id='expdate_year']")
	WebElement expyear;
	
	public WebElement ExpYear()
	{
		return expyear;
	}
	
	@FindBy(xpath = "//input[@id='cvv2_number']")
	WebElement csc;
	public WebElement CSC()
	{
		return csc;
	}
	@FindBy(xpath = "//input[@id='btn_pay_cc']")
	WebElement paynow;
	public WebElement PayNow()
	{
		return paynow;
	}
	

}
