package org.example.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.assertions.PlaywrightAssertions;
import org.example.base.BaseTest;
import org.example.base.Constans;

public class SearchPage extends BaseTest {
    private final Page page;
    public SearchPage(Page page) {
        this.page = page;
    }

    private String searchInput = "//input[@id='search']";
    private String searchButton = "//button[@id='search-icon-legacy']";
    private String searchNameResultTextFiled = "(//*[contains(text(),'Wiz Khalifa - See You Again ft. Charlie Puth [Official Video] Furious 7 Soundtrack')])[1]";
    private String searchYearsResultTextFiled = "(//*[contains(text(),'3:58')])[1]";
    private String subscribeButton = "//yt-button-shape[@id='subscribe-button-shape']";
    private String likeButton = "(//like-button-view-model[@class='YtLikeButtonViewModelHost'])[1]";
    private String dislikeButton = "(//dislike-button-view-model[@class='YtDislikeButtonViewModelHost'])[1]";


    public void clickOnFoundVideo(){page.locator(searchNameResultTextFiled).click();}
    public void isSearchResultTextFiledVisible(){
        PlaywrightAssertions.assertThat(page.locator(searchNameResultTextFiled)).isVisible();
    }
    public void isSearchYearsResultTextFiledVisible(){
        PlaywrightAssertions.assertThat(page.locator(searchYearsResultTextFiled)).isVisible();
    }
    public void ckickOnSearchButton(){ page.locator(searchButton).click(); }
    public void typeInSearchInput() { page.locator(searchInput).type(Constans.searchText); }
    public Locator getSubscribeButton(){
        page.locator(subscribeButton).waitFor();
        return page.locator(subscribeButton);}
    public Locator getLikeButton(){
        page.locator(likeButton).waitFor();
        return page.locator(likeButton);}
    public Locator getDislikeButton(){
        page.locator(dislikeButton).waitFor();
        return page.locator(dislikeButton);}

}
