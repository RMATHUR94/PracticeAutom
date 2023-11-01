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

public class UserPaymentPageTest extends TestBase {

	LoginPage loginpage;
	ServiceOfferedHomePage serviceofferhomepage;
	ServiceListing servicelistpage;
	UserProfilePage userprofile;
	UserBookingPage userbookingpage;
	UserPaymentPage userpaymentPage;

	public UserPaymentPageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		loginpage = new LoginPage();
		servicelistpage = new ServiceListing();
		userprofile = new UserProfilePage();
		userbookingpage = new UserBookingPage();

		serviceofferhomepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		servicelistpage = serviceofferhomepage.SelectCookingService();
		userprofile = servicelistpage.UserViewProfile();
		userbookingpage = userprofile.UserBook();
	}

	@Test
	public void BookingServiceForNowTest() {
	   userpaymentPage.ProceedToPaymentTest();
	}
}
