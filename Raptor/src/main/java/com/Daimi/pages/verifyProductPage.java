package com.Daimi.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
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
//		String textbox=fl.readExcelData(EXCEL_PATH, "product", 1, 1);
//		cp.productPage(textbox);
//		cp.clickGoButton();
//		Thread.sleep(3000);
//		wb.switcToAlert();
//		System.out.println(wb.switchToAlertText());
//	    wb.acceptAlert();
//	    Thread.sleep(3000);
		//cp.clickArrowButton();
		WebElement arrowButton = driver.findElement(By.xpath("(//a[@class='sbCalNav'])[3]"));
		WebElement centertext = driver.findElement(By.xpath("//div[@id='calendarLayer']//td[@class='sbCalTitle' and contains(text(),'May')]"));
		
		
		for(int i=1;i<=12;i++)	
		{
			arrowButton.click();
			if(centertext.isDisplayed())
			{
				Reporter.log("is  displayed");
				//arrowButton.click();
				break;
			}
			/*else 
			{
				Reporter.log("October displayed");
				break;
			}*/
		}
		Thread.sleep(3000);
		
		
		
	}

}
