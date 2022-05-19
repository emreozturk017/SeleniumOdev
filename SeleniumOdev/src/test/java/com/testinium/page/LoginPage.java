package com.testinium.page;

import com.testinium.methods.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginPage {

    Methods methods;

    public LoginPage(){

        methods = new Methods();
    }

    public void  login(){

        methods.click(By.xpath("//div[@class='menu-top-button login']"));
        methods.waitBySeconds(1);

        methods.sendKeys(By.id("login-email"),"emreozturk0017@gmail.com");          //email location
        methods.waitBySeconds(1);
        methods.sendKeys(By.xpath("//input[@id='login-password']"),"12345678");       //şifre location
        methods.waitBySeconds(5);
        methods.click(By.cssSelector(".ky-btn.ky-btn-orange.w-100.ky-login-btn"));              //giriş yap butonu
        methods.waitBySeconds(3);

        Assert.assertTrue(methods.isElementVisible(By.xpath("//input[@id='search-input']")));
    }




}
