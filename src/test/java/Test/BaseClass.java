package Test;

import Pages.PageFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
     static WebDriver driver;
    protected static PageFactory pageFactory;

    public static void setup(String browserName) {
        if (browserName.equalsIgnoreCase("chrome")) {
            driver = WebDriverManager.chromedriver().create();
            driver.navigate().to("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
            driver.manage().window().maximize();
            pageFactory = new PageFactory(driver);
        } else if (browserName.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            driver.navigate().to("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
            driver.manage().window().maximize();
            pageFactory = new PageFactory(driver);
        }

    }

}
