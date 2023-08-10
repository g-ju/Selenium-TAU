package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage extends AbstractPage
{
    private final String linkXPathFormat = ".//a[contains(text(), '%s')]";
    private final By example1Link = By.xpath(String.format(linkXPathFormat, "Example 1"));

    public DynamicLoadingPage(WebDriver driver)
    {
        super(driver);
    }

    public DynamicLoadingExample1Page clickExample1()
    {
        driver.findElement(example1Link).click();
        return new DynamicLoadingExample1Page(driver);
    }

}
