package com.Daimi.GenericLib;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class MyListeners implements ITestListener{

	
	ExtentSparkReporter spark;
	ExtentReports extent;
	ExtentTest test;
	public void onTestStart(ITestResult result) {
		//Reporter.log(result.getName()+" method started",true);
		test=extent.createTest(result.getName());
		test.info(MarkupHelper.createLabel(result.getName()+"is started", ExtentColor.BLUE));
	}

	
	public void onTestSuccess(ITestResult result) {
		//Reporter.log(result.getName()+" method passed",true);
		
		test=extent.createTest(result.getName());
		test.pass(MarkupHelper.createLabel(result.getName()+"is passed", ExtentColor.GREEN));
	}

	
	public void onTestFailure(ITestResult result) {
		//Reporter.log(result.getName()+" method failed",true);
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.getFullScreenshot("./screenshots/"+result.getName()+".jpg");
		test=extent.createTest(result.getName());
		test.fail(MarkupHelper.createLabel(result.getName()+"is failed", ExtentColor.RED));
	}

	
	public void onTestSkipped(ITestResult result) {
		//Reporter.log(result.getName()+" method skipped",true);
		test=extent.createTest(result.getName());
		test.skip(MarkupHelper.createLabel(result.getName()+"is started", ExtentColor.ORANGE));
	}

	
	public void onStart(ITestContext context) {
		//Reporter.log(context.getName()+" started",true);
		
		 spark=new ExtentSparkReporter("C:\\Users\\bala9\\git\\repository\\Raptor\\extentReport\\myreport.html");
	       extent=new ExtentReports();
			//give settings of report
	      spark.config().setDocumentTitle("raptor report");
			spark.config().setReportName("extent report");
			spark.config().setTheme(Theme.DARK);
			extent.attachReporter(spark);
			
		
	}


	public void onFinish(ITestContext context) {
		//Reporter.log(context.getName()+" ended",true);
		extent.flush();
	}

	
}
