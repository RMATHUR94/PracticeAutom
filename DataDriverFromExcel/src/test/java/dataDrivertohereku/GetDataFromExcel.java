package dataDrivertohereku;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import dataDrivertohereku.HerekuloginDataprovider;

public class GetDataFromExcel {
	WebDriver driver;

	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver",
				"/home/vyrazu-66/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/login");
		
	}
	
	@Test(dataProvider = "excel-data" , dataProviderClass = HerekuloginDataprovider.class)
	public void signIn(String username , String password)
	{
	  driver.findElement(By.id("username")).sendKeys(username);
	  driver.findElement(By.id("password")).sendKeys(password);
	  driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in")).click();
	  String msg = driver.findElement(By.xpath("//div[@id='flash']")).getText();
	}

	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
}
