package com.dev.addby.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.dev.addby.base.TestBase;
import com.dev.addby.pages.LoginPage;
import com.dev.addby.pages.ServiceOfferedHomePage;


public class LoginPagetest extends TestBase{
	
	
	LoginPage loginpage;
	ServiceOfferedHomePage serviceofferhomepage;
	
	public LoginPagetest()
	{
		super();
	}
	@BeforeMethod
	public void setup()
	{
		initialization();
		loginpage = new LoginPage();
	}
	@Test(priority =1)
	public void loginTest()
	{
		serviceofferhomepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
//	@AfterMethod
//	public void tearDown()
//	{
//		driver.quit();
//	}
}
