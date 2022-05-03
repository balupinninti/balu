package com.Daimi.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Daimi.GenericLib.BaseTest;

public class PotentialsPages {
	
	
	@FindBy(xpath = "//td[contains(text(),'Potentials: ')]") private WebElement PotentialsPages;
	@FindBy(xpath = "//input[@value=\"New Potential\"]") private WebElement newPotentialButton;
	
public PotentialsPages()
{
	PageFactory.initElements(BaseTest.driver, this);
}
public WebElement getTextadd()
{
	return PotentialsPages;
	
}
public WebElement getPotentialButton()
{
	return newPotentialButton;
	
}
public void clickPotentialButton() {
	newPotentialButton.click();
}

}
