package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage extends AbstractPage
{
    private final By triggerAlertButton = By.xpath(".//button[text()='Click for JS Alert']");
    private final By triggerConfirmButton = By.xpath(".//button[text()='Click for JS Confirm']");
    private final By triggerPromptButton = By.xpath(".//button[text()='Click for JS Prompt']");
    private final By results = By.id("result");

    public AlertsPage(WebDriver driver)
    {
        super(driver);
    }

    public void triggerAlert()
    {
        driver.findElement(triggerAlertButton).click();
    }

    public void acceptAlert()
    {
        driver.switchTo().alert().accept();
    }

    public void triggerConfirm()
    {
        driver.findElement(triggerConfirmButton).click();
    }

    public void dismissAlert()
    {
        driver.switchTo().alert().dismiss();
    }

    public void triggerPrompt()
    {
        driver.findElement(triggerPromptButton).click();
    }

    public void typePrompt(String prompt)
    {
        driver.switchTo().alert().sendKeys(prompt);
    }

    public String getAlertText()
    {
        return driver.switchTo().alert().getText();
    }

    public String getResult()
    {
        return driver.findElement(results).getText();
    }
}
