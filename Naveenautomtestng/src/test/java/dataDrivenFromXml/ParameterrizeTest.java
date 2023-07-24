package dataDrivenFromXml;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterrizeTest {
	WebDriver driver;

	@Test(priority =1)
	@Parameters({"browser", "url", "emailid"})
	public void DatapullFromTextng(String browser, String url, String emailid) {
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"/home/vyrazu-66/Downloads/chromedriver_linux64/chromedriver");
			driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
		    driver.findElement(By.id("login-username")).clear();
	     	driver.findElement(By.id("login-username")).sendKeys(emailid);
	     	driver.findElement(By.id("login-signin")).click();
		}
		else if(browser.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver",
					"/home/vyrazu-66/Downloads/geckodriver-v0.32.0-linux-aarch64/geckodriver");
			driver = new FirefoxDriver();
			driver.get(url);
			driver.manage().window().maximize();
			driver.findElement(By.id("login-username")).clear();
			driver.findElement(By.id("login-username")).sendKeys(emailid);
		}
	}

}
