package utils;

import org.openqa.selenium.WebDriver;

public class CookieManager
{
    private final WebDriver driver;

    public CookieManager(WebDriver driver)
    {
        this.driver = driver;
    }

    public void deleteCookie(String name)
    {
        driver.manage().deleteCookieNamed(name);
    }

    public boolean isCookiePresent(String name)
    {
        return driver.manage().getCookieNamed(name) != null;
    }
}
