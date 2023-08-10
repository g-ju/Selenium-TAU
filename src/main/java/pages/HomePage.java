package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends AbstractPage
{
    public HomePage(WebDriver driver)
    {
        super(driver);
    }

    private void clickLink(String linkText)
    {
        driver.findElement(By.linkText(linkText)).click();
    }

    public LoginPage clickFormAuthentication()
    {
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    public DropdownPage clickDropdown()
    {
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }

    public HoversPage clickHovers()
    {
        clickLink("Hovers");
        return new HoversPage(driver);
    }

    public KeyPressesPage clickKeyPresses()
    {
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }

    public HorizontalSliderPage clickHorizontalSliderPage()
    {
        clickLink("Horizontal Slider");
        return new HorizontalSliderPage(driver);
    }

    public AlertsPage clickJavaScriptAlerts()
    {
        clickLink("JavaScript Alerts");
        return new AlertsPage(driver);
    }

    public FileUploadPage clickFileUploadPage()
    {
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }

    public ContextMenuPage clickContextMenuPage()
    {
        clickLink("Context Menu");
        return new ContextMenuPage(driver);
    }

    public WysiwygEditorPage clickWysiwygPage()
    {
        clickLink("WYSIWYG Editor");
        return new WysiwygEditorPage(driver);
    }

    public NestedFramePage clickNestedFramePage()
    {
        clickLink("Frames");
        clickLink("Nested Frames");
        return new NestedFramePage(driver);
    }

    public DynamicLoadingPage clickDynamicLoading()
    {
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }

    public LargeDeepDOMPage clickLargeDeepDOM()
    {
        clickLink("Large & Deep DOM");
        return new LargeDeepDOMPage(driver);
    }

    public InfiniteScrollPage clickInfiniteScroll()
    {
        clickLink("Infinite Scroll");
        return new InfiniteScrollPage(driver);
    }

    public MultipleWindowsPage clickMultipleWindows()
    {
        clickLink("Multiple Windows");
        return new MultipleWindowsPage(driver);
    }
}
