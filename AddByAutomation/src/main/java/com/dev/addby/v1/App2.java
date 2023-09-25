package com.dev.addby.v1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App2 {

	public static void main(String[] args) {
		
	
		
		
		System.setProperty("webdriver.chrome.driver", "/home/vyrazu-66/Downloads/chromedriver_linux64/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://deploy-preview-40--aidby-app.netlify.app/login");
		driver.manage().window().maximize();
		//driver.findElement(By.name("email")).sendKeys("bradwill01@gmail.com");
		driver.findElement(By.name("email")).sendKeys("timcook01@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Tim@1234");
		driver.findElement(By.xpath("//button[@type='submit']//div[@class='mantine-1wpc1xj mantine-Button-inner']"))
				.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector(
				"button[class='mantine-UnstyledButton-root mantine-Button-root mantine-1330g2d'] span[class='mantine-1ryt1ht mantine-Button-label']"))
				.click();
//	      driver.findElement(By.cssSelector("input[placeholder='Pick one']")).click();
//	      driver.findElement(By.xpath("//*[text()='Male']")).click();
//    	  driver.findElement(By.cssSelector("button[type='submit'] span[class='mantine-1ryt1ht mantine-Button-label']")).click();

		driver.findElement(By.name("userAddress")).sendKeys("RBC street");
		driver.findElement(By.cssSelector("input[placeholder='Select Country']")).click();
		driver.findElement(By.xpath("//*[text()='US']")).click();
		driver.findElement(By.cssSelector("input[placeholder='Select State']")).click();
		driver.findElement(By.xpath("//*[text()='New York']")).click();
		driver.findElement(By.cssSelector("input[placeholder='Select City']")).click();
		driver.findElement(By.xpath("//*[text()='Lancaster']")).click();
		driver.findElement(By.name("userZipCode")).sendKeys("7895412");

		//------Verification--------
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,250)", "");
//		driver.findElement(By.cssSelector("#mantine-cla2s7qxc")).click();
		
		driver.findElement(By.cssSelector(
				"form[autocomplete='off'] button[type='submit'] span[class='mantine-1ryt1ht mantine-Button-label']"))
				.click();

		// logout
		driver.findElement(By.xpath("//div[normalize-space()='Logout']")).click();	
	}
}
