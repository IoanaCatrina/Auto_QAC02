package homeworks.selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;

import java.sql.SQLOutput;

public class RegistrationPage extends BasePage {
    @FindBy(xpath = "//h1[contains(text(), 'Sign up')]")
    private WebElement pageIdentifier;

    @FindBy(id = "user")
    private WebElement usernameInput;

    @FindBy(id = "pass")
    private WebElement passwordInput;

    @FindBy(id = "confirm-pass")
    private WebElement confirmPassInput;

    @FindBy(xpath = "//input[@id='confirm-pass']/ancestor::form/button")
    private WebElement signUpButton;


    public RegistrationPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void registration(String username, String password, String confirmPassword) {
        System.out.println("Waiting for Registration page to load");
        waitUntilElementVisible(pageIdentifier);
        this.enterUsername(username);
        this.enterPassword(password);
        this.enterConfirmPassword(confirmPassword);
        this.submit();
    }

    public void enterUsername(String username) {
        waitUntilElementVisible(usernameInput);
        System.out.println("Enter username " + username);
        usernameInput.clear();
        usernameInput.sendKeys(username);
    }

    public void enterPassword(String password) {
        waitUntilElementVisible(passwordInput);
        System.out.println("Enter password " + password);
        passwordInput.clear();
        passwordInput.sendKeys(password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        waitUntilElementVisible(confirmPassInput);
        System.out.println("Confirm password " + confirmPassword);
        confirmPassInput.clear();
        confirmPassInput.sendKeys(confirmPassword);
    }

    public void submit() {
        waitUntilElementVisible(signUpButton);
        System.out.println("Click on Sign up button");
        signUpButton.click();
    }

    public boolean verifyRegistrationSuccessful(String username) {
        String welcomeMessageXpath = "//h1[contains(text(), 'Welcome to web-stubs, " + username + "!')]";
        WebElement welcomeMessage = waitUntilElementVisible(By.xpath(welcomeMessageXpath));
        System.out.println("Welcome message: " + welcomeMessage.getText());
        return welcomeMessage.isDisplayed();
    }

    public boolean verifyFailedRegistrationError(String errorMessage) {
        String errorXpath = "//form/p";
        WebElement error = waitUntilElementVisible(By.xpath(errorXpath));
        String errorMessageFromPage = error.getText();
        return  errorMessageFromPage.equals(errorMessage);
    }
}
