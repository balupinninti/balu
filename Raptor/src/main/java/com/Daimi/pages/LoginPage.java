package com.Daimi.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Daimi.GenericLib.BaseTest;
import com.Daimi.GenericLib.WebDriverCommonLib;

public class LoginPage {
	
	@FindBy(id="userName") private WebElement untb;
	@FindBy(id="passWord") private WebElement pwtb;
	@FindBy(xpath ="//input[@title=\"Sign In\"]") private WebElement signbt;
	
	public  LoginPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
		
	}
	public void loginToApp(String username,String password)
	{
		untb.sendKeys(username);
		pwtb.sendKeys(password);
		signbt.click();
		
	}
	
	public WebElement getUntb() {
		return untb;
	}
	
	
	public WebElement getPwtb() {
		return pwtb;
	}
	

	public WebElement getSignbt() {
		return signbt;
	}
	
		public void getTitle()
		{
			WebDriverCommonLib wb=new WebDriverCommonLib();
		    wb.getPageTitle();
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	


