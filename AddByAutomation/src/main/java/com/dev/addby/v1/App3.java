package com.dev.addby.v1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/home/vyrazu-66/Downloads/chromedriver_linux64/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://deploy-preview-40--aidby-app.netlify.app/login");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("bradwill01@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Brad@1234");
		driver.findElement(By.xpath("//button[@type='submit']//div[@class='mantine-1wpc1xj mantine-Button-inner']"))
				.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector(
				"button[class='mantine-UnstyledButton-root mantine-Button-root mantine-1330g2d'] span[class='mantine-1ryt1ht mantine-Button-label']"))
				.click();
		
		driver.findElement(By.xpath("(//span[contains(text(),'View All')])[1]")).click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)", "");
		
		List<WebElement>  products = driver.findElements(By.className("mantine-Grid-col mantine-ght165"));
		System.out.println(products.size());
		
		

	}

}
