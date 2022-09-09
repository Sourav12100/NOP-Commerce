package Pages;

import org.openqa.selenium.WebDriver;

public class PageFactory {
    WebDriver driver;

    private LoginPage loginPage;
    private ConfigurationPage configurationPage;
    private AddEmail addEmail;

    public PageFactory(LoginPage loginPage) {
        this.loginPage = loginPage;
    }
    public PageFactory(ConfigurationPage configurationPage) {
        this.configurationPage = configurationPage;
    }
    public PageFactory(AddEmail addEmail){
        this.addEmail = addEmail;
    }

    public PageFactory(WebDriver driver) {

    }


    public LoginPage getLoginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage(driver);
        }
        return loginPage;
    }
    public ConfigurationPage getConfigurationPage() {
        if (configurationPage == null) {
            configurationPage = new ConfigurationPage(driver);
        }
        return configurationPage;
    }
    public AddEmail getAddEmail() {
        if (addEmail == null) {
            addEmail = new AddEmail(driver);
        }
        return addEmail;
    }



}






