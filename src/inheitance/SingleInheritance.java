package inheitance;
class Student //parent class ---super class
{
	  public void display()
	  {
		  System.out.println("this is student class here:");
	  }
}
class Teacher extends Student //chiled class--sub class
{
	public void show()
	{
		System.out.println("this is a teacher class here:");
		
	}
}
public class SingleInheritance 
{

	public static void main(String[] args) 
	{
		Teacher t1=new Teacher();
		t1.display();
		t1.show();

	}

}
