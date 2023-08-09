package alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ContextMenuPage;

import static org.testng.Assert.assertEquals;

public class ContextMenuTests extends BaseTests
{
    @Test
    public void testContextMenuAlert()
    {
        ContextMenuPage contextMenuPage = homePage.clickContextMenuPage();
        contextMenuPage.rightClickBox();

        assertEquals(contextMenuPage.getAlertText(), "You selected a context menu");
    }
}
