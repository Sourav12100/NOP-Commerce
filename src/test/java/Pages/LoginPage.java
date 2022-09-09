package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver ;
    By Email = By.xpath("(//input[@class='email input-validation-error'])");
    By Password = By.xpath("(//input[@class='password'])");
    By submit =By.xpath("//button");

    public LoginPage(WebDriver driver) {
        this.driver=driver;
    }
    public void login() throws InterruptedException {
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.findElement(Email).sendKeys("admin@yourstore.com");
        driver.findElement(Password).sendKeys("admin");
        driver.findElement(submit).click();

    }
}
