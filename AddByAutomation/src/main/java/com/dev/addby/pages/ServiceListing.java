package com.dev.addby.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.dev.addby.base.TestBase;

public class ServiceListing extends TestBase 
{
	//Mike Francis lewis profile
	@FindBy(xpath = "(//a[@type='button'])[1]")
	WebElement firstListProfileResult;
	
	@FindBy(xpath = "//a[@class='mantine-UnstyledButton-root mantine-Button-root mantine-xe2rme']")
	WebElement Booknowbtn;
	
	public ServiceListing()
	{
		PageFactory.initElements(driver, this);
	}
	
	public UserProfilePage UserViewProfile()
	{
		WebDriverWait wait = new WebDriverWait (driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(firstListProfileResult)).click();
		return new UserProfilePage();	
	}
	
	public UserBookingPage UserBook()
	{
		Booknowbtn.click();
		return new UserBookingPage();
	}
	
}
