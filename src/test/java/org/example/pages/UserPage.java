package org.example.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.assertions.PlaywrightAssertions;
import org.example.base.BaseTest;
import org.example.base.Constans;

public class UserPage extends BaseTest {
    private final Page page;
    public UserPage(Page page) {
        this.page = page;
    }

    private String youButton = "(//div[@id='items']//a[@href='/feed/you'])[1]";
    private String promoMessageField = "(//div[@class='promo-message style-scope ytd-background-promo-renderer']//yt-formatted-string)[1]";
    private String promoLoginButton = "(//div[@class='style-scope ytd-background-promo-renderer']//a)[1]";
    private String historyButton = "(//div[@id='items']//a[@href='/feed/history'])[1]";
    private String historyUnavailableMessage = "//ytd-message-renderer//yt-formatted-string[@id='message']";
    private String loginMessageButton = "//div[@id='message-button']";

    public void clickOnYouButton(){
        page.locator(youButton).waitFor();
        page.locator(youButton).click();
    }

    public void clickOnHistoryButton(){
        page.locator(historyButton).waitFor();
        page.locator(historyButton).click();
    }

    public Locator getPromoMessageField(){
        page.locator(promoMessageField).waitFor();
        return page.locator(promoMessageField);
    }
    public Locator getPromoLoginButton(){
        page.locator(promoLoginButton).waitFor();
        return page.locator(promoLoginButton);
    }
    public Locator getHistoryUnavailableMessage(){
        page.locator(historyUnavailableMessage).waitFor();
        return page.locator(historyUnavailableMessage);
    }
    public Locator getLoginMessageButton(){
        page.locator(loginMessageButton).waitFor();
        return page.locator(loginMessageButton);
    }
}
