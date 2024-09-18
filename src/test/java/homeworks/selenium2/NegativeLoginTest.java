package homeworks.selenium2;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;
import tests.BaseTest;

public class NegativeLoginTest extends BaseTest {

    @DataProvider
    public Object[][] negativeLoginDataProvider() {
        return new Object[][]{
                {"lion", "lionpassword", "Invalid username or password!"},
                {"camel", "asdfg", "Invalid username or password!"},
                {"", "dingopassword", "Invalid username or password!"},
                {"camel", "", "Invalid username or password!"},
                {"", "", "Invalid username or password!"}
        };
    }

    @Test(dataProvider = "negativeLoginDataProvider")
    public void negativeLoginTest(String username, String password, String expectedError) {
        getBrowser();
        getBaseURL();

        driver.navigate().to(baseURL + "/?page=login");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(username, password);

//        Assert.assertTrue(loginPage.verifyFailedLoginError());
        Assert.assertEquals(loginPage.getErrorMessage(), expectedError, "Check error message!");
    }
}
