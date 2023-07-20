package Testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FacebookTest {
	WebDriver driver;

	@BeforeMethod
	public void Setup() {
		System.setProperty("webdriver.chrome.driver", "/home/vyrazu-66/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");

	}

	@Test(priority =1,groups="Title")
	public void test_title() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	@Test(priority =2,groups = "logo")
	public void googleLogotest() {
		boolean b = driver.findElement(By.className("lnXdpd")).isDisplayed();
		
	}

	@Test(priority =3, groups = "Linktext")
	public void Linktest() {
		boolean a = driver.findElement(By.linkText("Images")).isDisplayed();
	}
	
	@Test(priority =4, groups = "Test")
	public void test4() {
		System.out.println("Test4");
		
	}
	@Test(priority =5, groups = "Test")
	public void test5() {
        System.out.println("Test5");		
	}
	@Test(priority =6, groups = "Test")
	public void test6() {
			 System.out.println("Test6");	  			
		}		

	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
