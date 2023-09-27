package com.dev.addby.v1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SubscriptionAPP {

	public static void main(String[] args) {
		 

		System.setProperty("webdriver.chrome.driver", "/home/vyrazu-66/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://deploy-preview-40--aidby-app.netlify.app/login");
		driver.findElement(By.name("email")).sendKeys("bradwill01@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Brad@1234");
		driver.findElement(By.xpath("//button[@type='submit']//div[@class='mantine-1wpc1xj mantine-Button-inner']"))
				.click();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector(
				"button[class='mantine-UnstyledButton-root mantine-Button-root mantine-1330g2d'] span[class='mantine-1ryt1ht mantine-Button-label']"))
				.click();
		driver.findElement(By.cssSelector("button[class='mantine-UnstyledButton-root mantine-Button-root mantine-10lh3yd'] span[class='mantine-1ryt1ht mantine-Button-label']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	
		driver.findElement(By.xpath("(//span[@class='mantine-1ryt1ht mantine-Button-label'][normalize-space()='Choose'])[2]")).click();
		
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='mantine-eosk00n3b']")));
//		element.sendKeys("TestName");
//		
		
		driver.findElement(By.name("first_name")).sendKeys("TestName");
		driver.findElement(By.name("last_name")).sendKeys("TestLastName");
	    driver.findElement(By.name("card_number")).sendKeys("4012888888881881");
	    driver.findElement(By.name("cvv")).sendKeys("789");
	    driver.findElement(By.xpath("//div[@class='mantine-Input-wrapper mantine-MonthPickerInput-wrapper mantine-1v7s5f8']")).click();
	    driver.findElement(By.xpath("//button[contains(text(),'May')]")).click();
	    driver.findElement(By.cssSelector(".mantine-Input-wrapper.mantine-YearPickerInput-wrapper.mantine-1v7s5f8")).click();
	    driver.findElement(By.xpath("//*[text()='2027']")).click();
	    driver.findElement(By.xpath("//*[text()='Submit']")).click();
	    

	    
	}

}
