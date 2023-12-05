package org.example.tests;

import com.microsoft.playwright.assertions.PlaywrightAssertions;
import org.example.base.BaseTest;
import org.example.pages.Pages;
import org.testng.annotations.Test;

public class ShortsTest extends BaseTest {

    @Test
    public void shortsTest() {

        /*
        - Try to open youtube shorts video
        - verify like button, comment button, share button
        */

        PlaywrightAssertions.assertThat(Pages.getHomePage().getMainLogo()).isVisible();
        PlaywrightAssertions.assertThat(Pages.getHomePage().getSearchInput()).isVisible();
        PlaywrightAssertions.assertThat(Pages.getHomePage().getSearchButton()).isVisible();
        PlaywrightAssertions.assertThat(Pages.getHomePage().getGuideButton()).isVisible();

        Pages.getShortsPage().clickOnYoutubeShortsButton();
        PlaywrightAssertions.assertThat(Pages.getShortsPage().getShortsLikeButton()).isVisible();
        PlaywrightAssertions.assertThat(Pages.getShortsPage().getShortsCommentButton()).isVisible();
        PlaywrightAssertions.assertThat(Pages.getShortsPage().getShortsShareButton()).isVisible();
    }
}