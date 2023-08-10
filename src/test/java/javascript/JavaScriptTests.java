package javascript;

import base.BaseTests;
import org.testng.annotations.Test;

import java.util.List;

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

    @Test
    public void testAllowMultipleDropdown()
    {
        var dropdownPage = homePage.clickDropdown();
        dropdownPage.allowMultipleSelection();
        dropdownPage.selectFromDropdown("Option 1");
        dropdownPage.selectFromDropdown("Option 2");

        List<String> selectedOptions = dropdownPage.getSelectedOptions();
        assertEquals(selectedOptions.size(), 2);
        assertEquals(selectedOptions.get(0), "Option 1");
        assertEquals(selectedOptions.get(1), "Option 2");
    }
}
