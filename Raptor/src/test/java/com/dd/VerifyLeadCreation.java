package com.dd;


import org.testng.annotations.Test;

import com.Daimi.GenericLib.BaseTest;
import com.Daimi.GenericLib.FileLib;
import com.Daimi.GenericLib.WebDriverCommonLib;
import com.Daimi.pages.CreateNewLeadPage;
import com.Daimi.pages.HomePage;
import com.Daimi.pages.LeadsPage;

public class VerifyLeadCreation extends BaseTest{
	
	@Test
	public void verifyleadcreationtext() throws Throwable
	{
	
	ValidLoginTest vl=new ValidLoginTest();
	vl.verifyloginTest();
	HomePage hp=new HomePage();
	hp.clickLeadsTab();
	
	Thread.sleep(4000);
	WebDriverCommonLib wlib=new WebDriverCommonLib();
	LeadsPage lp=new LeadsPage();
	wlib.elementDisplayed(lp.getLeadstxt(),"leadspage");
	lp.clickleadbutton();
	Thread.sleep(4000);
	FileLib flib=new FileLib();
	//wlib.verify(flib.readPropertyData(PROP_PATH, "createLeadTitle");
	//wlib.getPageTitle(),
//	"create leads page")
	CreateNewLeadPage cl=new CreateNewLeadPage();
	String saltext=flib.readExcelData(EXCEL_PATH, "Leads", 0, 1);
	String fn=flib.readExcelData(EXCEL_PATH, "Leads", 1, 1);
	String company=flib.readExcelData(EXCEL_PATH, "Leads", 2, 1);
	String ln=flib.readExcelData(EXCEL_PATH, "Leads", 3, 1);
	String leadsource=flib.readExcelData(EXCEL_PATH, "Leads", 4, 1);
	cl.createnewlead(saltext, fn, company, ln, leadsource);
			
	
	
	
	
	
	
	
	
	
	
	}
}
