package constuctor;

public class DefConstEx1 
{
	int rlno,age;
	String name;
	
	public DefConstEx1()

	{
		rlno=1;
		age=24;
		name="pradip";
		
	}
	public void display()
	{
		System.out.println("roll number"+rlno);
		System.out.println("age is"+age);
		System.out.println("name is"+name);
	}
	
	public static void main(String[] args) 
	{
		DefConstEx1  dd=new DefConstEx1();
		dd.display();

	}

}
