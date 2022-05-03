package com.dd;


import org.testng.annotations.Test;

import com.Daimi.GenericLib.BaseTest;
import com.Daimi.GenericLib.FileLib;
import com.Daimi.pages.LoginPage;

public class ValidLoginTest extends BaseTest{

	@Test
public	void verifyloginTest() throws Throwable
	{
		LoginPage lp=new LoginPage();
		FileLib fl=new FileLib();
		//lp.loginToApp(fl.readPropertyData(PROP_PATH, "username"), fl.readPropertyData(PROP_PATH, "password"));
	lp.loginToApp(fl.readPropertyData(PROP_PATH, "username"),fl.readPropertyData(PROP_PATH, "password") );	
	
	
	
	}
}
