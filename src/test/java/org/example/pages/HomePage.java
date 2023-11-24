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

    public Locator getMainLogo() { return page.locator(mainLogo); }
    public Locator getSearchInput() { return  page.locator(searchInput); }
    public Locator getSearchButton() { return  page.locator(searchButton); }
    public Locator getGuideButton() { return  page.locator(guideButton); }
}
