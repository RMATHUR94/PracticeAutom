package com.dev.addby.v1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class App {

	public static void main(String[] args) {
  
  System.setProperty("webdriver.chrome.driver",
			"/home/vyrazu-66/Downloads/chromedriver_linux64/chromedriver");
	
  WebDriver driver = new ChromeDriver();
  
  driver.get("https://app.aidby.com/login");
  
  driver.manage().window().maximize();
  
  driver.findElement(By.xpath("//a[@href='/register']")).click();
  
  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  //driver.findElement(By.name("userName")).sendKeys("Brad williams");
  driver.findElement(By.name("userName")).sendKeys("Time Cook");
  //driver.findElement(By.name("email")).sendKeys("bradwill01@gmail.com");
  driver.findElement(By.name("email")).sendKeys("timcook01@gmail.com");
  
  driver.findElement(By.name("mobile")).sendKeys("7885642547");
 
  WebElement SignupDropdown = driver.findElement(By.cssSelector("input[placeholder='Sign up as']"));
  
  SignupDropdown.click();

  driver.findElement(By.xpath("//*[text()='User']")).click();
  
  //driver.findElement(By.name("password")).sendKeys("Brad@1234");
  driver.findElement(By.name("password")).sendKeys("Tim@1234");

 
  driver.findElement(By.name("termsCondition")).click();
  
  driver.findElement(By.cssSelector(".mantine-1ryt1ht.mantine-Button-label")).click();
 
    
   }
}
