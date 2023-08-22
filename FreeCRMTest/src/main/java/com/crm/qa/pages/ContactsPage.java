package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase{

	@FindBy(xpath = "td[contains(text(),'Contacts')]")
	WebElement contactsLabel;	
	
	@FindBy(id = "first_name")
	WebElement firstName;
	
	@FindBy(id = "surname")
	WebElement lastName;
	
	@FindBy(name = "client_lookup")
	WebElement companyName;
	
	@FindBy(xpath = "//input[@type='submit' and value ='Save']")
	WebElement saveBtn;
	
	
	public ContactsPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public boolean vefifyContactsLabel()
	{
		return contactsLabel.isDisplayed();
	}
	
	public void createNewContact(String title,String ftname,String ltName, String comname)
	{
		Select select = new Select(driver.findElement(By.name("title")));
		select.selectByVisibleText(title);
		
		firstName.sendKeys(ftname);
		lastName.sendKeys(ltName);
		companyName.sendKeys(comname);
		saveBtn.click();
		
	}

}
