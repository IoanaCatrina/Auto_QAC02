package homeworks.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import testNG.BrowserUtils;

public class RegistrationTest {
    WebDriver driver;

    @DataProvider
    public Object[][] negativeRegistrationDataProvider() {
        return new Object[][]{
                {"ioana@.com", "Email *\nEmail address is not valid.", "Asdf!", "", "Asdf!", "", "Question 1", "", "Ana", ""}
        };
    }

    @Test(dataProvider = "negativeRegistrationDataProvider")
    public void verifyNegativeRegistrationTest(String email, String emailError,
                                               String password, String passwordError,
                                               String repeatPassword, String repeatPassError,
                                               String securityQuestion, String securityQuestionError,
                                               String answer, String answerError) {

        driver = BrowserUtils.getDriver();
        driver.navigate().to("http://57.151.123.81:3000/#/register");

        WebElement dismissPopup = driver.findElement(By.cssSelector("#mat-dialog-0 > app-welcome-banner > div > div:nth-child(3) > button.mat-focus-indicator.close-dialog.mat-raised-button.mat-button-base.mat-primary.ng-star-inserted > span.mat-button-wrapper > span"));
        dismissPopup.click();

        WebElement emailField = Utils.findElement(driver, "id", "emailControl");
        emailField.clear();
        emailField.sendKeys(email);

        WebElement passwordField = Utils.findElement(driver, "id", "passwordControl");
        passwordField.clear();
        passwordField.sendKeys(password);

        WebElement confirmPassword = Utils.findElement(driver, "id", "repeatPasswordControl");
        confirmPassword.clear();
        confirmPassword.sendKeys(repeatPassword);

        WebElement dropdown = driver.findElement(By.className("mat-select-arrow-wrapper"));
        dropdown.click();

        WebElement dropdownValue = Utils.findElement(driver, "id", "mat-option-0");
        dropdownValue.click();

        WebElement questionValue = Utils.findElement(driver, "id", "securityAnswerControl");
        questionValue.clear();
        questionValue.sendKeys(answer);

        WebElement registerButton = Utils.findElement(driver, "id", "registerButton");
        Assert.assertTrue(Boolean.parseBoolean(registerButton.getAttribute("disabled")));

        driver.quit();
    }

}
