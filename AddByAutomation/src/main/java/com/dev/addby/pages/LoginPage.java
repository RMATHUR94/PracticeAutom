package com.dev.addby.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dev.addby.base.TestBase;
import com.dev.addby.pages.ServiceOfferedHomePage;

public class LoginPage extends TestBase{

	//Page Factory - OR -- PageLib
	@FindBy(name="email")
	WebElement Email;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(xpath = "//img[@alt='Free CRM Software for customer relationship management, sales and support']")
	WebElement LoginBtn;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public ServiceOfferedHomePage login(String un, String pa)
	{
		Email.sendKeys(un);
		password.sendKeys(pa);
		
		return new ServiceOfferedHomePage();
	}
}
