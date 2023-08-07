package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	 
	 //Page Factory - OR -- PageLib
      @FindBy(name = "email")
      WebElement emailId ;
     
      @FindBy(name = "password")
      WebElement Password ;
      
      @FindBy(xpath = "//div[@class='ui fluid large blue submit button']")
      WebElement LoginBtn;
      
      @FindBy(linkText = "Sign Up")
      WebElement SignUp;
      
      public LoginPage()
      {
    	  PageFactory.initElements(driver, this);
      }
      
      public String validateLoginPageTitle()
      {
    	 return  driver.getTitle();
    	 
      }
      
      public HomePage Login(String un , String pas)
      {
    	  emailId.sendKeys(un);
    	  
    	  Password.sendKeys(pas);
    	  LoginBtn.click();
    	  
    	  return new HomePage();
      }
}
