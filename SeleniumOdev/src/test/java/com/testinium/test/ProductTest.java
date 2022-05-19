package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.page.LoginPage;
import com.testinium.page.ProductPage;
import org.junit.Test;

public class ProductTest extends BaseTest {

    @Test
    public void productTest(){

        ProductPage productPage = new ProductPage();
        productPage.scrollAndSelect();
    }

    @Test

    public void getAttributeTest(){

        ProductPage productPage = new ProductPage();
        productPage.attributeTest();
    }

    @Test
    public void getTextTest(){
        LoginPage loginPage = new LoginPage();
        ProductPage productPage = new ProductPage();

        loginPage.login();
        productPage.textControlText();
    }

    @Test

    public void valueTest(){

        ProductPage productPage = new ProductPage();

        productPage.valueControlTest();
    }

}
