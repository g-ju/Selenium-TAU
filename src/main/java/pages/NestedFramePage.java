package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramePage extends AbstractPage
{
    // Note - frame() method can take name or ID, so didn't have to use By's here.
    private final By topFrame = By.name("frame-top");
    private final By leftFrame = By.name("frame-left");
    private final By bottomFrame = By.name("frame-bottom");
    private final By frameBody = By.tagName("body");

    public NestedFramePage(WebDriver driver)
    {
        super(driver);
    }

    private void switchToTopLeftFrame()
    {
        driver.switchTo().frame(driver.findElement(topFrame));
        driver.switchTo().frame(driver.findElement(leftFrame));
    }

    private void switchToBottomFrame()
    {
        driver.switchTo().frame(driver.findElement(bottomFrame));
    }

    private void switchToParentFrame()
    {
        driver.switchTo().parentFrame();
    }

    private String getFrameBodyText()
    {
        return driver.findElement(frameBody).getText();
    }

    public String getTopLeftFrameText()
    {
        switchToTopLeftFrame();
        String text = getFrameBodyText();
        switchToParentFrame();
        switchToParentFrame();

        return text;
    }

    public String getBottomFrameText()
    {
        switchToBottomFrame();
        String text = getFrameBodyText();
        switchToParentFrame();

        return text;
    }
}
