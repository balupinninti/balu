package verifyleadspage;

import org.testng.annotations.Test;

import com.Daimi.GenericLib.BaseTest;
import com.Daimi.GenericLib.WebDriverCommonLib;
import com.Daimi.pages.HomePage;
import com.Daimi.pages.LeadsPage;
import com.Daimi.pages.ValidLoginTest;

public class VerifyLeadsTextPage extends BaseTest{
	
@Test
	public void clickleadtab() throws Throwable
	{
	ValidLoginTest vl=new ValidLoginTest();  
		vl.verifyloginTest();
		HomePage hp= new HomePage();
		hp.clickLeadsTab();
		LeadsPage lp=new LeadsPage();
		
		Thread.sleep(3000);
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.elementDisplayed(lp.getLeadstxt(), "leads page");
		
		
		
		
	}
	
	
   
	
}
