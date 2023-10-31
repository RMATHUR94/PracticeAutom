package com.dev.addby.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dev.addby.base.TestBase;

public class UserBookingPage extends TestBase{

	@FindBy(css = "input[placeholder='Book Service']")
	WebElement Booknowbtn;
	
	@FindBy(xpath = "input[placeholder='Book Service']")
	WebElement BookServiceTime;
	

	public UserBookingPage()
	{
		PageFactory.initElements(driver, this);
	}
	
//	public UserPaymentPage BookingServiceForNow()
//	{
//		
//	}
}
