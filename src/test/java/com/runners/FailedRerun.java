package com.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@CucumberOptions(features = {"@target/failedCases.txt"}, glue = {"com.stepdefinitions","com.hooks"},
plugin = {"pretty","html:Reports/result.html", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		 },
        publish = true)//"rerun:target/failedCases.txt"
@RunWith(Cucumber.class)
public class FailedRerun {

}
