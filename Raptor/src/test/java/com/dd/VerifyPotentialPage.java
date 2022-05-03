package com.dd;


import org.testng.annotations.Test;

import com.Daimi.GenericLib.BaseTest;
import com.Daimi.GenericLib.FileLib;
import com.Daimi.GenericLib.WebDriverCommonLib;
import com.Daimi.pages.CreateNewPotentialPages;
import com.Daimi.pages.HomePage;
import com.Daimi.pages.LoginPage;
import com.Daimi.pages.PotentialsPages;

public class VerifyPotentialPage extends BaseTest{
	@Test
	public  void newPotials() throws Throwable
	{
		
		LoginPage lp=new LoginPage();
		FileLib fl=new FileLib();
		lp.loginToApp(fl.readPropertyData(PROP_PATH, "username"),fl.readPropertyData(PROP_PATH, "password"));
		
		WebDriverCommonLib wbb=new WebDriverCommonLib();
        lp.getTitle();
		
		
		
        HomePage hp=new HomePage();
		hp.clickPotentialTab();
		 wbb.getPageTitle();
		
		PotentialsPages pp=new PotentialsPages();
		WebDriverCommonLib wb=new WebDriverCommonLib();
		wb.elementDisplayed(pp.getTextadd(), "add displayed");
		
		PotentialsPages p=new PotentialsPages();
		p.clickPotentialButton();
		
		Thread.sleep(5000);
		
		FileLib fll=new FileLib();
		CreateNewPotentialPages cp=new CreateNewPotentialPages();
		String pn=fll.readExcelData(EXCEL_PATH, "Potentials", 0, 1);
		String tt=fll.readExcelData(EXCEL_PATH, "Potentials", 1, 1);
		String ac=fll.readExcelData(EXCEL_PATH, "Potentials", 2, 1);
		String cd=fll.readExcelData(EXCEL_PATH, "Potentials", 3, 1);
		cp.newPotentialKey(pn, tt, ac, cd);
		
		
		
	}

}
