package com.dd;


import javax.lang.model.element.Element;

import org.testng.annotations.Test;

import com.Daimi.GenericLib.BaseTest;
import com.Daimi.GenericLib.FileLib;
import com.Daimi.GenericLib.WebDriverCommonLib;
import com.Daimi.pages.ContactsPage;
import com.Daimi.pages.CreateNewContactsPage;
import com.Daimi.pages.HomePage;
import com.Daimi.pages.LoginPage;

public class VerifyContactsPgae extends BaseTest {
	@Test
	public void contacts() throws Throwable
	{
		LoginPage lp=new LoginPage();
				FileLib flib=new FileLib();
		lp.loginToApp(flib.readPropertyData(PROP_PATH ,"username"), flib.readPropertyData(PROP_PATH, "password"));
		
		HomePage hp=new HomePage();
		hp.clickconTab();
		
		ContactsPage cp=new ContactsPage();
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.elementDisplayed(cp.getcontextText(), "contactspage");
		
		ContactsPage cap=new ContactsPage();
		cap.clickNewButton();
		FileLib flib1=new FileLib();
		CreateNewContactsPage cnn=new CreateNewContactsPage();
		String fd=flib1.readExcelData(EXCEL_PATH, "Contacts", 0, 1);
		String ft=flib1.readExcelData(EXCEL_PATH, "Coacts", 1, 1);
		String ph=flib.readExcelData(EXCEL_PATH, "Contacts", 2, 1);
		cnn.createNewConntacts(fd, ft, ph);
	
		
	}

}
