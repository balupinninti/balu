package com.Daimi.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Daimi.GenericLib.BaseTest;
import com.Daimi.GenericLib.WebDriverCommonLib;

public class CreateNewLeadPage {
	
	@FindBy(xpath = "//select[@name=\"property(saltName)\"]") private WebElement firstnamedropdown;
	@FindBy(xpath = "//input[@name=\"property(First Name)\"]") private WebElement firstnametextbox;
	@FindBy(xpath = "//input[@name=\"property(Company)\"]") private WebElement companytextbox;
	@FindBy(xpath = "//input[@name=\"property(Last Name)\"]") private WebElement lastnametextbox;
	@FindBy(xpath = "//select[@name=\"property(Lead Source)\"]") private WebElement leadsourcedropdown;
	@FindBy(xpath = "(//input[@value=\"Save\"])[1]") private WebElement savebutton;
	
public CreateNewLeadPage()
{
	PageFactory.initElements(BaseTest.driver, this);
}

public WebElement getFirstnamedropdown() {
	return firstnamedropdown;
}


public WebElement getFirstnametextbox() {
	return firstnametextbox;
}


public WebElement getCompanytextbox() {
	return companytextbox;
}


public WebElement getLastnametextbox() {
	return lastnametextbox;
}


public WebElement getLeadsourcedropdown() {
	return leadsourcedropdown;
}


public WebElement getSavebutton() {
	return savebutton;
}


public void createnewlead(String saltext,String fn,String company,String ln,String leadsource)
{ 
	WebDriverCommonLib wlib=new WebDriverCommonLib();
	wlib.selectOption(saltext, firstnamedropdown);
	firstnametextbox.sendKeys(fn);
	companytextbox.sendKeys(company);
	lastnametextbox.sendKeys(ln);
	wlib.selectOption(leadsource, leadsourcedropdown);
	savebutton.click();
	
	
	
	
}
}
