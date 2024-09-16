package homeworks.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Utils {

    public static WebElement waitForElement(WebDriver driver, String locatorType, String locatorValue) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element;
        switch (locatorType) {
            case "id":
                element = wait.until(ExpectedConditions.elementToBeClickable(By.id(locatorValue)));
                break;
            case "cssSelector":
                element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(locatorValue)));
                break;
            case "name":
                element = wait.until(ExpectedConditions.elementToBeClickable(By.name(locatorValue)));
            default:
                element = null;
        }
        return element;
    }

    public static WebElement findElement(WebDriver driver, String locatorType, String locatorValue) {
        WebElement element;
        switch (locatorType) {
            case "id":
                element = driver.findElement(By.id(locatorValue));
                break;
            case "cssSelector":
                element = driver.findElement(By.cssSelector(locatorValue));
                break;
            case "name":
                element = driver.findElement(By.name(locatorValue));
                break;
            default:
                element = null;
        }
        return element;
    }
}
