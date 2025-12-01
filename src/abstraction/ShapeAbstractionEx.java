package abstraction;

import java.util.Scanner;

abstract class Shape
{
	float area;
	abstract public void calarea(); //non empty--blank
}
class Circle extends Shape
{
	int redius;
	Circle(int redius)
	{
		this.redius=redius;
	}
	@Override
	public void calarea()
	{
		area=3.14f*redius*redius;
		System.out.println("Area of circle is:="+area);
	}	
}
class Rectangle extends Shape
{
	int length,bredth;
	Rectangle(int length,int b)
	{
		this.length=length;
		bredth=b;
	}
	@Override
	public void calarea()
	{
		area=length*bredth;
		System.out.println("area of rectangle is:="+area);
		
		
	}
}
class Triangle extends Shape
{
	int base,height;
	Triangle(int b,int h)
	{
		base=b;
		height=h;
	}
	@Override
	public void calarea() 
	{
		area=0.5f*base*height;
		System.out.println("area of triangle:="+area);
	
		
	}
}
	public class ShapeAbstractionEx
	{

	public static void main(String[] args)
	{
      Shape str;
      System.out.println("1.area of circle:\n2.area of rectangle:"+"\n3.area of triangle is:");
      Scanner sc=new Scanner(System.in);
      System.out.println("enter your choise:");
      int ch=sc.nextInt();
      
      switch(ch)
      {
      case 1:str=new Circle(5);
            str.calarea();
            break;
            
      case 2:str=new Rectangle(6,7);
      str.calarea();
      break;
      
      case 3:str=new Triangle(9,8);
      str.calarea();
      break;
      
      default:System.out.println("wrong choise..");
      }
    		              
	}

}
