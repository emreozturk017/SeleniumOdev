package com.testinium.page;

import com.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

public class ProductPage {

    Methods methods;
    Logger logger = LogManager.getLogger(ProductPage.class);
    public ProductPage(){

        methods = new Methods();

    }

    public void scrollAndSelect(){

        methods.sendKeys(By.id("search-input"),"oyuncak");
        methods.waitBySeconds(2);
        methods.click(By.cssSelector(".common-sprite.button-search"));
        methods.waitBySeconds(2);

        methods.scrollWithAction(By.id("product-494424"));
        methods.waitBySeconds(2);
        methods.click(By.id("product-494424"));
        methods.waitBySeconds(2);


        //methods.selectByText(By.cssSelector("select#review-sort-selection"),"Oylama (Düşük > Yüksek)");
        //methods.waitBySeconds(2);
    }

    public void attributeTest(){
        String attribute = methods.getAttribute(By.cssSelector(".logo-text>a>img"),"title");
        System.out.println("Alınan text "+attribute);
        logger.info("Alınan text"+attribute);
        methods.waitBySeconds(2);
    }

    public void textControlText(){

        String text = methods.getTest(By.cssSelector(".common-sprite"));
        System.out.println("Alınan text: "+text);
        logger.info("Alınan text: "+text);
        methods.waitBySeconds(2);
    }

    public void valueControlTest(){

        methods.sendKeys(By.id("search-input"),"oyuncak");
        String value = methods.getValue(By.id("search-input"));
        System.out.println("Alınan text"+value);
        logger.info("Alınan text"+value);
        Assert.assertEquals("oyuncak",value);
        methods.waitBySeconds(2);
    }


}
