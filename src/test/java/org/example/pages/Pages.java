package org.example.pages;

import org.example.base.BaseTest;

public class Pages extends BaseTest {

    private static HomePage homePage;
    private static SearchPage searchPage;
    private static UserPage userPage;
    private static ShortsPage shortsPage;

    public static ShortsPage getShortsPage(){
        if(shortsPage == null)
            shortsPage = new ShortsPage(page);
        return shortsPage;
    }

    public static UserPage getUserPage(){
        if(userPage == null)
            userPage = new UserPage(page);
        return userPage;
    }

    public static HomePage getHomePage(){
        if(homePage == null)
            homePage = new HomePage(page);
        return homePage;
    }

    public static SearchPage getSearchPage(){
        if (searchPage == null)
            searchPage = new SearchPage(page);
        return searchPage;
    }
}
