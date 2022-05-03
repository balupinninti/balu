package com.Daimi.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Daimi.GenericLib.BaseTest;
import com.Daimi.GenericLib.FileLib;
import com.Daimi.GenericLib.WebDriverCommonLib;

public class CreateNewAccountsPage {
	
	@FindBy(xpath = "//input[@name=\"property(Account Name)\"]") private WebElement accountNameTextBox;
    @FindBy(xpath = "//input[@name=\"property(Account Site)\"]") private WebElement accountSiteTextBox;
    @FindBy(xpath = "//select[@name=\"property(Account Type)\"]") private WebElement accountTypeDropDown;
    @FindBy(xpath = "//select[@name=\"property(Industry)\"]") private WebElement industryDropDown;
    @FindBy(xpath = "//input[@name=\"property(Annual Revenue)\"]") private WebElement annualRevenue;
    @FindBy(xpath = "//input[@name=\"property(Phone)\"]") private WebElement phoneTextBox;
    @FindBy(xpath = "(//input[@name=\"Button\"])[1]") private WebElement saveButton;
    @FindBy(xpath = "//img[@title='Account Name Lookup']") private WebElement parentAccountImage;
    @FindBy(xpath = "(//table)[4]//tr[2]//td[1]") private WebElement AcccountNamelink;
    
public CreateNewAccountsPage()
{
	PageFactory.initElements(BaseTest.driver, this);
}

public WebElement getAccountNameTextBox() {
	return accountNameTextBox;
}

//public void setAccountNameTextBox(WebElement accountNameTextBox) {
	//this.accountNameTextBox = accountNameTextBox;
//}

public WebElement getAccountSiteTextBox() {
	return accountSiteTextBox;
}

//public void setAccountSiteTextBox(WebElement accountSiteTextBox) {
	//this.accountSiteTextBox = accountSiteTextBox;
//}

public WebElement getAccountTypeDropDown() {
	return accountTypeDropDown;
}

//public void setAccountTypeDropDown(WebElement accountTypeDropDown) {
	//this.accountTypeDropDown = accountTypeDropDown;
//}

public WebElement getIndustryDropDown() {
	return industryDropDown;
}

//public void setIndustryDropDown(WebElement industryDropDown) {
	//this.industryDropDown = industryDropDown;
//}

public WebElement getAnnualRevenue() {
	return annualRevenue;
}

//public void setAnnualRevenue(WebElement annualRevenue) {
	//this.annualRevenue = annualRevenue;
//}

public WebElement getPhoneTextBox() {
	return phoneTextBox;
}

//public void setPhoneTextBox(WebElement phoneTextBox) {
	//this.phoneTextBox = phoneTextBox;
	
	
//}


public WebElement getSaveButton() {
	return saveButton;
}

public void setSaveButton(WebElement saveButton) {
	this.saveButton = saveButton;
	
}
public WebElement getAccountLink() {
	return AcccountNamelink;
	
}



public void createNewAccount(String an,String as,String at,String id,String ar,String number,String expectedTiltle
		) throws InterruptedException
{
	WebDriverCommonLib wlib=new WebDriverCommonLib();
	FileLib flib= new FileLib();
	String parentwindow=BaseTest.driver.getWindowHandle();
	accountNameTextBox.sendKeys(an);
	accountSiteTextBox.sendKeys(as);
	wlib.selectOption(at, accountTypeDropDown);
	wlib.selectOption(id, industryDropDown);
	annualRevenue.sendKeys(ar);
	phoneTextBox.sendKeys(number);
//	saveButton.click();
	parentAccountImage.click();
	wlib.switchToWindow(AcccountNamelink, expectedTiltle);
	Thread.sleep(2000);
	BaseTest.driver.switchTo().window(parentwindow);
	saveButton.click();
}
	public WebElement getParentAccountImage()
	{
		
		return parentAccountImage;
		
	}
	public void clickParentAccountImage() {
		parentAccountImage.click();
	}
	

	
	
	
}
