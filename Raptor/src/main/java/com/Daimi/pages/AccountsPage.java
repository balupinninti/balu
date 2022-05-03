package com.Daimi.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Daimi.GenericLib.BaseTest;

public class AccountsPage {

	@FindBy(xpath = "//td[contains(text(),'Accounts: ')]") private WebElement accountsText;
	@FindBy(xpath = "//input[@value=\"New Account\"]") private WebElement newAccountButton;

	public AccountsPage() {
		PageFactory.initElements(BaseTest.driver, this);
	}

	public WebElement getTextAdd() {
		return accountsText;
	}

	public WebElement getNewAccount() {
		return newAccountButton;
	}

	public void clickNewAccount() {
		newAccountButton.click();
	}
}
