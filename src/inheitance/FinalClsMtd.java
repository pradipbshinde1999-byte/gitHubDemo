package inheitance;
class SuperCls
{
	public void show()
	{
		System.out.println("this is super class here");
	}
}
class Apple
{
	final public void display()
	{
		System.out.println("Apple");
	}
}
class Grapes extends Apple
{
//	public void display()
//	{
//		
//	}
}
class SubCls extends SuperCls
{
	
}
public class FinalClsMtd
{
  final int a=26;
  public void view()
  {
	 // a=22;

	}

}
