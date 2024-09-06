package parallel;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/parallel"}, glue = {"parallel"},
                            plugin = {"pretty","html:Reports/result.html", 
                            		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                           "timeline:test-output-thread/"},
                           tags = "@Regression or @Sanity or @Smoke",
                           publish = true)

public class ParallelRun extends AbstractTestNGCucumberTests{

	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios(){
		return super.scenarios();
	}

}
