package com.dev.addby.v1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class App5 {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "/home/vyrazu-66/Downloads/chromedriver_linux64/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://aidby-app.netlify.app/login");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("anil.mahta01@yopmail.com");
		driver.findElement(By.name("password")).sendKeys("Test@1234");
		driver.findElement(By.xpath("//button[@type='submit']//div[@class='mantine-1wpc1xj mantine-Button-inner']"))
				.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
        

		WebDriverWait wait = new WebDriverWait (driver, 15);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='mantine-Container-root mantine-a3uu5s']//button[@type='button'])[2]")));
		element.click();
		
		//clicking on book now of  cooking
		driver.findElement(By.xpath("(//span[text()='Book Now'])[1]")).click();
		
		// clicking on search view profile button
		driver.findElement(By.xpath("(//a[@type='button'])[1]")).click();

		// clicking on book button
		try {
			driver.findElement(By.xpath("//a[@class='mantine-UnstyledButton-root mantine-Button-root mantine-xe2rme']"))
					.click();
		} catch (Exception e) {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", driver.findElement(
					By.xpath("//a[@class='mantine-UnstyledButton-root mantine-Button-root mantine-xe2rme']")));
		}
		
	
	}

}
