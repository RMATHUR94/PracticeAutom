package Testng;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest {

	//if you wanted to handel testNg exception(without try catch block) , how did you handel?.
	@Test(invocationTimeOut=2, expectedExceptions = NumberFormatException.class) //2 miliseconds
	public void infiniteloopTest()
	{
		int i = 1;
		while(i==1)
		{
			System.out.println(i);
		}
	}
	
	@Test(expectedExceptions = NumberFormatException.class)
	public void test1()
	{
		String x = "100A";
		Integer.parseInt(x);
	}
}
