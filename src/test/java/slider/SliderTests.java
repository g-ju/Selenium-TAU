package slider;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HorizontalSliderPage;

import static org.testng.Assert.assertEquals;

public class SliderTests extends BaseTests
{
    @Test
    public void testSetSliderToFour()
    {
        HorizontalSliderPage horizontalSliderPage = homePage.clickHorizontalSliderPage();
        horizontalSliderPage.setSliderToValue(4);
        assertEquals(horizontalSliderPage.getSliderValue(), 4.0);
    }
}
