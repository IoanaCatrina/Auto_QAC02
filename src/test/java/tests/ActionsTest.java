package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HoverPage;

public class ActionsTest extends BaseTest {
    HoverPage hoverPage;

    @BeforeTest
    public void prepareTest() {
        super.setUP();
    }

    @Test
    public void verifySelectingElementFromDropdownTest() {
        String expectedDropdownOption = "Cat";
        navigateToURL("/?page=hover");
        hoverPage = new HoverPage(driver);

        Assert.assertTrue(hoverPage.hoverButtonDisplayed(), "Hover button is not displayed");
        hoverPage.moveToHoverButton();
        System.out.println("Dropdown opened");
        System.out.println("Dropdown options:");
        hoverPage.getDropdownOptions().forEach(System.out::println);
        System.out.println("Selecting Cat from dropdown");
        hoverPage.clickDropdownOption(expectedDropdownOption);
        System.out.println("Verify if Cat is selected");
       Assert.assertEquals(hoverPage.getSelectedDropdownOption(), expectedDropdownOption);
    }
}
