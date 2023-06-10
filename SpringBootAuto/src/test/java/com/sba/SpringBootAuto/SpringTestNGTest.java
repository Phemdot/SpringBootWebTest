package com.sba.SpringBootAuto;

import com.sba.SpringBootAuto.pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.*;

@SpringBootTest
public class SpringTestNGTest extends AbstractTestNGSpringContextTests {

    @Autowired
    private WebDriver webDriver;

    @Autowired
    private MainPage mainPage;

    @Value("${app.url}")
    private String appUrl;

    @BeforeTest
    protected void setupWebDriver(){
        webDriver.navigate().to(appUrl);
    }

    @Test
    public void testLogin(){
        mainPage.performLogin();
    }

    @BeforeClass(alwaysRun = true)
    @BeforeSuite(alwaysRun = true)
    @Override
    protected void springTestContextPrepareTestInstance() throws Exception {
        super.springTestContextPrepareTestInstance();
    }

    @AfterTest
    protected void tearDown(){
        webDriver.close();
    }

}
