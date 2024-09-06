package com.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {
	
	private WebDriver driver;
	
	@FindBy(xpath = "//div[@id = 'block-collapsible-nav']//li")
	private List<WebElement> lstNavItems;
	
	
	public AccountPage(WebDriver driverReceived) {
		this.driver = driverReceived;
		PageFactory.initElements(driver, this);
	}
	
	public int getContNavItems() {
		return lstNavItems.size();
	}
}
