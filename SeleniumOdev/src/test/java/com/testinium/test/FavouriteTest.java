package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.driver.BaseTest;
import com.testinium.page.LoginPage;
import com.testinium.page.ProductPage;
import com.testinium.page.FavouritePage;
import org.junit.Test;

public class FavouriteTest extends BaseTest {

    @Test
    public void favouriteTest(){

    FavouritePage favouritePage = new FavouritePage();
    favouritePage.favoriteSelect();
    }

    @Test
    public void getListTest(){

        FavouritePage favouritePage = new FavouritePage();
        favouritePage.favoriteList();


    }




}
