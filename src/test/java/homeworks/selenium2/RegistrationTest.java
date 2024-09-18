package homeworks.selenium2;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tests.BaseTest;

public class RegistrationTest extends BaseTest {

    @DataProvider
    public Object[][] registrationDataProvider() {
        return new Object[][]{
                {"ioana", "ioanapass", "ioanapass"},
                {"12345", "12345pass", "12345pass"},
                {"ioa_aa", "mypass", "mypass"}
        };
    }

    @Test(dataProvider = "registrationDataProvider")
    public void registrationTest(String username, String password, String confirmPassword) {
        setUP();
        System.out.println("Open url " + baseURL + "/?page=signup");
        driver.navigate().to(baseURL + "/?page=signup");
        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.registration(username, password, confirmPassword);

        System.out.println("Verify registration process successful");
        Assert.assertTrue(registrationPage.verifyRegistrationSuccessful(username));
    }

    @DataProvider
    public Object[][] negativeRegistrationDataProvider() {
        return new Object[][]{
                {"rabbit", "mypass", "xxxpass", "Passwords do not match!"},
                {"", "mypass", "mypass", "Please fill in all fields!"},
                {"mytest", "testpass", "", "Please fill in all fields!"},
                {"myuser", "", "12345", "Please fill in all fields!"},
                {"", "", "", "Please fill in all fields!"}
        };
    }

    @Test(dataProvider = "negativeRegistrationDataProvider")
    public void negativeRegistrationTest(String username, String password, String confirmPassword, String errorMessage) {
        setUP();
        System.out.println("Open url " + baseURL + "/?page=signup");
        driver.navigate().to(baseURL + "/?page=signup");
        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.registration(username, password, confirmPassword);

        System.out.println("Verify failed Registration error");
        Assert.assertTrue(registrationPage.verifyFailedRegistrationError(errorMessage));
    }
}
