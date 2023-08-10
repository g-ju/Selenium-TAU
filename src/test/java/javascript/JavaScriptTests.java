package javascript;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class JavaScriptTests extends BaseTests
{
    @Test
    public void testScrollToTable()
    {
        // Is there 'easy' way to check table is actually in view? Seems like you need to use more JS to check
        homePage.clickLargeDeepDOM().scrollToTable();
    }

    @Test
    public void testScrollToFifthParagraph()
    {
        var scrollPage = homePage.clickInfiniteScroll();
        scrollPage.scrollToParagraph(5);
        assertEquals(scrollPage.getNumberOfParagraphsPresent(), 5);
    }
}
