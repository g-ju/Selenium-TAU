package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage extends AbstractPage
{
    private final By contextBox = By.id("hot-spot");

    public ContextMenuPage(WebDriver driver)
    {
        super(driver);
    }

    public void rightClickBox()
    {
        WebElement box = driver.findElement(contextBox);

        Actions actions = new Actions(driver);
        actions.contextClick(box).perform();
    }

    public String getAlertText()
    {
        return driver.switchTo().alert().getText();
    }
}
