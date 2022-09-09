package Test;

import Pages.PageFactory;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass{
    @Test
    public void LoginTest() throws InterruptedException {
    pageFactory.getLoginPage().login();
    pageFactory.getConfigurationPage().Configuration();
    pageFactory.getAddEmail().User();
    }
}
