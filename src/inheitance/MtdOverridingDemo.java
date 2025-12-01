package inheitance;
class Person
{
	public void show()
	{
		System.out.println("this is a person class");
	}
}
class Women extends Person
{
	public void show()
	{
		super.show();
		System.out.println("this is a womwen class here");
	}
}
public class MtdOverridingDemo
{

	public static void main(String[] args) 
	{
		Women w1=new Women();
		w1.show();

	}

}
