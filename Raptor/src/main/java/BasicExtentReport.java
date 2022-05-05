import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class BasicExtentReport {

	public static void main(String[] args) 
	{
		//set path of report
		ExtentSparkReporter spark=new ExtentSparkReporter("C:\\Users\\bala9\\git\\repository\\Raptor\\extentReport\\myreport.html");
      ExtentReports extent=new ExtentReports();
		//give settings of report
      spark.config().setDocumentTitle("raptor report");
		spark.config().setReportName("extent report");
		spark.config().setTheme(Theme.DARK);
		extent.attachReporter(spark);
		
		
		//create test into reports
		ExtentTest test=extent.createTest("verify third party is clickble");
		//give various status of test steps
		test.info(MarkupHelper.createLabel("login page is displayed", ExtentColor.BLUE));
		test.pass(MarkupHelper.createLabel("element is displayed", ExtentColor.GREEN));
		test.fail(MarkupHelper.createLabel("third party button is not clickble", ExtentColor.RED));
		
		
		//save the report
		extent.flush();
	}

}
