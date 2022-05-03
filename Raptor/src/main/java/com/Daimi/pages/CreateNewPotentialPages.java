package com.Daimi.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Daimi.GenericLib.BaseTest;
import com.Daimi.GenericLib.FileLib;
import com.Daimi.GenericLib.WebDriverCommonLib;

public class CreateNewPotentialPages {
	
	
	@FindBy(xpath = "//input[@name=\"property(Potential Name)\"]") private WebElement potentialNmaeTextBox;
	@FindBy(xpath = "//select[@name=\"property(Type)\"]") private WebElement typeDropDownTextBox;
	@FindBy(xpath = "//input[@name=\"property(Account Name)\"]") private WebElement accountNameTextBox;
	@FindBy(xpath = "//input[@name=\"property(Closing Date)\"]") private WebElement closingDateTextBox;
	@FindBy(xpath = "(//input[@name=\"Button\"])[1]") private WebElement saveButton;
	
public CreateNewPotentialPages()
{
	PageFactory.initElements(BaseTest.driver, this);
}

public WebElement getPotentialNmaeTextBox() {
	return potentialNmaeTextBox;
}

public void setPotentialNmaeTextBox(WebElement potentialNmaeTextBox) {
	this.potentialNmaeTextBox = potentialNmaeTextBox;
}

public WebElement getTypeDropDownTextBox() {
	return typeDropDownTextBox;
}

public void setTypeDropDownTextBox(WebElement typeDropDownTextBox) {
	this.typeDropDownTextBox = typeDropDownTextBox;
}

public WebElement getAccountNameTextBox() {
	return accountNameTextBox;
}

public void setAccountNameTextBox(WebElement accountNameTextBox) {
	this.accountNameTextBox = accountNameTextBox;
}

public WebElement getClosingDateTextBox() {
	return closingDateTextBox;
}

public void setClosingDateTextBox(WebElement closingDateTextBox) {
	this.closingDateTextBox = closingDateTextBox;
}

public WebElement getSaveButton() {
	return saveButton;
}

public void setSaveButton(WebElement saveButton) {
	this.saveButton = saveButton;
}
public void newPotentialKey(String pn,String tt,String ac,String cd)
{
	WebDriverCommonLib wl=new WebDriverCommonLib();
	potentialNmaeTextBox.sendKeys(pn);
	wl.selectOption(tt, typeDropDownTextBox);
	accountNameTextBox.sendKeys(ac);
	closingDateTextBox.sendKeys(cd);
	saveButton.click();
	
}



}

