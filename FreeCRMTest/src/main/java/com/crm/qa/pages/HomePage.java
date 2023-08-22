package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {

	
	@FindBy(xpath = "td[contains(text(),'User: Remz Martinez')]")
	WebElement UserNameLabel;
	
	@FindBy(xpath = "//a[contains(text(),'Contacts')]")
	WebElement ContactsLink;
	
	@FindBy(xpath = "//a[contains(text(),'Deals')]")
	WebElement DealsLink;
	
	@FindBy(xpath = "//a[contains(text(),'Tasks')]")
	WebElement TaskLink;
	
	@FindBy(xpath = "//a[contains(text(),'New Contact')]")
	WebElement NewContactsLink;
	//initializing the page object
	public HomePage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public String verifyHomePageTitle()
	{
		return driver.getTitle();	
	}
	
	public boolean verifyUserName()
	{
		return UserNameLabel.isDisplayed();
	}
	
	public ContactsPage clickOnContactsPage()
	{
		ContactsLink.click();	
		return new ContactsPage();
	}
	
	public DealsPage clickOnDealsPage()
	{
		DealsLink.click();	
		return new DealsPage();
	}
	public TaskPage clickOnTaskLink()
	{
		TaskLink.click();	
		return new TaskPage();
	}
	
	public void clikcOnNewContactsLink()
	{
		Actions action = new Actions(driver);  
		action.moveToElement(ContactsLink).build().perform();
		NewContactsLink.click();
		
	}
	
}
