package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends AbstractPage
{
    private final By usernameField = By.id("username");
    private final By passwordField = By.id("password");
    private final By loginButton = By.cssSelector("#login button");

    public LoginPage(WebDriver driver)
    {
        super(driver);
    }

    public void setUserName(String userName)
    {
        driver.findElement(usernameField).sendKeys(userName);
    }

    public void setPassword(String password)
    {
        driver.findElement(passwordField).sendKeys(password);
    }

    public SecureAreaPage clickLoginButton()
    {
        driver.findElement(loginButton).click();
        return new SecureAreaPage(driver);
    }
}
