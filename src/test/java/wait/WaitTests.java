package wait;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WaitTests extends BaseTests
{
    @Test
    public void testWaitUntilHidden()
    {
        var dynamicLoadingPage = homePage.clickDynamicLoading();
        var example1Page = dynamicLoadingPage.clickExample1();
        example1Page.clickStart();

        assertEquals(example1Page.getLoadedText(), "Hello World!");
    }
}
