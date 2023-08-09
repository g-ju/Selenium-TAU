package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HorizontalSliderPage extends AbstractPage
{
    private final By slider = By.tagName("input");
    private final By sliderValue = By.id("range");

    public HorizontalSliderPage(WebDriver driver)
    {
        super(driver);
    }

    public void setSliderToValue(double value)
    {
        WebElement slider = driver.findElement(this.slider);
        while (getSliderValue() != value)
        {
            slider.sendKeys(Keys.ARROW_RIGHT);
        }
    }

    public double getSliderValue()
    {
        return Double.parseDouble(driver.findElement(sliderValue).getText());
    }
}
