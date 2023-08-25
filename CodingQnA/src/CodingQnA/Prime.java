package CodingQnA;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	       
	       int firstRange = sc.nextInt();
	       int secndRange = sc.nextInt();
	       int count = 0;
	       int sum = 0;
	       
	       for(int number = firstRange ; number<=secndRange ; number++)
	       {
	          count = 0;
	        
	          for(int i = 2 ; i<=number/2 ; i++)
	          {
	        	if(number % i == 0)
	        	{
	        		count++;
	        		break;
	        	}
	          }
	          if(count ==0 && number != 1)
	          {
	        	  sum = sum + number;
	          }
	       }
	      System.out.println("the sum of between ranges :"+sum);     
	}
}
