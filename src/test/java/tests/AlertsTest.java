package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.AlertsPage;

public class AlertsTest extends BaseTest {
    AlertsPage alertsPage;
    String dismissMe = "You cannot interact with the page unless you dismiss me";
    String expectedSimpleAlertText = "Hello! I am an Javascript alert!\n" + dismissMe;
    String expectedConfirmAlertText = "Hello! I am an Javascript confirmation dialog!\n" + dismissMe;
    String expectedPromptAlertText = "Hello! I am an Javascript prompt dialog!\n" + dismissMe;

    @BeforeTest

    public void prepareTest() {
        super.setUP();
    }

    @Test
    public void openAndCloseSimpleAlert() {
        navigateToURL("/?page=alerts");
        alertsPage = new AlertsPage(driver);

        System.out.println("Open simple alert");
        alertsPage.openSimpleAlert();

        verifyAlertText(expectedSimpleAlertText);

        System.out.println("Accept alert");
        alertsPage.acceptAlert(alert);

        verifyAlertIsClosed();
    }

    @Test
    public void openAndCloseConfirmAlert() {
        navigateToURL("/?page=alerts");
        alertsPage = new AlertsPage(driver);

        System.out.println("Open confirm alert");
        alertsPage.openConfirmAlert();

        verifyAlertText(expectedConfirmAlertText);

        System.out.println("Dismiss alert");
        alertsPage.cancelAlert(alert);

        verifyAlertIsClosed();
    }

    @Test
    public void openAndClosePromptAlert() {
        navigateToURL("/?page=alerts");
        alertsPage = new AlertsPage(driver);

        System.out.println("Open confirm alert");
        alertsPage.openPromptAlert();

        verifyAlertText(expectedPromptAlertText);

        System.out.println("Accept alert with prompt message" + "I agree");
        alertsPage.acceptAlert(alert, "I agree");
        verifyAlertIsClosed();
    }


}
