package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LargeDeepDOMPage extends AbstractPage
{
    private final By table = By.id("large-table");

    public LargeDeepDOMPage(WebDriver driver)
    {
        super(driver);
    }

    public void scrollToTable()
    {
        WebElement tableElement = driver.findElement(table);

        String script = "arguments[0].scrollIntoView();";

        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript(script, tableElement);
    }
}
