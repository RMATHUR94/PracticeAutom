package autom.BaseT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.netty.util.internal.SystemPropertyUtil;

public class BaseTest {

	String driverPath = "/home/vyrazu-66/Downloads/chromedriver_linux64 (1)/chromedriver";
	public static WebDriver driver;

	@BeforeSuite
	public void initialize() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		driver.get("https://www.goibibo.com/");
        //cross button
//		driver.findElement(By.xpath("//span[@role='presentation']")).click();
//        //one way button selector
//		driver.findElement(By.cssSelector(".sc-12foipm-82.gKWNCi")).click();
//        //Source Dest
//		WebElement source = driver.findElement(By
//				.cssSelector("div[class='sc-12foipm-34 dVpEne'] p[class='sc-12foipm-27 bhYNaI fswWidgetPlaceholder']"));
//		Actions act = new Actions(driver);
//		act.click(source).perform();
//		act.sendKeys(source, "Bengaluru").perform();
//		act.pause(2000).perform();
//		// act.sendKeys(source, Keys.ARROW_DOWN).perform();
//		act.sendKeys(Keys.ENTER).perform();
//
//		WebElement dest = driver.findElement(By
//				.cssSelector("div[class='sc-12foipm-34 gmkrNR'] p[class='sc-12foipm-27 bhYNaI fswWidgetPlaceholder']"));
//		act.click(dest).perform();
//		act.sendKeys(dest, "Delhi").perform();
//		act.pause(2000).perform();
//		//act.sendKeys(dest, Keys.ARROW_DOWN).perform();
//		act.sendKeys(Keys.ENTER).perform();

		String MonthToBeSelected = "August 2023";
		int DAY = 5;
		
//		//for static selection of date
//		driver.findElement(By.cssSelector(" div[aria-label='Tue Jun 27 2023'] p[class='fsw__date']")).click();
//		//for clicking done button
//		driver.findElement(By.cssSelector("span[class='fswTrvl__done']")).click();
//		//
//		driver.findElement(By.xpath("(//*[name()='svg'])[5]")).click();
//		
//		driver.findElement(By.cssSelector("div[class='sc-12foipm-14 bOwCin'] li:nth-child(2)")).click();
//		
//		driver.findElement(By.cssSelector(".sc-12foipm-76.fvsOuM")).click();
//		
//		driver.findElement(By.cssSelector(".sc-12foipm-91.bwfKFn")).click();

  
//      while(true) 
//    {
//           String monthOnPage = driver.findElement(By.xpath("//div[@class='DayPicker-Caption' and @role='heading']")).getText();
//					
//         if (monthOnPage.equals(MonthToBeSelected)) 
//           {
//        	   
//				 break;
//	       } else
//			  {
//				   driver.findElement(
//					             	By.xpath("//span[@role='button' and @class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
//			  }
//            
//	   }
//     
//       
         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      
		//Clicking over the DAY variable date
		//driver.findElement(By.xpath("//div[@class='DayPicker-Week']/div[@class='DayPicker-Day']/div[text()=" + DAY + "]")).click();
	     driver.findElement(By.cssSelector(" div[aria-label='Sat Aug 05 2023'] p[class='fsw__price']")).click();
		 


//	@AfterSuite
//	public void TeardownTest()
//	{
//		BaseTest.driver.quit();
	}
}
