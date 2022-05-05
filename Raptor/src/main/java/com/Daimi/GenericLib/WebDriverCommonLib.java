package com.Daimi.GenericLib;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.google.common.io.Files;

public class WebDriverCommonLib

{
	public String getPageTitle() {
		String title = BaseTest.driver.getTitle();
		return title;
	}

	public void verify(String expected, String actual, String page) {
		Assert.assertEquals(actual, expected);
		Reporter.log(page + " is Displayed, PASS", true);
	}

	public void waitForPageTitle(String title) {
		WebDriverWait wait = new WebDriverWait(BaseTest.driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.titleContains(title));
	}

	public void selectOption(WebElement element, int index) {
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}

	public void selectOption(WebElement element, String value) {
		Select sel = new Select(element);
		sel.selectByValue(value);
	}

	public void selectOption(String text, WebElement element) {
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}

	public void switchToFrame(int index) {
		BaseTest.driver.switchTo().frame(index);
	}

	public void switchToFrame(String value) {
		BaseTest.driver.switchTo().frame(value);
	}

	public void switchToFrame(WebElement element) {
		BaseTest.driver.switchTo().frame(element);
	}
public void switcToAlert()
{
	BaseTest.driver.switchTo().alert();
	
}
public void acceptAlert()
{
	BaseTest.driver.switchTo().alert().accept();
}
public void dismissAlert()
{
	BaseTest.driver.switchTo().alert().dismiss();
}
   public String switchToAlertText() {
	return BaseTest.driver.switchTo().alert().getText();
}
   
   
   public Point getElementLocation(WebElement element)
   {
	   return element.getLocation();
   }
	public void mouseHover(WebElement element) {
		Actions ac = new Actions(BaseTest.driver);
		ac.moveToElement(element).perform();
	}

	public void rightClick(WebElement element) {
		Actions ac = new Actions(BaseTest.driver);
		ac.contextClick(element).perform();
	}

	public void getFullScreenshot(String path) {
		TakesScreenshot ts = (TakesScreenshot) BaseTest.driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(path);
		try {
			Files.copy(src, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void executeJavaScript(String script) {
		JavascriptExecutor jse = (JavascriptExecutor) BaseTest.driver;
		jse.executeScript(script);
	}

	public void elementDisplayed(WebElement element , String elementName) {
		if (element.isDisplayed()) {
			Assert.assertTrue(true);
			Reporter.log(elementName + "is displayed", true);
		} else {
			Reporter.log(elementName + "is not displayed", true);
			Assert.assertTrue(false);

		}
	}


public void switchToWindow(WebElement element,String expectedTitle)
{
	Set<String> allwhs=BaseTest.driver.getWindowHandles();
	for(String wh:allwhs)
	{
		String actualTitle=BaseTest.driver.switchTo().window(wh).getTitle();
		if(actualTitle.contains(expectedTitle))
		{
			element.click();
			break;
		}
		else {
			Reporter.log("title not found");
		}
	}
}


	
}