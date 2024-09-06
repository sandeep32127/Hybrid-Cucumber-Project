package com.stepdefinitions;

import org.junit.Assert;

import com.driverfactory.WebDriverFactory;
import com.pages.LoginPage;

import io.cucumber.java.en.*;

public class LoginPageSteps {
	
	public LoginPage loginPage = new LoginPage(WebDriverFactory.getDriver());
	public static String title;
	
	
	@Given("User is on Login Page")
	public void user_is_on_login_page() {
		WebDriverFactory.getDriver().get("https://magento.softwaretestingboard.com/customer/account/login/");
	}

	@When("User gets the title of the page")
	public void user_gets_the_titile_of_the_page() {
		title = loginPage.getTitle();
	}

	@Then("^The title of the page should be (.*)$")
	public void the_title_of_the_page_should_be_customer_login(String titleExpected) {
	    Assert.assertEquals(title, titleExpected);
	}
	
	@Then("Forgot Password link should be displayed")
	public void verifyForgotPWDLink() {
		Assert.assertTrue(loginPage.verifyForgotPWDLink());;
	}
	
	@Given("^User enters the user name (.*)$")
	public void enterUname(String email) {
		loginPage.enterUname(email);
	}
	
	@Given("^User enters the password (.*)$")
	public void enterPWD(String password) {
		loginPage.enterPWD(password);
	}
	
	@When("User enters the login button")
	public void clickLogin() {
		loginPage.clickLogoin();
	}
	
	@Given("^User logins with correct credentials (.*) (.*)$")
	public void login(String email, String password) {
		loginPage.login(email, password);
	}

}
