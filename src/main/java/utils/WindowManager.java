package utils;

import org.openqa.selenium.WebDriver;

import java.util.Set;

public class WindowManager
{
    private final WebDriver driver;
    private final WebDriver.Navigation navigate;

    public WindowManager(WebDriver driver)
    {
        this.driver = driver;
        this.navigate = driver.navigate();
    }

    public void goBack()
    {
        navigate.back();
    }

    public void goForward()
    {
        navigate.forward();
    }

    public void goTo(String url)
    {
        navigate.to(url);
    }

    public void refresh()
    {
        navigate.refresh();
    }

    public void switchToTab(String tabTitle)
    {
        // Window handles are a unique identifier for each tab
        Set<String> windows = driver.getWindowHandles();
        for (String window : windows)
        {
            if (tabTitle.equals(driver.getTitle()))
            {
                break;
            }

            driver.switchTo().window(window);
        }
    }
}
