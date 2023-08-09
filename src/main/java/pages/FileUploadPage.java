package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage extends AbstractPage
{
    private final By inputField = By.id("file-upload");
    private final By uploadButton = By.id("file-submit");
    private final By uploadedFiles = By.id("uploaded-files");

    public FileUploadPage(WebDriver driver)
    {
        super(driver);
    }

    public void clickUploadButton()
    {
        driver.findElement(uploadButton).click();
    }

    public void uploadFile(String fileAbsolutePath)
    {
        driver.findElement(inputField).sendKeys(fileAbsolutePath);
        clickUploadButton();
    }

    public String getUploadedFiles()
    {
        return driver.findElement(uploadedFiles).getText();
    }
}
