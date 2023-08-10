package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicLoadingExample2Page extends AbstractPage
{
    private final By startButton = By.cssSelector("#start button");
    private final By loadedText = By.id("finish");

    public DynamicLoadingExample2Page(WebDriver driver)
    {
        super(driver);
    }

    public void clickStart()
    {
        driver.findElement(startButton).click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(loadedText));
    }

    public String getLoadedText()
    {
        return driver.findElement(loadedText).getText();
    }

    public boolean isStartButtonDisplayed()
    {
        return driver.findElement(startButton).isDisplayed();
    }
}
