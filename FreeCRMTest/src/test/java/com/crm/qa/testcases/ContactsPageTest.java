package com.crm.qa.testcases;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class ContactsPageTest extends TestBase {

	LoginPage loginPage;
	HomePage HomePage;
	TestUtil testUtil;
	ContactsPage contactPage;

	String sheetName = "contacts"; 
	
	public ContactsPageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		testUtil = new TestUtil();
		loginPage = new LoginPage();
		contactPage = new ContactsPage();
		HomePage = loginPage.Login(prop.getProperty("username2"), prop.getProperty("password"));
		testUtil.switchToFrame();
		contactPage = HomePage.clickOnContactsPage();
	}

	@Test(priority = 1)
	public void verifyContactsPageLabel() {
		boolean flag = contactPage.vefifyContactsLabel();
		Assert.assertTrue(flag, "contacts lebel is mission on the page");
	}
	
	@DataProvider
	public Object[][] GetCrmTestData() throws InvalidFormatException
	{
		Object data[][] = testUtil.getTestData(sheetName);
		return data;
	}
	
	
	
	@Test(priority=2, dataProvider = "GetCrmTestData")
	public void validateCreateNewContact(String title , String firstname , String lastname , String company) throws InterruptedException
	{
		testUtil.switchToFrame();
		HomePage.clikcOnNewContactsLink();
		//contactPage.createNewContact("Mr.", "Tom", "Peter", "Google");
		contactPage.createNewContact(title, firstname, lastname, company);
		
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
