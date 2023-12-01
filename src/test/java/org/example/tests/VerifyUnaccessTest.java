package org.example.tests;

import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.assertions.PlaywrightAssertions;
import org.example.base.BaseTest;
import org.example.base.Constans;
import org.example.base.PageTools;
import org.example.pages.Pages;
import org.testng.annotations.Test;

public class VerifyUnaccessTest extends BaseTest {

    @Test
    public void verifyUnaccess() {

        PlaywrightAssertions.assertThat(Pages.getHomePage().getMainLogo()).isVisible();
        PlaywrightAssertions.assertThat(Pages.getHomePage().getSearchInput()).isVisible();
        PlaywrightAssertions.assertThat(Pages.getHomePage().getSearchButton()).isVisible();
        PlaywrightAssertions.assertThat(Pages.getHomePage().getGuideButton()).isVisible();
        PageTools.takeFullScreenshot();

        Pages.getUserPage().clickOnYouButton();
        PlaywrightAssertions.assertThat(Pages.getUserPage().getPromoMessageField()).isVisible();
        PlaywrightAssertions.assertThat(Pages.getUserPage().getPromoLoginButton()).isVisible();

        PageTools.takeScreenshot();
        Pages.getUserPage().clickOnHistoryButton();
        PlaywrightAssertions.assertThat(Pages.getUserPage().getHistoryUnavailableMessage()).isVisible();
        PlaywrightAssertions.assertThat(Pages.getUserPage().getLoginMessageButton()).isVisible();
    }
}