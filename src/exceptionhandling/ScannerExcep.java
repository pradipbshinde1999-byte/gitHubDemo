package exceptionhandling;

import java.util.Scanner;

public class ScannerExcep 
{

	public static void main(String[] args) 
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the first number here..");
	  int num1=sc.nextInt();
	  System.out.println("enter second number here..");
	  int num2=sc.nextInt();
	  
	  int ans=0; //garbage vaule
	  
	  try
	  {
		  ans=num1/num2;
		  System.out.println("answer of the numbers is:="+ans);
	  }
	  catch(ArithmeticException e)
	  {
		  System.out.println();
		  
	  }
    System.out.println("after try catch block here..");
	}

}
