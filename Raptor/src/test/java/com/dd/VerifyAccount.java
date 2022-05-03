package com.dd;


import org.testng.annotations.Test;

import com.Daimi.GenericLib.BaseTest;
import com.Daimi.GenericLib.FileLib;
import com.Daimi.GenericLib.WebDriverCommonLib;
import com.Daimi.pages.AccountsPage;
import com.Daimi.pages.CreateNewAccountsPage;
import com.Daimi.pages.HomePage;
import com.Daimi.pages.LoginPage;

public class VerifyAccount extends BaseTest{

@Test
	public void account() throws Throwable
	{

		 LoginPage lp=new  LoginPage();
		 FileLib fl= new FileLib();
		 lp.loginToApp(fl.readPropertyData(PROP_PATH, "username"), fl.readPropertyData(PROP_PATH, "password"));
		 Thread.sleep(4000);
		 
		 HomePage hp=new HomePage();
		 hp.clickAccTab();
		 
		 AccountsPage ap=new AccountsPage();
		 WebDriverCommonLib wlib=new WebDriverCommonLib();
		 wlib.elementDisplayed(ap.getTextAdd(), "accotntspage");
		 
		 AccountsPage asp=new AccountsPage();
		 asp.clickNewAccount();
		 Thread.sleep(4000);
		 FileLib flib=new FileLib();
		 
		 
		 Thread.sleep(5000);
		 CreateNewAccountsPage cn=new CreateNewAccountsPage();
		 String an=flib.readExcelData(EXCEL_PATH, "Accounts", 0, 1);
		 String as=flib.readExcelData(EXCEL_PATH, "Accounts", 1, 1);
	
		 String at=flib.readExcelData(EXCEL_PATH, "Accounts", 2, 1);
	
		 String  id=flib.readExcelData(EXCEL_PATH, "Accounts", 3, 1);
		 String  ar=flib.readExcelData(EXCEL_PATH, "Accounts", 4, 1);
		 String number=flib.readExcelData(EXCEL_PATH, "Accounts", 5, 1);
		 String expectedTitle=flib.readPropertyData(PROP_PATH, "accNameLookUp");
		 cn.createNewAccount(an,as,at,id,ar,number,expectedTitle);
		 Thread.sleep(3000);
		 wlib.switchToWindow(cn.getAccountLink(), flib.readPropertyData(PROP_PATH, "accNameLookUp"));
	}
}




