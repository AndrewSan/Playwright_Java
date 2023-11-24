package org.example.tests;

import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.assertions.PlaywrightAssertions;
import org.example.base.BaseTest;
import org.example.base.Constans;
import org.example.pages.Pages;
import org.testng.annotations.Test;

public class HomepageTest extends BaseTest {
    // Trying Assert
    @Test
    public void verifyHeadingIsVisible() {
        PlaywrightAssertions.assertThat(Pages.getHomePage().getMainLogo()).isVisible();
        PlaywrightAssertions.assertThat(Pages.getHomePage().getSearchInput()).isVisible();
        PlaywrightAssertions.assertThat(Pages.getHomePage().getSearchButton()).isVisible();
        PlaywrightAssertions.assertThat(Pages.getHomePage().getGuideButton()).isVisible();
    }
}