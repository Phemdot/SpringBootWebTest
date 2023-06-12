package com.sba.SpringBootAuto.steps;

import com.sba.SpringBootAuto.pages.HomePage;
import com.sba.SpringBootAuto.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;

import java.util.List;
import java.util.Map;

public class LoginSteps {

    @Autowired
    public HomePage homePage;

    @Autowired
    public LoginPage loginPage;

    @Given("^I click Login in the Home page$")
    public void iNavigateToTheLoginPage() throws Throwable {
        homePage.clickLogin();
    }

    @And("^I enter the following for Login$")
    public void iEnterTheFollowingForLogin(DataTable table) throws Throwable {
        var data = table.asList();
        loginPage.doLogin(data.get(2), data.get(3));
    }

    @And("^I click login button$")
    public void iClickLoginButton() throws Throwable {
        loginPage.clickLogin();
    }

    @Then("^I should see the userform page$")
    public void iShouldSeeTheUserformPage() throws Throwable {
        Assert.assertEquals(homePage.isEmployeeDetailsExist(), true);
    }

    @Then("^I should see the userform page wrongly$")
    public void iShouldSeeTheUserformPageWrongly() throws Throwable {
    }

    @DataTableType(replaceWithEmptyString = "[blank]")
    public User convert(Map<String, String> entry){

        return null;
    }

    @And("^I enter ([^\"]*) and ([^\"]*)$")
    public void iEnterUsernameAndPassword(String userName, String password) throws Throwable {
    }

    public class User {
        public String username;
        public String password;

    }










}
