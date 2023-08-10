package frames;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FrameTests extends BaseTests
{
    @Test
    public void testWysiwyg()
    {
        var editorPage = homePage.clickWysiwygPage();
        editorPage.clearTextArea();
        editorPage.typeInTextArea("hello");
        editorPage.decreaseIndentation();
        editorPage.typeInTextArea(" world");

        assertEquals(editorPage.getEditorText(), "hello world");
    }

    @Test
    public void testNestedFrames()
    {
        var nestedFramePage = homePage.clickNestedFramePage();

        assertEquals(nestedFramePage.getTopLeftFrameText(), "LEFT");
        assertEquals(nestedFramePage.getBottomFrameText(), "BOTTOM");
    }
}
