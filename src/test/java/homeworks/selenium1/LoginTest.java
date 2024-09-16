package homeworks.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.BrowserUtils;

import java.time.Duration;

public class LoginTest {
    WebDriver driver;

    @DataProvider
    public Object[][] negativeLoginDataProvider() {
        return new Object[][]{
                {"@email.com", "Asdf1?", "", "", "Invalid email or password."},
                {"ioana@.com", "Asdf1?", "", "", "Invalid email or password."},
                {"ioana@email.", "Asdf1?", "", "", "Invalid email or password."},
                {"ioanaemail.com", "Asdf1?", "", "", "Invalid email or password."},
                {"ioana@emailcom", "Asdf1?", "", "", "Invalid email or password."},
                {"", "Asdf1?", "Email *\nPlease provide an email address.", "", ""},
                {"ioana@email.com", "", "", "Password *\nPlease provide a password.", ""},
                {"ioana@email.com", "asdfghj", "", "", "Invalid email or password."}
        };
    }

    @Test(dataProvider = "negativeLoginDataProvider")
    public void verifyNegativeLoginTest(String email, String password, String userError, String passwordError, String generalError) {
        driver = BrowserUtils.getDriver("firefox");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.navigate().to("http://57.151.123.81:3000/#/login");
        WebElement dismissPopup = driver.findElement(By.cssSelector("#mat-dialog-0 > app-welcome-banner > div > div:nth-child(3) > button.mat-focus-indicator.close-dialog.mat-raised-button.mat-button-base.mat-primary.ng-star-inserted > span.mat-button-wrapper > span"));
        dismissPopup.click();

        WebElement usernameField = driver.findElement(By.id("email"));
        usernameField.clear();
        usernameField.sendKeys(email);



        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.clear();
        passwordField.sendKeys(password);

        WebElement loginButton = driver.findElement(By.id("loginButton"));
        loginButton.click();

        if (email.isEmpty()) {

            WebElement userErrorMessage = driver.findElement(By.className("ng-tns-c21-7"));
            String actualUserErrorMessage = userErrorMessage.getText();
            Assert.assertEquals(actualUserErrorMessage, userError, "Invalid username error");

        } else if (password.isEmpty()) {

            WebElement passwordErrorMessage = driver.findElement(By.className("ng-tns-c21-8"));
            String actualPasswordError = passwordErrorMessage.getText();
            Assert.assertEquals(actualPasswordError, passwordError, "Check password error");

        } else {

            WebElement generalErrorMessage = driver.findElement(By.cssSelector("body > app-root > div > mat-sidenav-container > mat-sidenav-content > app-login > div > mat-card > div.error.ng-star-inserted"));
            Assert.assertEquals(generalErrorMessage.getText(), generalError, "Check the general error");
        }
        driver.quit();



    }
}
