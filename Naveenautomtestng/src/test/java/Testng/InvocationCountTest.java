package Testng;

import org.testng.annotations.Test;

import io.netty.util.internal.SystemPropertyUtil;

public class InvocationCountTest 
{
     @Test(invocationCount = 10)
     public void sum()
     {
    	 int a = 10;
    	 int b = 20;
    	 int c = a+b;
    	 System.out.println("Sum is ====" + c);
     }
}
