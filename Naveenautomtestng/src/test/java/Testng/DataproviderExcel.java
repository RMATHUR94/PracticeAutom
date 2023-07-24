package Testng;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.utility.TestUtil;

public class DataproviderExcel {

	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver",
				"/home/vyrazu-66/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://demo.automationtesting.in/Register.html");
		
	}
	
	
	@DataProvider
	public Iterator<Object[]> getTestData() throws IOException
	{
		ArrayList<Object[]> testdata = TestUtil.getDataFromExcel();
		return testdata.iterator();
	}
	
	
	
	
	
	
	
	@Test(dataProvider ="getTestData")
	public void EbayRegPageTest(String firstname , String lastname ,String address ,String Email,String phone,String Password , String ConfirmPassword)
	{
	
	   driver.findElement(By.xpath("//input[@placeholder='First Name']")).clear();
	   driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(firstname);
	   
	   driver.findElement(By.xpath("//input[@placeholder='Last Name']")).clear();
	   driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(lastname);
	   
	   driver.findElement(By.cssSelector(".form-control.ng-valid.ng-dirty.ng-valid-parse.ng-touched[rows='3']")).clear();
	   driver.findElement(By.cssSelector(".form-control.ng-valid.ng-dirty.ng-valid-parse.ng-touched[rows='3']")).sendKeys(address);

	   driver.findElement(By.cssSelector(" input[type='email']")).clear();
	   driver.findElement(By.cssSelector(" input[type='email']")).sendKeys(Email);
	   
	   driver.findElement(By.xpath("//input[@type='tel']")).clear();
	   driver.findElement(By.xpath("//input[@type='tel']")).sendKeys(phone);
	   
	   driver.findElement(By.cssSelector(" input[value='Male']")).click();
	   
	   driver.findElement(By.id("firstpassword")).sendKeys(Password);
	   driver.findElement(By.id("secondpassword")).sendKeys(ConfirmPassword);
	   
	   
	
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
}
