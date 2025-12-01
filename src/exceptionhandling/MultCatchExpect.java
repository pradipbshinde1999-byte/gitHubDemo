package exceptionhandling;

import java.util.Scanner;

public class MultCatchExpect 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number:");
		int no1=sc.nextInt();
		System.out.println("enter second numbber:");
		int no2=sc.nextInt();
		int result=0;
		try
		{
			result=no1/no2;
			System.out.println("result is:"+result);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
        catch(NullPointerException e)
		{
        	System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("end the programm here..");
	}

}
