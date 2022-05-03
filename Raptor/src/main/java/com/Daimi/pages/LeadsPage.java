package com.Daimi.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Daimi.GenericLib.BaseTest;

public class LeadsPage {
	@FindBy(xpath = "//td[contains(text(),'Leads: ')]") private WebElement leadstxt;
	@FindBy(xpath = "//input[@value=\"New Lead\"]") private WebElement newleadsbutton;
	public LeadsPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}

	public WebElement getLeadstxt() {
		return leadstxt;
	}


	public void clickleadbutton() {
    newleadsbutton.click();
	}

	
	}

	
	


