package navigation;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class NavigationTests extends BaseTests
{
    @Test
    public void testNavigation()
    {
        homePage.clickDynamicLoading().clickExample1();
        getWindowManager().goBack();
        getWindowManager().refresh();
        getWindowManager().goForward();
        getWindowManager().goTo("https://google.com");
    }

    @Test
    public void testSwitchTabs()
    {
        homePage.clickMultipleWindows().clickHere();
        getWindowManager().switchToTab("New Window");
    }

    @Test
    public void testOpenLinkInNewTab()
    {
        var dynamicPage = homePage.clickDynamicLoading();
        var example2Page = dynamicPage.openExample2InNewTab();
        getWindowManager().switchToNewTab();
        assertTrue(example2Page.isStartButtonDisplayed());
    }
}
