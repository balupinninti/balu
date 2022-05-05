package com.Daimi.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.Daimi.GenericLib.BaseTest;
import com.Daimi.GenericLib.WebDriverCommonLib;

public class createProductpage {
	
	@FindBy(xpath = "//td[contains(text(),'Products: ')]") private WebElement productsText;
	
	@FindBy(xpath = "//input[@name=\"searchword\"]") private WebElement searchWordTextBox;
	@FindBy(xpath = "(//input[@value=\"Go\"])[1]") private WebElement goButton;
	@FindBy(xpath = "(//a[@class='sbCalNav'])[3]") private WebElement arrowButton;
	@FindBy(xpath = "//div[@id='calendarLayer']//td[@class='sbCalTitle' and contains(text(),'October')]") private WebElement centertext;
	
    

	public createProductpage()
	
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	public WebElement getProductText()
	
	{
		return productsText;
	}
	public WebElement getSearchWordTextBox() {
		return searchWordTextBox;
	}
	
	public WebElement getGoButton()
	{
		return goButton;
	}
	
       public void clickGoButton()
	{
		goButton.click();
	}
	public WebElement getCenterText() {
		return centertext;
	}
	
	public WebElement getArrowButton()
	{
		return arrowButton;
	}
	public void clickArrowButton()
	{
		
	for(int i=1;i<=12;i++)	
	{
		if(!centertext.isDisplayed())
		{
			Reporter.log("is not displayed");
			arrowButton.click();
		}
		else 
		{
			Reporter.log("October displayed");
			break;
		}
	}
		
	}
	
	public void productPage(String textbox)
	
	{
		searchWordTextBox.sendKeys(textbox);
		
	}
}
