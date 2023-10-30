package com.dev.addby.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dev.addby.base.TestBase;

public class LoginPage extends TestBase{

	//Page Factory - OR -- PageLib
	@FindBy(name="email")
	WebElement Email;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']//div[@class='mantine-1wpc1xj mantine-Button-inner']")
	WebElement LoginBtn;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public ServiceOfferedHomePage login(String un, String pa)
	{
		Email.sendKeys(un);
		password.sendKeys(pa);
		LoginBtn.click();	
		return new ServiceOfferedHomePage();
	}
}
