package inheitance;
class Addsub
{
	int n1=20, n2=50, n3=0; //garbage value are not stored inside variable
	public void add()
	{
		n3=n1+n2;
		System.out.println("addition of numbers:"+n3);
	}
	public void sub()
	{
		n3=n1-n2;
		System.out.println("subtraction of:"+n3);
	 }
	}
class MultDiv extends Addsub
{
  int n1=40, n2=6, n3=0;//garbage value are not stored the inside the varible
  
	public void mult()
	{
		n3=n1*n2;
		System.out.println("multiplication of numbers:="+n3);
	}
	public void div()
	{
		n3=n1/n2;
		System.out.println("division of numbers:="+n3);
		
		}
}
class Modulus extends MultDiv
{
	int n1=300, n2=10, n3=0;
	public void mod()
	{
		n3=n1%n2;
		System.out.println("modulus of numbers:="+n3);
	}
	
			}
public class MultiLevelnheritance
{

	public static void main(String[] args) 
	{
		Modulus  m1=new Modulus(); //we create object sub class in inheritance
		
	m1.add();
	m1.sub();
	m1.mult();
	m1.div();
	m1.mod();
		

	}

}
