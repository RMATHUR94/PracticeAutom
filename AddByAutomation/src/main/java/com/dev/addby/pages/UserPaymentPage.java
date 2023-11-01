package com.dev.addby.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dev.addby.base.TestBase;

public class UserPaymentPage extends TestBase {

	@FindBy(xpath = "//h2[@class='mantine-Text-root mantine-Title-root mantine-1a272oh']")
	WebElement PaymentstatusTop;

	@FindBy(xpath = "(//div[@class='mantine-Text-root mantine-1nx2p9j'])[1]")
	WebElement BookingTimeStamp;

	@FindBy(xpath = "(//*[text()='Proceed to Payment']")
	WebElement PaymentBtn;

	public UserPaymentPage() {
		
		PageFactory.initElements(driver, this);
	}

	public void ProceedToPaymentTest()
	{
		String PaymentstatusTopText = PaymentstatusTop.getText();
		System.out.println(PaymentstatusTopText);
		String PaymentstatusTopTextStamp = BookingTimeStamp.getText();
		System.out.println(PaymentstatusTopTextStamp);
		//PaymentBtn.click();
		
	}
}
