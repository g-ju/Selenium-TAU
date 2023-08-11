package cookies;

import base.BaseTests;
import org.testng.annotations.Test;
import utils.CookieManager;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class CookiesTests extends BaseTests
{
    @Test
    public void testCookies()
    {
        CookieManager cookieManager = getCookieManager();
        String cookieName = "optimizelyBuckets";

        assertTrue(cookieManager.isCookiePresent(cookieName));
        cookieManager.deleteCookie(cookieName);
        assertFalse(cookieManager.isCookiePresent(cookieName));
    }
}
