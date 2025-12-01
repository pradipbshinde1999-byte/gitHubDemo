package abstraction;

import java.util.Scanner;

abstract class Fruits
{
	public void show()
	{
		System.out.println("this is fruits class here");
	}
	abstract public void frut();
	
}
class Apple extends Fruits
{

	@Override
	public void frut() 
	{
		
		System.out.println("this is apple fruit here");
	}
	
}
class Graphes extends Fruits
{

	@Override
	public void frut() 
	{
      System.out.println("this is grapes here");
		
	}
}
class Pineapple extends Fruits
{

	@Override
	public void frut() 
	{
		System.out.println("this is a pineapple here");
		
	}
}

	
public class AbstractionFruits 
{

	public static void main(String[] args) 
	{
		Fruits ftr;
		System.out.println("1.Apple\n2.Graphes\n3.Pineapple");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choise:");
		int ch=sc.nextInt();
		
		switch(ch)
		{
		case 1:ftr=new Apple();
		       ftr.show();
		       ftr.frut();
		       break;
		       
		case 2:ftr=new Graphes();
	          ftr.show();
	          ftr.frut();
	          break; 
	       
		case 3:ftr=new Pineapple();
	         ftr.show();
	         ftr.frut();
	         break; 
	       
	       default:System.out.println("Wrong choise,please enter right once..");
	       
	       
	       }

	}
}	


