package tests;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.time.Duration;

public class LoginTest extends BaseTest {


    @DataProvider
    public Object[][] loginDataProvider() {
        return new Object[][]{
                {"zebra", "zebrapassword", "chrome"},
                {"dingo", "dingopassword", "firefox"},
                {"camel", "camelpassword", "edge"},
        };
    }

    @Test(dataProvider = "loginDataProvider")
    public void testLogin(String username, String password, String browser) {
        getBrowser(browser);
        getBaseURL();

        System.out.println("Open next url: " + baseURL + "/?page=login");
        driver.navigate().to(baseURL + "/?page=login");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(username, password);

        System.out.println("Verify login successful");
        Assert.assertTrue(loginPage.verifyLoginSuccessful(username));
    }
}
