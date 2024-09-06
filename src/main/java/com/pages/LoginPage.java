package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	private WebDriver driver;
	
	@FindBy(xpath = "//div[@class = 'actions-toolbar']/descendant::div[@class = 'primary']/following-sibling::div[@class='secondary']/child::a/span")
	private WebElement lnkFOrgotPWD;
	
	@FindBy(css = "#email")
	private WebElement inputEmail;
	
	@FindBy(css = "#pass")
	private WebElement inputPwd;
	
	@FindBy(css = "#send2")
	private WebElement btnLogin;
	
	public LoginPage(WebDriver driverReceived) {
		this.driver = driverReceived;
		PageFactory.initElements(driver, this);
	}
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	public boolean verifyForgotPWDLink() {
		return lnkFOrgotPWD.isDisplayed();
	}
	
	public void login(String uName, String password) {
		enterUname(uName);
		enterPWD(password);
		clickLogoin();
	}
	
	public void enterUname(String uName) {
		inputEmail.clear();
		inputEmail.sendKeys(uName);
	}
	
	public void enterPWD(String password) {
		inputPwd.clear();
		inputPwd.sendKeys(password);
	}
	
	public void clickLogoin() {
		btnLogin.click();
	}

}
