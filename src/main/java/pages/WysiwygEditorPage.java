package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WysiwygEditorPage extends AbstractPage
{
    private final String editorIframeID = "mce_0_ifr";
    private final By textArea = By.id("tinymce");
    private final By decreaseIndentButton = By.cssSelector("button[aria-label='Decrease indent']");

    public WysiwygEditorPage(WebDriver driver)
    {
        super(driver);
    }

    private void switchToEditArea()
    {
        driver.switchTo().frame(editorIframeID);
    }

    private void switchToMainArea()
    {
        driver.switchTo().parentFrame();
    }

    public void clearTextArea()
    {
        switchToEditArea();
        driver.findElement(textArea).clear();
        switchToMainArea();
    }

    public void typeInTextArea(String text)
    {
        switchToEditArea();
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }

    public String getEditorText()
    {
        switchToEditArea();
        String text = driver.findElement(textArea).getText();
        switchToMainArea();

        return text;
    }

    public void decreaseIndentation()
    {
        driver.findElement(decreaseIndentButton).click();
    }
}
