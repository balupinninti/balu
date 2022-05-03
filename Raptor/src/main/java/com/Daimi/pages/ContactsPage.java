package com.Daimi.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Daimi.GenericLib.BaseTest;

public class ContactsPage {
	
	
	@FindBy(xpath = "//td[contains(text(),'Contacts: ')]") private WebElement contactsText;
	@FindBy(xpath = "//input[@value=\"New Contact\"]") private WebElement newContactButton;
	
	public ContactsPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}

	  public WebElement getcontextText()
	  {
		  return contactsText;
	  }
	  public WebElement getnewContactsButton()
	  {
		  return newContactButton;
	  }
	  
	  public void clickNewButton()
	  {
		  newContactButton.click();
	  }
}
