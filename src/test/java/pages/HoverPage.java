package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HoverPage extends BasePage {
    @FindBy(xpath = "//button[contains(text(), 'Hover me')]")
    private WebElement openHoverButton;

    @FindBy(xpath = "//div[@class='dropdown-content']/div")
    private List<WebElement> dropdownOptions;

    @FindBy(className = "clicked")
    private WebElement selectedDropdownOption;

    Actions actions;


    public HoverPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        actions = new Actions(driver);
    }

    public boolean hoverButtonDisplayed() {
        waitUntilElementVisible(openHoverButton);
        return openHoverButton.isDisplayed();
    }

    public void moveToHoverButton() {
        actions.moveToElement(openHoverButton).perform();
    }

    public List<String> getDropdownOptions() {
        moveToHoverButton();
        List<String> dropdownOptionsText = new ArrayList<>();
        for (WebElement element : dropdownOptions) {
            dropdownOptionsText.add(element.getText());
        }
        return dropdownOptionsText;
    }

    public Map<String, WebElement> getMapDropdownOptions() {
        Map<String, WebElement> dropdownOptionsMap = new HashMap<>();
        for (WebElement element : dropdownOptions) {
            dropdownOptionsMap.put(element.getText(), element);
        }
        return dropdownOptionsMap;
    }

    public String getSelectedDropdownOption() {
        waitUntilElementVisible(selectedDropdownOption);
        return selectedDropdownOption.getText();
    }

    public void clickDropdownOption(String value) {
        WebElement element = getMapDropdownOptions().get(value);
        actions.moveToElement(element).click().build().perform();
    }
}
