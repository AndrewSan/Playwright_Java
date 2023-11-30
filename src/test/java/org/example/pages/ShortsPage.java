package org.example.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import org.example.base.BaseTest;

public class ShortsPage extends BaseTest {
    private final Page page;
    public ShortsPage(Page page) {
        this.page = page;
    }

    private String youtubeShortsButton = "(//a[@title='YouTube Shorts'])[1]";
    private String shortsLikeButton = "(//ytd-toggle-button-renderer[@id='like-button'])[1]";
    private String shortsCommentButton = "(//div[@id='comments-button'])[1]";
    private String shortsShareButton = "(//div[@id='share-button'])[1]";

    public void clickOnYoutubeShortsButton(){
        page.locator(youtubeShortsButton).waitFor();
        page.locator(youtubeShortsButton).click();
    }

    public Locator getShortsLikeButton(){
        page.locator(shortsLikeButton).waitFor();
        return page.locator(shortsLikeButton);
    }
    public Locator getShortsCommentButton(){
        page.locator(shortsCommentButton).waitFor();
        return page.locator(shortsCommentButton);
    }
    public Locator getShortsShareButton(){
        page.locator(shortsShareButton).waitFor();
        return page.locator(shortsShareButton);
    }
}
