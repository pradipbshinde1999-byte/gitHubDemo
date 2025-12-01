package inheitance;
class Device //super class
{
	public void Elec()
	{
		System.out.println("\n this is a electronic device here:");
	}
}
class Laptop extends Device //sub class
{
	public void lapy()
	{
		System.out.println("this is a laptop class:");
	}
}
class  Computer extends Device //sub class
{
	public void pc()
	{
		System.out.println("this is a pc class here:");
	}
}
class Tab extends Device //sub class
{
	public void tab()
	{
		System.out.println("this is a tab class:");
	
	}
}
public class HierahicalInherEx 
{

	public static void main(String[] args) 
	{
	Computer c1=new Computer();
	c1.Elec();
	c1.pc();
	Laptop l1=new Laptop();
	l1.Elec();
	l1.lapy();
	Tab t1=new Tab();
	t1.Elec();
	t1.tab();

	}

}
