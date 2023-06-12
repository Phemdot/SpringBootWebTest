package com.sba.SpringBootAuto.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = {"src/test/java/com/sba/SpringBootAuto/features"},
        glue = "com.sba.SpringBootAuto.steps"
)

public class TestRunner extends AbstractTestNGCucumberTests {




}
