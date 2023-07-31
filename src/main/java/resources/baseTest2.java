package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class baseTest2 
{
	
	public WebDriver driver;
	public Properties prop;
	public JavascriptExecutor js;
	public WebDriverWait wait;
	
	
	public WebDriver InitializeDrivers() throws IOException
	{
		 prop= new Properties();
		 FileInputStream fis=new FileInputStream("C:\\Users\\PraveenKuri\\eclipse-workspace\\maven\\src\\main\\java\\resources\\data.properties");
		 prop.load(fis);
		 String browserName=System.getProperty("browser")!=null ? System.getProperty("browser"):prop.getProperty("browser");
		 //prop.getProperty("browser"); 
		 //prop.getProperty("browser");
		 prop.getProperty("loginurl");
		 prop.getProperty("homeurl");
		 js=(JavascriptExecutor)driver;
		 if(browserName.equalsIgnoreCase("chrome"))	
		{
			System.setProperty("webdriver.chrome.driver","./Servers3/chromedriver.exe");
			driver =new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.driver","./Servers3/geckodriver.exe");
				driver =new FirefoxDriver();
			} 
		else if(browserName.equalsIgnoreCase("edge")) 
		{
			System.setProperty("webdriver.edge.driver","./Servers3/msedgedriver.exe");
			driver =new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		wait=new WebDriverWait(driver, Duration.ofSeconds(40));
		return driver;
	}
	
	public String getScreenShotPath(String testCaseName,WebDriver driver) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source =ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir")+"\\screenshots\\"+testCaseName+".png";
		FileUtils.copyFile(source,new File(destinationFile));
		return destinationFile;
	}
}



