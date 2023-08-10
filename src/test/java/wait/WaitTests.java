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

    @Test
    public void testWaitUntilVisible()
    {
        var dynamicLoadingPage = homePage.clickDynamicLoading();
        var example2Page = dynamicLoadingPage.clickExample2();
        example2Page.clickStart();

        assertEquals(example2Page.getLoadedText(), "Hello World!");
    }
}
