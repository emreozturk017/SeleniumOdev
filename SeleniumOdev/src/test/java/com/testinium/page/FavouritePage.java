package com.testinium.page;

import com.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class FavouritePage {


    Methods methods;
    //Logger logger = LogManager.getLogger(FavouritePage.class);

    public FavouritePage(){

        methods = new Methods();
    }

    public void favoriteSelect(){

        methods.sendKeys(By.id("search-input"),"oyuncak");
        methods.waitBySeconds(2);
        methods.click(By.cssSelector(".common-sprite.button-search"));
        methods.waitBySeconds(2);

        methods.click(By.xpath("(//a[@class='add-to-favorites'])[4]"));
        methods.click(By.xpath("(//a[@class='add-to-favorites'])[3]"));
        methods.click(By.xpath("(//a[@class='add-to-favorites'])[2]"));
        methods.click(By.xpath("(//a[@class='add-to-favorites'])[1]"));
        methods.waitBySeconds(2);
    }

    public void favoriteList(){

        methods.selectByText(By.cssSelector(".common-sprite"),"Favorilerim");
    }



}
