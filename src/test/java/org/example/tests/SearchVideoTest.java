package org.example.tests;

import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.assertions.PlaywrightAssertions;
import org.example.base.BaseTest;
import org.example.base.Constans;
import org.example.pages.Pages;
import org.testng.annotations.Test;

public class SearchVideoTest extends BaseTest {
    // Trying Assert
    @Test
    public void searchVideo() {

        /*
        - Try to find specific video
        - verify like/dislike buttons exist
        */

        PlaywrightAssertions.assertThat(Pages.getHomePage().getSearchInput()).isVisible();
        PlaywrightAssertions.assertThat(Pages.getHomePage().getSearchButton()).isVisible();

        Pages.getSearchPage().typeInSearchInput();
        Pages.getSearchPage().ckickOnSearchButton();

        Pages.getSearchPage().isSearchResultTextFiledVisible();
        Pages.getSearchPage().isSearchYearsResultTextFiledVisible();
        Pages.getSearchPage().clickOnFoundVideo();

        PlaywrightAssertions.assertThat(Pages.getSearchPage().getSubscribeButton()).isVisible();
        PlaywrightAssertions.assertThat(Pages.getSearchPage().getLikeButton()).isVisible();
        PlaywrightAssertions.assertThat(Pages.getSearchPage().getDislikeButton()).isVisible();
    }
}