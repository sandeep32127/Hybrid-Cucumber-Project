package com.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/features/LoginPage.feature"}, glue = {"com.stepdefinitions","com.hooks"},
                 plugin = {"pretty","html:Reports/result.html", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                		 "timeline:test-output-thread/",
                		 "rerun:target/failedCases.txt"},
                 //tags = "not @Sanity",
                 publish = true)
@RunWith(Cucumber.class)
public class TestRunner {

}
