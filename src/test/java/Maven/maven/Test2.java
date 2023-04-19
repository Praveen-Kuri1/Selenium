package Maven.maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test2 {
    public static void main(String[] args) {
    	ChromeOptions co = new ChromeOptions();
    	co.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver","./Servers3/chromedriver.exe");

        WebDriver driver = new ChromeDriver(co);

        driver.get("http://the-internet.herokuapp.com/.");
        System.out.println("Launched the Chrome Browser");

        WebElement usernameField = driver.findElement(By.name("username"));
        WebElement passwordField = driver.findElement(By.name("password"));

        usernameField.sendKeys("your_username");
        passwordField.sendKeys("your_password");

        WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));
        loginButton.click();
        driver.quit();
    }
}
