package org.example.pages;

import org.example.base.BaseTest;

public class Pages extends BaseTest {

    private static HomePage homePage;
    private static SearchPage searchPage;

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
