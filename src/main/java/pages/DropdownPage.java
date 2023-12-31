package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropdownPage extends AbstractPage
{
    private final By dropdown = By.id("dropdown");

    public DropdownPage(WebDriver driver)
    {
        super(driver);
    }

    private Select findDropdownElement()
    {
        return new Select(driver.findElement(dropdown));
    }

    public void selectFromDropdown(String option)
    {
        findDropdownElement().selectByVisibleText(option);
    }

    public List<String> getSelectedOptions()
    {
        List<WebElement> selectedElements = findDropdownElement().getAllSelectedOptions();
        return selectedElements.stream()
                               .map(WebElement::getText)
                               .collect(Collectors.toList());
    }

    public void allowMultipleSelection()
    {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        String script = "arguments[0].setAttribute('multiple', '');";
        jsExecutor.executeScript(script, driver.findElement(dropdown));
    }
}
