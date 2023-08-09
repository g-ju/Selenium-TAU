package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoversPage extends AbstractPage
{
    private final By figureBox = By.className("figure");
    private final By figureCaption = By.className("figcaption");

    public HoversPage(WebDriver driver)
    {
        super(driver);
    }

    public FigureCaption hoverOverFigure(int index)
    {
        WebElement figure = driver.findElements(figureBox).get(index);

        Actions actions = new Actions(driver);
        actions.moveToElement(figure).perform();

        return new FigureCaption(figure.findElement(figureCaption));
    }

    public static class FigureCaption
    {
        private final WebElement caption;

        private final By header = By.tagName("h5");
        private final By link = By.tagName("a");

        public FigureCaption(WebElement caption)
        {
            this.caption = caption;
        }

        public boolean isCaptionDisplayed()
        {
            return caption.isDisplayed();
        }

        public String getTitle()
        {
            return caption.findElement(header).getText();
        }

        public String getLink()
        {
            return caption.findElement(link).getAttribute("href");
        }

        public String getLinkText()
        {
            return caption.findElement(link).getText();
        }
    }
}
