package com.dev.addby.v1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class App4 {

	public static void main(String[] args) {

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

//		driver.findElement(By.cssSelector(
//				"button[class='mantine-UnstyledButton-root mantine-Button-root mantine-1330g2d'] span[class='mantine-1ryt1ht mantine-Button-label']"))
//				.click();

		List<WebElement> servicesView = driver.findElements(
				By.xpath("//div[@class='mantine-Container-root mantine-a3uu5s']//button[@type='button']"));

		System.out.println(servicesView.size());

		// div[@class='mantine-Paper-root mantine-1g7sbpa']

		List<WebElement> ServiceBox = driver
				.findElements(By.xpath("//div[@class='mantine-Paper-root mantine-1g7sbpa']"));

		System.out.println(ServiceBox.size());

		List<WebElement> NameOfService = driver
				.findElements(By.xpath("//div[@class='mantine-Paper-root mantine-1g7sbpa']//h3"));

		System.out.println(NameOfService.size());

		for (int k = 0; k < NameOfService.size(); k++) {
			String name = NameOfService.get(k).getText();
			System.out.println(name);

			if (name.contains("Cooking")) {
				WebElement elementk = driver
						.findElements(By
								.xpath("//div[@class='mantine-Container-root mantine-a3uu5s']//button[@type='button']"))
						.get(k);
				JavascriptExecutor js1 = (JavascriptExecutor) driver;
				js1.executeScript("arguments[0].click()", elementk);
				break;
			}

		}

		WebElement element = driver.findElement(By.xpath("//span[text()='Book Now']"));
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click()", element);

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

		// a[@class='mantine-UnstyledButton-root mantine-Button-root mantine-xe2rme']

//		driver.findElement(By.xpath("(//span[contains(text(),'View All')])[1]")).click();
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,350)", "");
//		List<WebElement> services =	driver.findElements(By.cssSelector("h4.mantine-Text-root.mantine-Title-root.title.mantine-1wius5d"));
////	    
////		for(int i=0;i<services.size();i++)
////		{
////			String name = services.get(i).getText();
////			
////			{
////			WebElement element = driver.findElements(By.xpath("//span[text()='Book Now']")).get(i);
////				JavascriptExecutor js1 = (JavascriptExecutor)driver;
////				js1.executeScript("arguments[0].click()", element);
////				break;
////		}
////		}
//		
//		driver.findElement(By.xpath("(//span[@class='mantine-1ryt1ht mantine-Button-label'][normalize-space()='View Profile'])[1]")).click();
//		WebElement finalbook = driver.findElement(By.xpath("(//span[normalize-space()='Book now'])[1]"));
//		JavascriptExecutor js2= (JavascriptExecutor)driver;
//		js2.executeScript("arguments[0].click()", finalbook);  

		// clicking on subcription button.

//		WebElement subscription_button = driver.findElement(By.xpath("//*[text()='Subscribe now']"));
//		subscription_button.click();

		// clicking on ok pop up
//		  driver.findElement(By.xpath("//*[text()='OK']")).click();

		// clicking on trial subscription
//		   driver.findElement(By.xpath("(//*[text()='Choose'])[2]")).click();

		// clicking on 30 sept
		// driver.findElement(By.xpath("//button[@aria-label='29 September
		// 2023']")).click();

		// clicking on time-slot
		// driver.findElement(By.xpath("//div[@class='mantine-Text-root
		// mantine-1oradq5'][normalize-space()='3:00 PM - 3:10 PM']")).click();

//		//sending address value
//		driver.findElement(By.cssSelector("#mantine-n8q54uuny")).sendKeys("Abc street");

		String desiredMonth = "November";
		String desiredYear = "2023";

		boolean monthFound = false;

		while (!monthFound) {
			// Locate the current month and year within the calendar
			// explicit wait - to wait for the compose button to be click-able
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//button[normalize-space()='September 2023']")));
			String MonthYearVal = driver.findElement(By.xpath("//button[normalize-space()='September 2023']"))
					.getText();
			String month = MonthYearVal.split(" ")[0].trim();
			String year = MonthYearVal.split(" ")[1].trim();

			if (month.equals(desiredMonth) && year.equalsIgnoreCase(desiredYear)) {
				driver.findElement(By.xpath("//*[text()='14']")).click();
				monthFound = true;

			} else {
				WebElement CalendarNextbtn = driver
						.findElement(By.xpath("//button[@data-next='true']//*[name()='svg']"));
				CalendarNextbtn.click();
			}

		}
	}

}
