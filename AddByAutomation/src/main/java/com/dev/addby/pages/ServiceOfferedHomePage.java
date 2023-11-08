package com.dev.addby.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.dev.addby.base.TestBase;

public class ServiceOfferedHomePage extends TestBase {
	// Page Factory - OR -- PageLib
	
	@FindBy(xpath = "(//div[@class='mantine-Container-root mantine-a3uu5s']//button[@type='button'])[2]")
	WebElement Cookingviewall;

	@FindBy(xpath = "(//span[text()='Book Now'])[1]")
	WebElement Booknowbtn;
	
	public ServiceOfferedHomePage() {
		PageFactory.initElements(driver, this);
	}

	public ServiceListing SelectCookingService() 
	{
		WebDriverWait wait = new WebDriverWait (driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(Cookingviewall)).click();
		
	    wait.until(ExpectedConditions.elementToBeClickable(Booknowbtn)).click();
		
		return new ServiceListing();
	}

}
