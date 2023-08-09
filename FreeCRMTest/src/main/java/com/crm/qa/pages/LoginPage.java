package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	 
	 //Page Factory - OR -- PageLib
      @FindBy(name = "username")
      WebElement username ;
     
      @FindBy(name = "password")
      WebElement Password ;
      
      @FindBy(xpath = "//input[@value='Login']")
      WebElement LoginBtn;
      
      @FindBy(linkText = "Sign Up")
      WebElement SignUp;
      
      @FindBy(xpath = "//img[@alt='Free CRM Software for customer relationship management, sales and support']")
      WebElement crmLogo;
      
      public LoginPage()
      {
    	  PageFactory.initElements(driver, this);
      }
      
      public String validateLoginPageTitle()
      {
    	 return  driver.getTitle();
    	 
      }
      
      public boolean validateCRMImage()
      {
    	 return crmLogo.isDisplayed();
      }
      
      public HomePage Login(String un , String pas)
      {
    	  username.sendKeys(un);
    	  
    	  Password.sendKeys(pas);
    	  LoginBtn.click();
    	  
    	  return new HomePage();
      }
}
