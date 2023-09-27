package com.dev.addby.v1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

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
		js.executeScript("window.scrollBy(0,350)", "");
		List<WebElement> services =	driver.findElements(By.cssSelector("h4.mantine-Text-root.mantine-Title-root.title.mantine-1wius5d"));
	    
		for(int i=0;i<services.size();i++)
		{
			String name = services.get(i).getText();
			
			if(name.contains("Caregiving"))
			{
				WebElement element = driver.findElements(By.xpath("//span[text()='Book Now']")).get(i);
				JavascriptExecutor js1 = (JavascriptExecutor)driver;
				js1.executeScript("arguments[0].click()", element);
				break;
			}
		}
		
		driver.findElement(By.xpath("(//span[@class='mantine-1ryt1ht mantine-Button-label'][normalize-space()='View Profile'])[1]")).click();
		WebElement finalbook = driver.findElement(By.xpath("(//span[normalize-space()='Book now'])[1]"));
		JavascriptExecutor js2= (JavascriptExecutor)driver;
		js2.executeScript("arguments[0].click()", finalbook);  
		
		//clicking on subcription button.
		
		WebElement subscription_button = driver.findElement(By.xpath("//*[text()='Subscribe now']"));
		subscription_button.click();
		
		//clicking on ok pop up
		driver.findElement(By.xpath("//*[text()='OK']")).click();
		
		//clicking on trial subscription
		driver.findElement(By.xpath("(//*[text()='Choose'])[2]")).click();
		
		//clicking on 30 sept 
		//driver.findElement(By.xpath("//button[@aria-label='29 September 2023']")).click();
		
		//clicking on time-slot
		driver.findElement(By.xpath("//div[@class='mantine-Text-root mantine-1oradq5'][normalize-space()='3:00 PM - 3:10 PM']")).click();
		
//		//sending address value
//		driver.findElement(By.cssSelector("#mantine-n8q54uuny")).sendKeys("Abc street");
		
	    
		String MonthYearVal = driver.findElement(By.xpath("//button[normalize-space()='September 2023']")).getText();
		String month = MonthYearVal.split(" ")[0].trim();
		String year =  MonthYearVal.split(" ")[1].trim();
		
		while(!(month.equals("November") && year.equals("2023")))
		{
			driver.findElement(By.xpath("//button[@data-next='true']//*[name()='svg']")).click();
			 month = MonthYearVal.split(" ")[0].trim();
			 year =  MonthYearVal.split(" ")[1].trim(); 
		}
		driver.findElement(By.cssSelector("button[aria-label='10 November 2023']")).click();
		
	}

}
