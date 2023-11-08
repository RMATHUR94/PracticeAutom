package com.dev.addby.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.dev.addby.base.TestBase;
import com.dev.addby.pages.LoginPage;
import com.dev.addby.pages.ServiceListing;
import com.dev.addby.pages.ServiceOfferedHomePage;

public class ServiceOfferedHomePageTest extends TestBase
{
	LoginPage loginpage;
	ServiceListing servicelistpage;
	ServiceOfferedHomePage serviceofferhomepage;
	
	public ServiceOfferedHomePageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		loginpage = new LoginPage();
		servicelistpage = new ServiceListing();
		serviceofferhomepage = new ServiceOfferedHomePage();
		serviceofferhomepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@Test
	public void selectCookingServiceTest()
	{
		servicelistpage = serviceofferhomepage.SelectCookingService();
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
