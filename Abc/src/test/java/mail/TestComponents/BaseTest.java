package mail.TestComponents;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseTest {

	String driverPath = "/home/vyrazu-66/Downloads/chromedriver_linux64 (1)/chromedriver";
	String driverPath2 = "/home/vyrazu-66/Downloads/geckodriver-v0.31.0-linux64/geckodriver";
	public static WebDriver driver;

//	    public static WebDriver driver ;

	@BeforeSuite
	public void initialize() {
		// set the system property for Chrome driver
		System.setProperty("webdriver.chrome.driver", driverPath);

		// set the system property using GekoDriver
		  //System.setProperty("webdriver.gecko.driver", driverPath2);
		//Create a new instance of the Firefox driver
//		FirefoxOptions options = new FirefoxOptions();
//		driver = new FirefoxDriver(options);

		// Create driver object for CHROME browser
		   driver = new ChromeDriver();

		// To maximize browser
		driver.manage().window().maximize();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		// To open open G-mail.
		driver.get("https://www.google.com/gmail/");
	}

	@AfterSuite
	public void TeardownTest() {
		BaseTest.driver.quit();
	}
}
