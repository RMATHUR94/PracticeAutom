package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.crm.qa.base.TestBase;
import com.crm.qa.util.TestUtil;

public class HomePage extends TestBase {
	
	TestUtil testUtil = new TestUtil();
	
	@FindBy(xpath = "td[contains(text(),'User: Remz Martinez')]")
	WebElement UserNameLabel;
	
	@FindBy(xpath = "//a[normalize-space()='Contacts']")
	WebElement contactsLink;
	
	@FindBy(xpath = "//a[contains(text(),'Deals')]")
	WebElement DealsLink;
	
	@FindBy(xpath = "//a[contains(text(),'Tasks')]")
	WebElement TaskLink;
	

	@FindBy(xpath = "//a[normalize-space()='New Contact']")
	WebElement newContactLink;
	
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
		contactsLink.click();	
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
	
	public void clikcOnNewContactsLink() throws InterruptedException
	{
		
		Actions action = new Actions(driver);  
		action.moveToElement(contactsLink).build().perform();
		
		new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(newContactLink)).click();

		
	}
	
}
