package parallel;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.driverfactory.WebDriverFactory;
import com.utils.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	
	private ConfigReader configReader;
	private String browserName;
	private WebDriverFactory driverFactory;
	private WebDriver driver;
	int num;
	
	@Before(order = 0)
	public void setConfig() {
		configReader = new ConfigReader();
		browserName = configReader.getProperty("browser");
		num = 2;
		System.out.println("+++++++++"+num);
	}
	
	@Before(order = 1)
	public void launchBrowser() {
		driverFactory = new WebDriverFactory();
		driver = driverFactory.initDriver(browserName);
		System.out.println("++++------"+num);
	}
	
	@After(order = 0)
	public void quitDriver() {
		driver.quit();
	}
	
	@After(order = 1)
	public void attachScreenShot(Scenario sc) {
		if(sc.isFailed()) {
			String screenShotName = sc.getName();
			byte[] screenshotAs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			sc.attach(screenshotAs, "image/png", screenShotName);
		}
	}

}
