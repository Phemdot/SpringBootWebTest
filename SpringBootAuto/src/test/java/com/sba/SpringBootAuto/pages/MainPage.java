package com.sba.SpringBootAuto.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MainPage extends BasePage{
    @Autowired
    private LoginPage loginPage;

    @Autowired
    private HomePage homePage;

    public void performLogin(){
        homePage.clickLogin();
        loginPage.doLogin("admin", "password");
        loginPage.clickLogin();
    }

    /*
    public void clickLogin(){
        lnkLogin.click();
    }

     */

}
