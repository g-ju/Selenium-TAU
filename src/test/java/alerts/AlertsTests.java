package alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.AlertsPage;

import static org.testng.Assert.assertEquals;

public class AlertsTests extends BaseTests
{
    @Test
    public void testAcceptAlert()
    {
        AlertsPage alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerAlert();
        alertsPage.acceptAlert();

        assertEquals(alertsPage.getResult(), "You successfully clicked an alert");
    }

    @Test
    public void testGetTextFromAlert()
    {
        AlertsPage alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerConfirm();
        String alertText = alertsPage.getAlertText();
        alertsPage.dismissAlert();

        assertEquals(alertText, "I am a JS Confirm");
    }

    @Test
    public void testSetInputInAlert()
    {
        AlertsPage alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerPrompt();
        String input = "test";
        alertsPage.typePrompt(input);
        alertsPage.acceptAlert();

        assertEquals(alertsPage.getResult(), "You entered: " + input);
    }
}
