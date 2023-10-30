package com.dev.addby.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dev.addby.base.TestBase;

public class UserProfilePage extends TestBase {
	 
	@FindBy(xpath = "//a[@class='mantine-UnstyledButton-root mantine-Button-root mantine-xe2rme']")
	WebElement Booknowbtn;
	
	public UserProfilePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public UserBookingPage UserBook()
	{
		Booknowbtn.click();
		return new UserBookingPage();
	}
}
