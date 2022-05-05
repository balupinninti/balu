package com.Daimi.pages;

import org.testng.annotations.Test;

import com.Daimi.GenericLib.BaseTest;
import com.Daimi.GenericLib.FileLib;
import com.Daimi.GenericLib.WebDriverCommonLib;

public class verifyProductPage extends BaseTest{
	
	@Test
	public void productpage() throws Throwable
	{
		LoginPage lp=new LoginPage();
		FileLib fl=new FileLib();
		lp.loginToApp(fl.readPropertyData(PROP_PATH, "username"), fl.readPropertyData(PROP_PATH, "password"));
	WebDriverCommonLib wb=new WebDriverCommonLib();
		HomePage hp=new HomePage();
		hp.clickProductsTab();
		
		Thread.sleep(3000);
		
		createProductpage cp=new createProductpage();
	
		wb.elementDisplayed(cp.getProductText(), "create product page ");
		Thread.sleep(3000);
		String textbox=fl.readExcelData(EXCEL_PATH, "product", 1, 1);
		cp.productPage(textbox);
		cp.clickGoButton();
		Thread.sleep(3000);
		wb.switcToAlert();
		wb.switchToAlertText();
	    wb.acceptAlert();
		cp.clickArrowButton();
		
		
		
	}

}
