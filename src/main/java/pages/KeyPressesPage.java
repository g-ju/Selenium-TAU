package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage extends AbstractPage
{
    private final By inputField = By.id("target");
    private final By resultText = By.id("result");

    public KeyPressesPage(WebDriver driver)
    {
        super(driver);
    }

    public void enterText(String text)
    {
        driver.findElement(inputField).sendKeys(text);
    }

    public String getResult()
    {
        return driver.findElement(resultText).getText();
    }
}
