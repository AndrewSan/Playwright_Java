package org.example.tests;

import com.microsoft.playwright.assertions.PlaywrightAssertions;
import org.example.base.BaseTest;
import org.example.pages.Pages;
import org.testng.annotations.Test;

public class wGotoLoginPageTest extends BaseTest {

    @Test
    public void openSettingsAndFaceLoginPage() {

        /*
        - Try to open setting page from three dots menu
        - we should face with login google form
        - verify google form present after all
        */

        PlaywrightAssertions.assertThat(Pages.getHomePage().getMainLogo()).isVisible();
        PlaywrightAssertions.assertThat(Pages.getHomePage().getSearchInput()).isVisible();
        PlaywrightAssertions.assertThat(Pages.getHomePage().getSearchButton()).isVisible();
        PlaywrightAssertions.assertThat(Pages.getHomePage().getGuideButton()).isVisible();

        Pages.getHomePage().clickOnThreeDotsMenu();
        Pages.getHomePage().clickOnSettingOptionsButton();
        PlaywrightAssertions.assertThat(Pages.getHomePage().getGoogleLoginForm()).isVisible();
        PlaywrightAssertions.assertThat(Pages.getHomePage().getEmailInputField()).isVisible();
    }
}