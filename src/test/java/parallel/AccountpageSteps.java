package parallel;

import org.junit.Assert;

import com.driverfactory.WebDriverFactory;
import com.pages.AccountPage;

import io.cucumber.java.en.*;

public class AccountpageSteps {
	
	public AccountPage accountPage;
	
	@When("User lands on Account Page")
	public void userIsonAccountPage() {
		accountPage = new AccountPage(WebDriverFactory.getDriver());
	}
	
	@Then("^User should verify the Navigation Items count as (\\d+)$")
	public void verifyNavItemCOunt(int count) {
		Assert.assertEquals(accountPage.getContNavItems(),count);
	}

}
