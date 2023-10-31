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
        

		WebDriverWait wait = new WebDriverWait (driver, 25);
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
		
//            String MonthYear = driver.findElement(By.cssSelector(".mantine-UnstyledButton-root.mantine-CalendarHeader-calendarHeaderLevel.mantine-DatePicker-calendarHeaderLevel.mantine-ooo895")).getText();		
//            System.out.println(MonthYear);
//            
//            String month = MonthYear.split(" ")[0];
//            String year =  MonthYear.split(" ")[1];
//            System.out.println(month);
//            System.out.println(year);
//   
//            while(!(month.equals("December") && year.equals("2023")))
//            {
//            	WebElement CalendarNextbtn = driver
//						.findElement(By.xpath("//button[@data-next='true']//*[name()='svg']"));
//            	WebDriverWait waittwo = new WebDriverWait(driver, 30);
//            	CalendarNextbtn.click();
//				String MonthYeartwo = driver.findElement(By.cssSelector(".mantine-UnstyledButton-root.mantine-CalendarHeader-calendarHeaderLevel.mantine-DatePicker-calendarHeaderLevel.mantine-ooo895")).getText();
//				String monthtwo = MonthYeartwo.split(" ")[0];
//	            String yeartwo =  MonthYeartwo.split(" ")[1];
//            } 
		 
		//UserBooking Page
		 WebElement BookServiceTime = driver.findElement(By.cssSelector("input[placeholder='Book Service']"));
		 // wait.until(ExpectedConditions.elementToBeClickable(BookServiceTime)).click();
		  BookServiceTime.click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[text()='For now']")).click();
		  driver.findElement(By.xpath("//ul[@class='mantine-1n60cd']//li[5]")).click();
		  
      }
	
	}
 

