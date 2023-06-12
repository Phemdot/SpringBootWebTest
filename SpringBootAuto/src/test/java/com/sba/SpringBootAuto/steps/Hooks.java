package com.sba.SpringBootAuto.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;

public class Hooks {

    @Autowired
    private WebDriver webDriver;

    @Before
    public void InitializeTest(Scenario scenario) {
        webDriver.navigate().to("http://eaapp.somee.com/");
    }

    @After
    public void TearDownTest(Scenario scenario) {
        if (scenario.isFailed()) {
            //Take screenshot logic goes here
            System.out.println(scenario.getName());
        }
        webDriver.quit();
    }

}
