package com.dev.addby.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.dev.addby.base.TestBase;

public class UserPaymentPage extends TestBase {

	@FindBy(xpath = "//h2[@class='mantine-Text-root mantine-Title-root mantine-1a272oh']")
	WebElement PaymentstatusTop;

	@FindBy(xpath = "(//div[@class='mantine-Text-root mantine-1nx2p9j'])[1]")
	WebElement BookingTimeStamp;

	@FindBy(xpath = "(//*[text()='Proceed to Payment']")
	WebElement PaymentBtn;
	
	@FindBy(xpath = "//*[text()='OK']")
	WebElement Okbtn;

	public UserPaymentPage() {
		
		PageFactory.initElements(driver, this);
	}

	public UserPaymentPage ProceedToPayment()
	{
		String PaymentstatusTopText = PaymentstatusTop.getText();
		
		System.out.println(PaymentstatusTopText);
		
		String PaymentstatusTopTextStamp = BookingTimeStamp.getText();
		
		System.out.println(PaymentstatusTopTextStamp);
		
		//clicking on payment button
		PaymentBtn.click();
		
		//Getting text after Payment Completion
		WebDriverWait wait = new WebDriverWait(driver,30);
		
		//clicking of Ok button
		wait.until(ExpectedConditions.visibilityOf(Okbtn));
		Okbtn.click();
		
	    String PaymentstatusTopTextsuccess = PaymentstatusTop.getText();
		System.out.println(PaymentstatusTopTextsuccess);
		
		return new UserPaymentPage();
		
	
	}
}
