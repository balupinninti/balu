package com.Daimi.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Daimi.GenericLib.BaseTest;
import com.Daimi.GenericLib.WebDriverCommonLib;

public class CreateNewContactsPage {
	
	@FindBy(xpath = "//select[@name=\"property(saltName)\"]") private WebElement firstNmaeDropDown;
	@FindBy(xpath = "//input[@name=\"property(First Name)\"]") private WebElement firstNameTextBox;
	@FindBy(xpath = "//input[@name=\"property(Other Phone)\"]") private WebElement phoneNumberTextBox;
	@FindBy(xpath = "(//input[@name=\"Button\"])[1]") private WebElement saveBUtton;
	
	public CreateNewContactsPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}

	public WebElement getFirstNmaeDropDown() {
		return firstNmaeDropDown;
	}

	public void setFirstNmaeDropDown(WebElement firstNmaeDropDown) {
		this.firstNmaeDropDown = firstNmaeDropDown;
	}
 
	public WebElement getFirstNameTextBox() {
		return firstNameTextBox;
	}

	public void setFirstNameTextBox(WebElement firstNameTextBox) {
		this.firstNameTextBox = firstNameTextBox;
	}

	public WebElement getPhoneNumberTextBox() {
		return phoneNumberTextBox;
	}

	public void setPhoneNumberTextBox(WebElement phoneNumberTextBox) {
		this.phoneNumberTextBox = phoneNumberTextBox;
	}

	public WebElement getSaveBUtton() {
		return saveBUtton;
	}

	public void setSaveBUtton(WebElement saveBUtton) {
		this.saveBUtton = saveBUtton;
	}
public void createNewConntacts(String fd,String ft,String ph)
{
	WebDriverCommonLib wlib=new WebDriverCommonLib();
	wlib.selectOption(fd,firstNmaeDropDown);
	firstNameTextBox.sendKeys(ft);
	phoneNumberTextBox.sendKeys(ph);
	saveBUtton.click();
	
}
}
