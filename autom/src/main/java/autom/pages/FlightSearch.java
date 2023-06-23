package autom.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightSearch {
	
	private WebDriver driver ;
	
	public FlightSearch(WebDriver webDriver)
	{
		this.driver = webDriver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath = "//span[@role='presentation']")
	private WebElement crossbtn;
	
	@FindBy(css = ".sc-12foipm-82.gKWNCi")
	private WebElement onewaybtn;
	
	@FindBy(css = ".div[class='sc-12foipm-34 dVpEne'] p[class='sc-12foipm-27 bhYNaI fswWidgetPlaceholder']")
	private WebElement source;
	
	@FindBy(css = "div[class='sc-12foipm-34 gmkrNR'] p[class='sc-12foipm-27 bhYNaI fswWidgetPlaceholder']")
	private WebElement dest;
	
	
	public void searchFlight(String From , String Dest , String MonthToBeSelected ,String DAY)
	
	{
		crossbtn.click();
		
		onewaybtn.click();
		
		Actions act = new Actions(driver);
		
		act.click(source).perform();
		act.sendKeys(source, From).perform();
		act.pause(2000).perform();
		act.sendKeys(Keys.ENTER).perform();
		
		act.click(dest).perform();
		act.sendKeys(dest, Dest).perform();
		act.pause(2000).perform();
		act.sendKeys(Keys.ENTER).perform();
		
	      while(true) 
	      {
	             String monthOnPage = driver.findElement(By.xpath("//div[@class='DayPicker-Caption' and @role='heading']")).getText();
	  					
	           if (monthOnPage.equals(MonthToBeSelected)) 
	             {
	          	   
	  				 break;
	  	       } else
	  			  {
	  				   driver.findElement(
	  					             	By.xpath("//span[@role='button' and @class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
	  			  }
	              
	  	   }
		
	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	      
			//Clicking over the DAY variable date
			//driver.findElement(By.xpath("//div[@class='DayPicker-Week']/div[@class='DayPicker-Day']/div[text()=" + DAY + "]")).click();
            //driver.findElement(By.cssSelector(" div[aria-label='Sat Aug 05 2023'] p[class='fsw__price']")).click();
		
		
	}

}

