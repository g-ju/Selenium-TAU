package alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.FileUploadPage;

import static org.testng.Assert.assertTrue;

public class FileUploadTests extends BaseTests
{
    @Test
    public void testFileUpload()
    {
        FileUploadPage uploadPage = homePage.clickFileUploadPage();
        uploadPage.uploadFile("D:\\Selenium\\TAU\\resources\\chromedriver.exe");

        assertTrue(uploadPage.getUploadedFiles().contains("chromedriver"));
    }
}
