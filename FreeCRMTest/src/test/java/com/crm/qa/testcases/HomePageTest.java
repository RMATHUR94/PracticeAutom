package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class HomePageTest extends TestBase{

	LoginPage loginPage; 
	HomePage HomePage;
	TestUtil testUtil;
	ContactsPage contactPage;
	
	public HomePageTest()
	{
		super();
	}
	//Test cases should be separated -- independent with each other
	//before each test case launch the browser and login
	//@test -- execute test case
	//after each testcase close the browser
	@BeforeMethod
	public void setup()
	{
		initialization();
		testUtil = new TestUtil();
		loginPage = new LoginPage();
		contactPage = new ContactsPage();
		HomePage = loginPage.Login(prop.getProperty("username2"), prop.getProperty("password"));
	}
	
	@Test(priority = 1)
	public void verifyHomePageTitleTest()
	{
		String homePageTitle = HomePage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "CRMPRO","Home page title not matched");
	}
	
	@Test(priority = 2)
	public void verifyUserNameTest()
	{
		testUtil.switchToFrame();
		boolean flag = HomePage.verifyUserName();
		Assert.assertTrue(flag);
	}
	
	@Test(priority = 3)
	public void verifyCOntactsLinkTest()
	{
		testUtil.switchToFrame();
		contactPage = HomePage.clickOnContactsPage();
		 
	}
	
	@AfterMethod
	public void tearDown() {
	      driver.quit();;
		}

}
