package com.dev.addby.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.dev.addby.base.TestBase;
import com.dev.addby.pages.LoginPage;
import com.dev.addby.pages.ServiceListing;
import com.dev.addby.pages.ServiceOfferedHomePage;
import com.dev.addby.pages.UserBookingPage;
import com.dev.addby.pages.UserPaymentPage;
import com.dev.addby.pages.UserProfilePage;



public class UserBookingPageTest extends TestBase{

	LoginPage loginpage;
	ServiceOfferedHomePage serviceofferhomepage;
	ServiceListing servicelistpage;
	UserProfilePage userprofile;
	UserBookingPage userbookingpage;
	
	
	public UserBookingPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginpage = new LoginPage();
		serviceofferhomepage = new ServiceOfferedHomePage();
		servicelistpage = new ServiceListing();
		userprofile = new UserProfilePage();
		userbookingpage = new UserBookingPage();
		

		serviceofferhomepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		servicelistpage = serviceofferhomepage.SelectCookingService();
		userprofile = servicelistpage.UserViewProfile();
		userbookingpage = userprofile.UserBook();
		
	}
	
	@Test
	public UserPaymentPage UserBookingServiceForNowTest() throws InterruptedException
	{
		userbookingpage.BookingServiceForNow();

		return new UserPaymentPage();
	}
	
//	@AfterMethod
//	public void tearDown()
//	{
//		driver.quit();
//	}
}
