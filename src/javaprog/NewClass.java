package javaprog;

public class NewClass
{
	int a=20;
	int b=30;
	
	 int c=a+b;
	
public void output() //method
{
	System.out.println(" the addition of two numbers:"+c);
}

	public static void main(String[] args)
	{
		 NewClass s1=new  NewClass();
		 s1.output();

	}

}
