package com.Daimi.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Daimi.GenericLib.BaseTest;

public class HomePage {

	@FindBy(xpath = "//a[text()='Leads']") private WebElement leadTab;	
	@FindBy(xpath = "//a[text()='Accounts']") private WebElement accountsTab;
	@FindBy(xpath = "//a[text()='Contacts']") private WebElement contactsTab;
	@FindBy(xpath = "//a[text()='Potentials']") private WebElement potentilasTab;
	@FindBy(xpath = "//a[text()='Products']") private WebElement productsTab;
	
	 
	  public HomePage(){ 
		  PageFactory.initElements(BaseTest.driver, this); }
	  
	  public WebElement getLeadTab() { return leadTab; }
	  
	  public void clickLeadsTab(){ leadTab.click(); }
	  
	  public WebElement getaccountadd() { return accountsTab; }
	  
	  public void clickAccTab() { accountsTab.click(); } public WebElement
	  getcontactsTab() { return contactsTab; } public void clickconTab() {
	  contactsTab.click(); }
	 
	  public WebElement getpotentialTab() { return potentilasTab;
	  
	 } public void clickPotentialTab() { potentilasTab.click(); }
	 
	 public void clickProductsTab()
	 {
		 productsTab.click();
	 }
	 
	}

			
		
	

