package Maven.maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAutomation {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","./Servers3/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://the-internet.herokuapp.com/.");

        WebElement usernameField = driver.findElement(By.name("username"));
        WebElement passwordField = driver.findElement(By.name("password"));

        usernameField.sendKeys("your_username");
        passwordField.sendKeys("your_password");

        WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));
        loginButton.click();

        driver.quit();
    }

}
