package mail.Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailLogin {

	private WebDriver driver;

	@FindBy(id = "identifierId")
	private WebElement emailId;

	@FindBy(id = "identifierNext")
	private WebElement NextBtn1;

	@FindBy(xpath = "//input[@name='Passwd']")
	private WebElement passwordField;

	@FindBy(xpath = "//span[contains(text(),'Next')]")
	private WebElement NextBtn2;

	public GmailLogin(WebDriver webDriver) {
		this.driver = webDriver;
		PageFactory.initElements(driver, this);
	}

	public void perFormLogin(String Email, String pswd) {
		emailId.sendKeys(Email);
		NextBtn1.click();
		passwordField.sendKeys(pswd);
		NextBtn2.click();
	}

	public void verifyLogin() {
	}

}
