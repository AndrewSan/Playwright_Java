package org.example.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import org.example.base.BaseTest;

public class HomePage extends BaseTest {
    private final Page page;
    public HomePage(Page page) {
        this.page = page;
    }

    private String mainLogo = "(//a[@id='logo'])[1]";
    private String searchInput = "//input[@id='search']";
    private String searchButton = "//button[@id='search-icon-legacy']";
    private String guideButton = "(//yt-icon-button[@id='guide-button'])[1]";

    private String threeDotsMenu = "//div[@id='button']//yt-interaction";
    private String settingOptionsButton = "(//yt-multi-page-menu-section-renderer[@class='style-scope ytd-multi-page-menu-renderer'])[2]";
    private String googleLoginForm = "//div[@jsname='paFcre']";
    private String emailInputField = "//input[@type='email']";

    public void clickOnThreeDotsMenu(){
        page.locator(threeDotsMenu).waitFor();
        page.locator(threeDotsMenu).click();
    }

    public void clickOnSettingOptionsButton(){
        page.locator(settingOptionsButton).waitFor();
        page.locator(settingOptionsButton).click();
    }

    public Locator getGoogleLoginForm(){ return page.locator(googleLoginForm);}
    public Locator getEmailInputField(){ return page.locator(emailInputField);}
    public Locator getMainLogo() { return page.locator(mainLogo); }
    public Locator getSearchInput() {
        page.locator(searchInput).waitFor();
        return  page.locator(searchInput); }
    public Locator getSearchButton() { return  page.locator(searchButton); }
    public Locator getGuideButton() { return  page.locator(guideButton); }

    public void sleep(Double sec){ page.waitForTimeout(sec); }
}
