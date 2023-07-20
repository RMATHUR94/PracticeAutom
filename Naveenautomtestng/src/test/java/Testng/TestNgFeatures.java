package Testng;

import org.testng.annotations.Test;

public class TestNgFeatures {
 
	@Test
	public void loginTest()
	{
		System.out.println("login test");
		//int i = 9/0;
	}
	
	@Test(dependsOnMethods = "loginTest")
	public void HomePageTest()
	{
		System.out.println("login test");
	}
	
	@Test(dependsOnMethods = "loginTest")
	public void searchpageTest()
	{
		System.out.println("searching");
	}
	
	@Test(dependsOnMethods = "loginTest")
	public void RegistationPage()
	{
		System.out.println("searching");
	}
	
	
}
