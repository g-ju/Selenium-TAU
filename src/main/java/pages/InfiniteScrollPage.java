package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class InfiniteScrollPage extends AbstractPage
{
    final By textBlocks = By.className("jscroll-added");

    public InfiniteScrollPage(WebDriver driver)
    {
        super(driver);
    }

    /**
     * Scrolls until paragraph with index specified is in view
     * @param index index from 1
     */
    public void scrollToParagraph(int index)
    {
        String script = "window.scrollTo(0, document.body.scrollHeight)";
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

        while(getNumberOfParagraphsPresent() < index)
        {
            jsExecutor.executeScript(script);
        }
    }

    public int getNumberOfParagraphsPresent()
    {
        return driver.findElements(textBlocks).size();
    }
}
