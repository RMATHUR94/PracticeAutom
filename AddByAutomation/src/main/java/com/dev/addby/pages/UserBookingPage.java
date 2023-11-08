package com.dev.addby.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.dev.addby.base.TestBase;

public class UserBookingPage extends TestBase{

	@FindBy(css = "input[placeholder='Book Service']")
	WebElement BookServiceTime;
	
	@FindBy(xpath = "//*[text()='For now']")
	WebElement ForNow;
	
	@FindBy(xpath = "//ul[@class='mantine-1n60cd']//li[1]")
	WebElement TimeSlotsevenToeight;
	
	@FindBy(xpath = "//ul[@class='mantine-1n60cd']//li[2]")
	WebElement TimeSlotelevenToTwelve;

	@FindBy(xpath = "//ul[@class='mantine-1n60cd']//li[3]")
	WebElement TimeSlotTwoToThree;
	
	@FindBy(xpath = "//ul[@class='mantine-1n60cd']//li[4]")
	WebElement TimeSlotThreeToFour;
	
	@FindBy(xpath = "//ul[@class='mantine-1n60cd']//li[5]")
	WebElement TimeSlotfiveTosix;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement BookNowBtn;
	
	
	public UserBookingPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public UserPaymentPage BookingServiceForNow() throws InterruptedException
	{
		 BookServiceTime.click();
		 Thread.sleep(2000);
		
		/*
		 * WebDriverWait wait = new WebDriverWait(driver , 10);
		 * 
		 * wait.until(ExpectedConditions.elementToBeClickable(ForNow));
		 */
		
		  ForNow.click();
		
		  WebDriverWait wait = new WebDriverWait(driver,10); //all waits are newly added
		  
		  wait.until(ExpectedConditions.elementToBeClickable(TimeSlotTwoToThree)).click(); 
		 
		  //TimeSlotTwoToThree.click();
		    wait.until(ExpectedConditions.elementToBeClickable(BookNowBtn)).click();
		  //BookNowBtn.click();
		
		  return new UserPaymentPage();
	    
		
	}
	
}
