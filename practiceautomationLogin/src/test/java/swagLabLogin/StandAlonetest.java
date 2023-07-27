package swagLabLogin;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class StandAlonetest {

	WebDriver driver;
	@Test
	public void flowAll()
	{
		System.setProperty("webdriver.chrome.driver",
				"/home/vyrazu-66/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.saucedemo.com/");
		
		String username = "standard_user";
		String password = "secret_sauce";
		String name = "RAHUL";
		String lastname = "Mathur";
		String pincode = "713104";
		
		driver.findElement(By.id("user-name")).clear();
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();
		

		//Selecting the Bag
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		//Scrolling on the page
		JavascriptExecutor jse =(JavascriptExecutor)driver;
     	jse.executeScript("window.scrollBy(0,400)");
		//clicking on orange shirt
		driver.findElement(By.xpath("//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")).click();
		
		//clicking on shopping cart link
		
		jse.executeScript("window.scrollBy(0,-400)");
	
		//invoking explicit wait for clicking cart button top left corner
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='shopping_cart_link']"))).click();
		
		//clicking check out button.

		driver.findElement(By.id("checkout")).click();

		//customer form
		driver.findElement(By.name("firstName")).sendKeys(name);
		driver.findElement(By.name("lastName")).sendKeys(lastname);
		driver.findElement(By.id("postal-code")).sendKeys(pincode);

		// clicking continue button
		driver.findElement(By.id("continue")).click();

		//scrolling again
		jse.executeScript("window.scrollBy(0,400)");
		
		// clicking on finish button
		
		driver.findElement(By.cssSelector(".cart_button")).click();
		
		//Collecting final text and printing it on the console
		
		String finaltext = driver.findElement(By.cssSelector(".complete-header")).getText();
		System.out.println(finaltext);

		
	}
	
}
